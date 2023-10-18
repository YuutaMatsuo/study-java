/*Operator.java
 * 演算子について学習する
 * java実行時にターミナルに2つの数字を入力する
 * 2023.7.26 松尾
 */

public class Operator {
    public static void main(String[] args){
        // コマンドラインから入力したデータ（文字列型）を
        // int型に変換する
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a >= 0: " + (a >= 0));
        System.out.println("(a >= 0) && (b >= 0): " + ((a >= 0) && (b >= 0)));
    }
}
