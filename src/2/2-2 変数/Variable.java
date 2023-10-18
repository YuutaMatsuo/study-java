/* Variable.java
    変数の宣言と代入を学習する
    2023.7.20 松尾
 */

public class Variable {
    public static void main(String[] args){
        int month;                              //int型で変数monthを宣言
        month = 5;                              //宣言したmonthに5を代入
        int day = 28;                           //int型で変数dayを宣言し初期値28を代入

        System.out.println("私の誕生日は、"); //画面出力 1行目
        System.out.println(month + "月" + day + "日です！"); //画面出力 月と日をあわせて表示

    }
    
}
