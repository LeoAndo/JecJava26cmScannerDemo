import java.util.Scanner;

/**
 * Sample18: 終了ワードが来るまで入力を受け付ける（番兵）
 *
 * "end" が入力されるまで整数を読み続け、合計を求める。
 * 何個入力されるか分からないときに使うパターン。
 */
public class Sample18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("整数を入力してください（end で終了）:");

        int sum = 0;
        while (true) {
            System.out.print("> ");

            // 次が整数なら加算、そうでなければ終了とみなす
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else {
                String token = scanner.next();
                if (token.equals("end")) {
                    break;
                }
                System.out.println("整数か end を入力してください。");
            }
        }

        System.out.println("合計: " + sum);

        scanner.close();
    }
}
