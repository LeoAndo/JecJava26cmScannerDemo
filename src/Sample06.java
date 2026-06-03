import java.util.Scanner;

/**
 * Sample06: nextInt() の後の nextLine() 問題と対策
 *
 * nextInt() は改行を読み残すため、直後の nextLine() が空文字になる。
 * 余分な nextLine() を 1 回入れて改行を読み飛ばすのが定番の対策。
 */
public class Sample06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("年齢を入力してください: ");
        int age = scanner.nextInt();

        // nextInt() が残した改行を読み飛ばす（この 1 行が重要）
        scanner.nextLine();

        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();

        System.out.println(name + " さんは " + age + " 歳です。");

        scanner.close();
    }
}
