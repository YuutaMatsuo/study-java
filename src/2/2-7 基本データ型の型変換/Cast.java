/*Cast.java
 * データ型の型変換について学ぶ
 * java実行時にターミナルに税抜きの金額を入力する
 * 2023.7.26 松尾
 */
public class Cast {
    public static void main(String[] args){
        int price = Integer.parseInt(args[0]);
        double rate = 0.08; //消費税率：8%
        int amount;

        amount = (int) (price * (1 + rate));
        System.out.println("税込金額： " + amount + "円");
    }
    
}
