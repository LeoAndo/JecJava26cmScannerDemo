import java.util.Scanner;

/**
 * Sample19: 入力フォーム（複数項目をまとめて受け取る）
 *
 * 名前・年齢・身長など複数の項目を順番に入力し、最後にまとめて表示する。
 * 型の違う入力（String / int / double）を扱う実践例。
 */
public class Sample19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("名前: ");
        String name = scanner.nextLine();

        System.out.print("年齢: ");
        int age = scanner.nextInt();

        System.out.print("身長(cm): ");
        double height = scanner.nextDouble();

        // 入力内容をまとめて確認表示する
        System.out.println("----- 入力内容 -----");
        System.out.println("名前　: " + name);
        System.out.println("年齢　: " + age + " 歳");
        System.out.println("身長　: " + height + " cm");

        scanner.close();
    }
}
