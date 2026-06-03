import java.util.Scanner;

/**
 * Sample20: 成績判定アプリ（総合演習）
 *
 * 複数人の点数を入力して、評価（A〜D）を付けながら集計する。
 * これまで学んだ「個数入力 → ループ → 判定 → 集計」の総まとめ。
 */
public class Sample20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("何人ぶん入力しますか？: ");
        int people = scanner.nextInt();

        int total = 0;
        for (int i = 1; i <= people; i++) {
            System.out.print(i + " 人目の点数(0-100): ");
            int score = scanner.nextInt();
            total += score;

            // 点数から評価を決める
            String grade;
            if (score >= 80) {
                grade = "A";
            } else if (score >= 60) {
                grade = "B";
            } else if (score >= 40) {
                grade = "C";
            } else {
                grade = "D";
            }

            System.out.println("  → 評価: " + grade);
        }

        System.out.println("====================");
        System.out.println("合計点: " + total);
        System.out.println("平均点: " + ((double) total / people));

        scanner.close();
    }
}
