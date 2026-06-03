import java.util.Scanner;

/**
 * Sample01: 文字列を 1 行入力する（nextLine）
 *
 * Scanner の最も基本的な使い方。
 * 標準入力（キーボード）から 1 行ぶんの文字列を読み取る。
 */
public class Sample01 {
    public static void main(String[] args) {
        // System.in（標準入力）を読み取る Scanner を作成する
        Scanner scanner = new Scanner(System.in);

        System.out.print("名前を入力してください: ");
        // nextLine() は改行までの 1 行をまとめて読み取る
        String name = scanner.nextLine();

        System.out.println("こんにちは、" + name + " さん！");

        // 使い終わったら閉じる
        scanner.close();
    }
}
