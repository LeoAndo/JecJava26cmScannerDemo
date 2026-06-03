import java.util.Scanner;

/**
 * Sample07: 入力が整数かどうか確認する（hasNextInt）
 *
 * hasNextInt() は「次の入力が整数として読めるか」を true / false で返す。
 * 例外を出さずに入力チェックができる。
 */
public class Sample07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください: ");

        // 整数として読めるかどうかを先に確認する
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("整数 " + number + " が入力されました。");
        } else {
            System.out.println("整数ではありません。");
        }

        scanner.close();
    }
}
