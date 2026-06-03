import java.util.Scanner;

/**
 * Sample03: 小数を入力する（nextDouble）
 *
 * nextDouble() でキーボードから小数（double）を読み取る。
 */
public class Sample03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("身長を cm で入力してください: ");
        // nextDouble() は小数を読み取る（例: 170.5）
        double height = scanner.nextDouble();

        // cm を m に変換して表示する
        double meter = height / 100.0;
        System.out.println("身長は " + meter + " m です。");

        scanner.close();
    }
}
