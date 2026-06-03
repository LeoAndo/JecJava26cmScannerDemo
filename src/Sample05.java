import java.util.Scanner;

/**
 * Sample05: 複数の値を一度に入力する
 *
 * 1 行にスペース区切りで複数の値を入力し、続けて読み取る。
 * 例: 「3 5」と入力すると a=3, b=5 になる。
 */
public class Sample05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("2 つの整数をスペース区切りで入力してください（例: 3 5）: ");
        // nextInt() を続けて呼ぶと、スペース区切りの値を順番に読み取れる
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));

        scanner.close();
    }
}
