import java.util.Scanner;

/**
 * Sample09: 複数行をループで入力する（hasNextLine）
 *
 * 入力がある間ループを続ける。
 * 空行（何も入力せず Enter）を入力すると終了する。
 */
public class Sample09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("メモを入力してください（空行で終了）:");

        int lineNo = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            // 空行が来たらループを抜ける
            if (line.isEmpty()) {
                break;
            }

            System.out.println(lineNo + ": " + line);
            lineNo++;
        }

        System.out.println("入力を終了しました。");

        scanner.close();
    }
}
