import java.util.Scanner;

/**
 * Sample11: try-with-resources で Scanner を自動的に閉じる
 *
 * try() の丸括弧内で生成したリソースは、ブロックを抜けると自動で close される。
 * close() の書き忘れを防げる、より安全な書き方。
 */
public class Sample11 {
    public static void main(String[] args) {
        // try の括弧内で Scanner を作ると、自動的に close() される
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("メッセージを入力してください: ");
            String message = scanner.nextLine();

            System.out.println("入力内容: " + message);
        }
        // ここに来た時点で scanner は閉じられている
    }
}
