# JecJava26cmScannerDemo

`java.util.Scanner` の使い方を基本から応用まで学ぶための授業用プロジェクトです。
ビルドツール不要で、IntelliJ IDEA からすぐに実行できます。
コンソール（キーボード）からの入力を扱う 20 個のサンプルを収録しています。

## NotebookLM 補足資料
https://notebooklm.google.com/notebook/fc30f692-9b4d-473d-a83c-246a7b16c92a

## 必要環境

- **JDK** 11 以上
- **IntelliJ IDEA**（Community Edition 可）

## セットアップ

1. このリポジトリをクローンする
2. IntelliJ IDEA でプロジェクトを開く（`JecJavaTemplate.iml` が自動認識されます）
3. Project SDK に JDK を設定する

## 使い方

IntelliJ IDEA 上で各 Java ファイルの `main` メソッドを右クリック → **Run** で実行できます。

> **注意:** Scanner はキーボード入力を待つため、必ずコンソールから実行してください。

コマンドラインで実行する場合:
```bash
# コンパイル（例: Sample01.java）
javac src/Sample01.java

# 実行
java -cp src Sample01
```

## プロジェクト構成

```
src/
├── Sample01.java   # 文字列を 1 行入力する（nextLine）
├── Sample02.java   # 整数を入力する（nextInt）
├── Sample03.java   # 小数を入力する（nextDouble）
├── Sample04.java   # 単語を入力する（next）
├── Sample05.java   # 複数の値を一度に入力する
├── Sample06.java   # nextInt() の後の nextLine() 問題と対策
├── Sample07.java   # 入力が整数か確認する（hasNextInt）
├── Sample08.java   # 真偽値を入力する（nextBoolean）
├── Sample09.java   # 複数行をループで入力する（hasNextLine）
├── Sample10.java   # 合計と平均を求める
├── Sample11.java   # try-with-resources で自動的に閉じる
├── Sample12.java   # 区切り文字を変更する（useDelimiter）
├── Sample13.java   # 正しい値まで再入力させる（バリデーション）
├── Sample14.java   # メニュー選択（switch）
├── Sample15.java   # 数当てゲーム（Random + Scanner）
├── Sample16.java   # 簡易電卓
├── Sample17.java   # 文字列を Scanner で解析する
├── Sample18.java   # 終了ワードまで入力を受け付ける（番兵）
├── Sample19.java   # 入力フォーム（複数項目）
└── Sample20.java   # 成績判定アプリ（総合演習）
```

各ファイルは `public static void main(String[] args)` を持つ独立したプログラムです。
外部ライブラリは使用せず、Java 標準ライブラリのみで動作します。

### サンプル一覧

| # | ファイル | テーマ | 主なメソッド |
|---|---------|--------|-------------|
| 01 | `Sample01.java` | 文字列を 1 行入力する | `nextLine()` |
| 02 | `Sample02.java` | 整数を入力する | `nextInt()` |
| 03 | `Sample03.java` | 小数を入力する | `nextDouble()` |
| 04 | `Sample04.java` | 単語を入力する | `next()` |
| 05 | `Sample05.java` | 複数の値を一度に入力する | `nextInt()` × 複数 |
| 06 | `Sample06.java` | `nextInt()` 後の `nextLine()` 問題と対策 | `nextInt()` + `nextLine()` |
| 07 | `Sample07.java` | 入力が整数か確認する | `hasNextInt()` |
| 08 | `Sample08.java` | 真偽値を入力する | `nextBoolean()` |
| 09 | `Sample09.java` | 複数行をループで入力する | `hasNextLine()` |
| 10 | `Sample10.java` | 合計と平均を求める | `nextInt()` + ループ |
| 11 | `Sample11.java` | try-with-resources で自動的に閉じる | `try(Scanner ...)` |
| 12 | `Sample12.java` | 区切り文字を変更する | `useDelimiter()` |
| 13 | `Sample13.java` | 正しい値まで再入力させる | `hasNextInt()` + ループ |
| 14 | `Sample14.java` | メニュー選択 | `nextInt()` + `switch` |
| 15 | `Sample15.java` | 数当てゲーム | `Random` + `nextInt()` |
| 16 | `Sample16.java` | 簡易電卓 | `nextDouble()` + `next()` |
| 17 | `Sample17.java` | 文字列を Scanner で解析する | `new Scanner(String)` |
| 18 | `Sample18.java` | 終了ワードまで入力を受け付ける | `hasNextInt()` + 番兵 |
| 19 | `Sample19.java` | 入力フォーム（複数項目） | `nextLine()`/`nextInt()`/`nextDouble()` |
| 20 | `Sample20.java` | 成績判定アプリ（総合演習） | 総合 |

### ファイル命名規則

| プレフィックス | 用途 | 例 |
|--------------|------|-----|
| `Main` | エントリーポイント | `Main.java` |
| `SampleXX` | サンプルコード | `Sample01.java` |
| `LiteralXXx` | リテラル解説 | `Literal03a.java` |
| `ExXXXX` | 演習問題 | `Ex0101.java` |

## GitHub Actions

### Claude Code Review
`.github/workflows/claude-review.yml` を使うには、GitHub Secrets の設定が必要です。

設定手順:
1. GitHub のリポジトリ画面で `Settings` → `Secrets and variables` → `Actions` → `New repository secret`
2. Name: `ANTHROPIC_API_KEY`
3. Value: Anthropic の API キー

動作:
- コメントで `@claude` を付けるとレビュー応答（Owner/Member/Collaborator のみ）

### Junie Code Review
`.github/workflows/junie-review.yml` を使うには、GitHub Secrets の設定が必要です。

設定手順:
1. GitHub のリポジトリ画面で `Settings` → `Secrets and variables` → `Actions` → `New repository secret`
2. Name: `JUNIE_API_KEY`
3. Value: JetBrains Junie の API キー

動作:
- PR 作成/更新で自動実行
- レビューコメントは同一コメントを更新（`use_single_comment: true`）

## ドキュメント

- `README.md` : プロジェクト概要とセットアップ手順（本ファイル）。
- `TUTORIAL.md` : 授業用テキスト。解説と演習問題。
- `AGENTS.md` : AI エージェント向け共通ルール。

## 貢献

開発方針や規約は `AGENTS.md` を参照してください。

## ライセンス

未設定です。必要に応じて追加してください。
