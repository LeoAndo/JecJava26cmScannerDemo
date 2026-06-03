import java.util.Scanner;

/**
 * Sample02: 整数を入力する（nextInt）
 *
 * nextInt() でキーボードから整数（int）を読み取る。
 * 読み取った値はそのまま計算に使える。
 */
public class Sample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        // nextInt() は空白・改行で区切られた 1 個の整数を読み取る
        int number = scanner.nextInt();

        System.out.println("入力された値: " + number);
        System.out.println("2 倍した値: " + (number * 2));

        scanner.close();
    }
}
