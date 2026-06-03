import java.util.Scanner;

/**
 * Sample17: 文字列を Scanner で解析する
 *
 * Scanner は System.in だけでなく、ふつうの String も解析できる。
 * 1 行の文字列を空白で分けて、トークンごとに取り出す例。
 */
public class Sample17 {
    public static void main(String[] args) {
        // ファイルやキーボードでなく、文字列を入力源にする
        String data = "山田 太郎 25";
        Scanner scanner = new Scanner(data);

        // 空白区切りで順番に読み取れる
        String lastName = scanner.next();
        String firstName = scanner.next();
        int age = scanner.nextInt();

        System.out.println("姓: " + lastName);
        System.out.println("名: " + firstName);
        System.out.println("年齢: " + age);

        scanner.close();
    }
}
