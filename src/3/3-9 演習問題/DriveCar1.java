/*Car1.java 実行用クラス
 * 3章の総復習 演習問題 1
 * 2023.8.1 松尾
 */
public class DriveCar1 {
    public static void main(String[] args){
        Car1 c1 = new Car1();
        c1.setNo(2525);
        c1.run(30);
        c1.display();

        c1.brake(10);
        c1.display();
    }
}
