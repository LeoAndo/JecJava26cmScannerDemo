import java.util.Scanner;

/**
 * Sample12: 区切り文字を変更する（useDelimiter）
 *
 * デフォルトの区切り文字は空白だが、useDelimiter() でカンマなどに変えられる。
 * CSV のような「カンマ区切り」の入力を解析するときに便利。
 */
public class Sample12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("カンマ区切りで 3 つの単語を入力してください（例: 赤,青,黄）: ");

        // 1 行ぶんを取り出して、それ専用の Scanner で解析する
        String line = scanner.nextLine();
        Scanner parser = new Scanner(line);
        parser.useDelimiter(","); // 区切り文字をカンマに設定

        while (parser.hasNext()) {
            System.out.println("- " + parser.next());
        }

        parser.close();
        scanner.close();
    }
}
