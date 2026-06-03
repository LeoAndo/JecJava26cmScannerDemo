import java.util.Scanner;

/**
 * Sample10: 入力された複数の数値の合計と平均を求める
 *
 * 最初に個数を入力し、その回数ぶん整数を読み取って集計する。
 */
public class Sample10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("何個の数値を入力しますか？: ");
        int count = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print(i + " 個目: ");
            sum += scanner.nextInt();
        }

        // 平均は小数で求めるため double にキャストする
        double average = (double) sum / count;

        System.out.println("合計: " + sum);
        System.out.println("平均: " + average);

        scanner.close();
    }
}
