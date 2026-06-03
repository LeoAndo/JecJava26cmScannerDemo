import java.util.Scanner;

/**
 * Sample16: 簡易電卓
 *
 * 2 つの数値と演算子（+ - * /）を入力して計算する。
 * 数値・文字列の混在入力と switch を組み合わせた例。
 */
public class Sample16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 つ目の数値: ");
        double a = scanner.nextDouble();

        System.out.print("演算子（+ - * /）: ");
        String op = scanner.next();

        System.out.print("2 つ目の数値: ");
        double b = scanner.nextDouble();

        double result;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("0 では割れません。");
                    scanner.close();
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("未知の演算子です。");
                scanner.close();
                return;
        }

        System.out.println("結果: " + result);

        scanner.close();
    }
}
