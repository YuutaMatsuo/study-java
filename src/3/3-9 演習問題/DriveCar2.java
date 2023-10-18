/*Car1.java 実行用クラス
 * 3章の総復習 演習問題 2
 * 2023.8.1 松尾
 */
public class DriveCar2 {
    public static void main(String[] argas){
        Car2 c1 = new Car2();
        c1.run(30);
        c1.display();

        Car2 c2 = new Car2(2525);
        c2.run(50);
        c2.display();
    }
    
}
