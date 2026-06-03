import java.util.Scanner;

/**
 * Sample08: 真偽値を入力する（nextBoolean）
 *
 * nextBoolean() は "true" / "false" を boolean として読み取る。
 * （大文字小文字は区別しない）
 */
public class Sample08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Java は好きですか？（true / false）: ");
        boolean likesJava = scanner.nextBoolean();

        if (likesJava) {
            System.out.println("一緒に頑張りましょう！");
        } else {
            System.out.println("これから好きになりましょう！");
        }

        scanner.close();
    }
}
