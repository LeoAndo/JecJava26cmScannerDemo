import java.util.Random;
import java.util.Scanner;

/**
 * Sample15: 数当てゲーム（Random + Scanner）
 *
 * コンピュータが決めた 1〜100 の数を当てる。
 * Scanner で何度も入力を受け付ける、対話型プログラムの例。
 */
public class Sample15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1〜100 のランダムな答えを決める
        int answer = random.nextInt(100) + 1;
        int count = 0;

        System.out.println("1〜100 の数を当ててください！");

        while (true) {
            System.out.print("予想: ");
            int guess = scanner.nextInt();
            count++;

            if (guess < answer) {
                System.out.println("もっと大きい数です。");
            } else if (guess > answer) {
                System.out.println("もっと小さい数です。");
            } else {
                System.out.println("正解！ " + count + " 回で当たりました。");
                break;
            }
        }

        scanner.close();
    }
}
