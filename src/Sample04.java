import java.util.Scanner;

/**
 * Sample04: 単語を入力する（next）
 *
 * next() は空白・改行までの「1 単語」だけを読み取る。
 * nextLine()（1 行ぜんぶ）との違いに注目。
 */
public class Sample04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("好きな食べ物を 1 つ入力してください: ");
        // next() はスペースが来た時点で区切る（例:「りんご みかん」なら「りんご」だけ）
        String word = scanner.next();

        System.out.println("あなたが入力した単語: " + word);

        scanner.close();
    }
}
