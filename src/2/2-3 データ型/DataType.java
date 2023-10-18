/*DataType.java
 * 基本データ型と参照型の学習
 * 2023.7.20 松尾
 */

public class DataType {
    public static void main(String[] args){

        //データの初期化と宣言

        int month = 5;
        int day = 28;
        float weight = 60.5f;
        double height = 162;
        char bloodType = 'A';

        String name = "松尾";

        //画面出力
        
        System.out.println("こんにちは！" + name + "です。");
        System.out.println("身長は" + height + "cm、体重は" + weight + "kg、");
        System.out.println("誕生日は" + month + "月" + day + "日、");
        System.out.println("血液型は" + bloodType + "型です。");
        System.out.println("よろしくお願いします！");
    }
    
}
