import java.util.Scanner;

/**
 * Sample13: 正しい値が入力されるまで再入力させる（バリデーション）
 *
 * hasNextInt() で整数チェックし、不正な入力は読み飛ばして再入力を促す。
 * 実用的な入力処理の基本パターン。
 */
public class Sample13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        while (true) {
            System.out.print("1〜10 の整数を入力してください: ");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                // 範囲もチェックする
                if (number >= 1 && number <= 10) {
                    break; // 正しい入力なのでループを抜ける
                } else {
                    System.out.println("範囲外です。やり直してください。");
                }
            } else {
                System.out.println("整数ではありません。やり直してください。");
                scanner.next(); // 不正な入力を読み捨てる（無限ループ防止）
            }
        }

        System.out.println("入力された値: " + number);

        scanner.close();
    }
}
