# Java基礎_vol_02_-Scanner によるコンソール入力-

`java.util.Scanner` を使って、キーボードからの入力を扱う方法を学ぶ授業用テキストです。
基本的な使い方から、実用的な応用パターンまでを 20 個のサンプルで段階的に解説します。

---

## 目次

1. [はじめに](#1-はじめに)
2. [Scanner の基本](#2-scanner-の基本)
3. [サンプル解説](#3-サンプル解説)
4. [演習問題](#4-演習問題)

---

## 1. はじめに

### 1.1 前提条件

このテキストは以下の知識・環境を持つ学生を対象としています。

**必要な知識:**
- 変数・型（`int` / `double` / `String` / `boolean`）の基本
- `if` 文・`switch` 文・`for` / `while` ループの基本

**必要な環境:**
- JDK 11 以上がインストールされていること
- IntelliJ IDEA（Community Edition 可）がインストールされていること

### 1.2 このテキストの目的

プログラムに「ユーザーからの入力」を受け取らせると、対話的なアプリケーションが作れます。
Java では `java.util.Scanner` クラスを使ってコンソール（キーボード）入力を読み取ります。
このテキストでは、入力の基本から、よくある落とし穴や実用パターンまでを学びます。

### 1.3 学習目標

- `Scanner` を生成し、文字列・整数・小数などを読み取れるようになる
- `nextInt()` の後の `nextLine()` 問題を理解し、対処できる
- `hasNextInt()` などで入力チェック（バリデーション）ができる
- ループと組み合わせて、対話型のコンソールアプリを作れる

---

## 2. Scanner の基本

### 2.1 Scanner の生成と利用の流れ

```java
import java.util.Scanner;          // ① import する

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ② 標準入力に接続

        System.out.print("名前: ");
        String name = scanner.nextLine();          // ③ 入力を読み取る

        System.out.println("こんにちは、" + name);

        scanner.close();                           // ④ 使い終わったら閉じる
    }
}
```

| 手順 | 内容 |
|------|------|
| ① import | `java.util.Scanner` を読み込む |
| ② 生成 | `new Scanner(System.in)` で標準入力に接続する |
| ③ 読み取り | `nextXxx()` メソッドで値を取得する |
| ④ クローズ | `close()` でリソースを解放する |

### 2.2 主なメソッド

| メソッド | 戻り値 | 説明 |
|---------|--------|------|
| `nextLine()` | `String` | 改行までの 1 行を読み取る |
| `next()` | `String` | 空白・改行までの 1 単語を読み取る |
| `nextInt()` | `int` | 整数を読み取る |
| `nextDouble()` | `double` | 小数を読み取る |
| `nextBoolean()` | `boolean` | `true` / `false` を読み取る |
| `hasNextLine()` | `boolean` | 次の行があるか確認する |
| `hasNextInt()` | `boolean` | 次が整数として読めるか確認する |
| `useDelimiter(...)` | `Scanner` | 区切り文字を変更する |

> **重要な落とし穴:** `nextInt()` や `nextDouble()` は行末の改行を読み残します。
> その直後に `nextLine()` を呼ぶと空文字になってしまうため、改行を読み飛ばす
> `nextLine()` を 1 回入れるのが定番の対策です（→ `Sample06.java`）。

---

## 3. サンプル解説

`src/` には 20 個のサンプルが入っています。基本から応用へ、順番に試してください。

### 基本編（入力の読み取り）

| # | ファイル | テーマ | 主なメソッド |
|---|---------|--------|-------------|
| 01 | `Sample01.java` | 文字列を 1 行入力する | `nextLine()` |
| 02 | `Sample02.java` | 整数を入力する | `nextInt()` |
| 03 | `Sample03.java` | 小数を入力する | `nextDouble()` |
| 04 | `Sample04.java` | 単語を入力する | `next()` |
| 05 | `Sample05.java` | 複数の値を一度に入力する | `nextInt()` × 複数 |

### 応用編（落とし穴・チェック・リソース管理）

| # | ファイル | テーマ | 主なメソッド |
|---|---------|--------|-------------|
| 06 | `Sample06.java` | `nextInt()` 後の `nextLine()` 問題と対策 | `nextInt()` + `nextLine()` |
| 07 | `Sample07.java` | 入力が整数か確認する | `hasNextInt()` |
| 08 | `Sample08.java` | 真偽値を入力する | `nextBoolean()` |
| 09 | `Sample09.java` | 複数行をループで入力する | `hasNextLine()` |
| 10 | `Sample10.java` | 合計と平均を求める | `nextInt()` + ループ |
| 11 | `Sample11.java` | try-with-resources で自動的に閉じる | `try(Scanner ...)` |
| 12 | `Sample12.java` | 区切り文字を変更する | `useDelimiter()` |
| 13 | `Sample13.java` | 正しい値まで再入力させる | `hasNextInt()` + ループ |

### 実践編（対話型アプリ）

| # | ファイル | テーマ | 主なメソッド |
|---|---------|--------|-------------|
| 14 | `Sample14.java` | メニュー選択 | `nextInt()` + `switch` |
| 15 | `Sample15.java` | 数当てゲーム | `Random` + `nextInt()` |
| 16 | `Sample16.java` | 簡易電卓 | `nextDouble()` + `next()` |
| 17 | `Sample17.java` | 文字列を Scanner で解析する | `new Scanner(String)` |
| 18 | `Sample18.java` | 終了ワードまで入力を受け付ける | `hasNextInt()` + 番兵 |
| 19 | `Sample19.java` | 入力フォーム（複数項目） | 複数の `nextXxx()` |
| 20 | `Sample20.java` | 成績判定アプリ（総合演習） | 総合 |

### 実行方法

```bash
# コンパイル（例: Sample01.java）
javac src/Sample01.java

# 実行（キーボード入力を待つので、コンソールから実行する）
java -cp src Sample01
```

IntelliJ IDEA では、各ファイルの `main` メソッド左の ▶ をクリックして実行できます。

---

## 4. 演習問題

### 演習 1: 2 つの数の足し算

整数を 2 つ入力し、その合計を表示するプログラムを作成してください。

<details>
<summary>解答例</summary>

```java
import java.util.Scanner;

public class Ex0201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 つ目の整数: ");
        int a = scanner.nextInt();
        System.out.print("2 つ目の整数: ");
        int b = scanner.nextInt();

        System.out.println("合計: " + (a + b));

        scanner.close();
    }
}
```

</details>

### 演習 2: BMI を計算する

身長(m)と体重(kg)を入力し、BMI（体重 ÷ 身長 ÷ 身長）を計算して表示してください。

<details>
<summary>解答例</summary>

```java
import java.util.Scanner;

public class Ex0202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("身長(m): ");
        double height = scanner.nextDouble();
        System.out.print("体重(kg): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        scanner.close();
    }
}
```

</details>

### 演習 3: 入力された整数が偶数か奇数か判定する

整数を入力し、偶数なら「偶数です」、奇数なら「奇数です」と表示してください。
ただし、整数以外が入力された場合は「整数を入力してください」と表示すること
（ヒント: `hasNextInt()` を使う）。

<details>
<summary>解答例</summary>

```java
import java.util.Scanner;

public class Ex0203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.println("偶数です");
            } else {
                System.out.println("奇数です");
            }
        } else {
            System.out.println("整数を入力してください");
        }

        scanner.close();
    }
}
```

</details>

---

## まとめ

このテキストでは以下を学びました:

- **Scanner の基本**: 生成 → 読み取り → クローズの流れ
- **入力メソッド**: `nextLine()` / `next()` / `nextInt()` / `nextDouble()` などの使い分け
- **落とし穴**: `nextInt()` 後の `nextLine()` 問題とその対策
- **入力チェック**: `hasNextInt()` などによるバリデーション
- **実践**: ループ・`switch` と組み合わせた対話型コンソールアプリの作成

`src/` のサンプルを順に動かしながら、自分なりに値を変えて試してみましょう。
