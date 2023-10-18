/*Array.java
 * 配列について学習する
 * 2023.7.22 松尾
 */

public class Array {
    public static void main(String[] args){
        int[] score = new int[3]; //int型の配列scoreを宣言して生成する
        score[0] = 80; //生成した配列に値を代入する
        score[1] = 100;
        score[2] = 75;

        String[] name = {"菅原","村山","寺島"}; //String型の配列を初期化し{}内に入れたい値を入力する
        
        //画面出力
        System.out.println(name[0] + "さん：" + score[0] + "点");
        System.out.println(name[1] + "さん：" + score[1] + "点");
        System.out.println(name[2] + "さん：" + score[2] + "点");
        System.out.println("受験者数：" + score.length + "名");
    }
    
}
