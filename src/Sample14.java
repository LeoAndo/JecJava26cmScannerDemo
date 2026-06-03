import java.util.Scanner;

/**
 * Sample14: メニュー選択（switch との組み合わせ）
 *
 * 数字を入力してメニューを選ぶ、コンソールアプリの定番パターン。
 */
public class Sample14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== メニュー ===");
        System.out.println("1: あいさつ");
        System.out.println("2: 今日の運勢");
        System.out.println("3: 終了");
        System.out.print("番号を選んでください: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("こんにちは！");
                break;
            case 2:
                System.out.println("今日はラッキーな一日になりそうです。");
                break;
            case 3:
                System.out.println("終了します。");
                break;
            default:
                System.out.println("無効な番号です。");
                break;
        }

        scanner.close();
    }
}
