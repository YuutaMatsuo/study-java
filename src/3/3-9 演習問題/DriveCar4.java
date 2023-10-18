/*Car1.java 設計図クラス
 * 3章の総復習 演習問題 4
 * 2023.8.1 松尾
 */
public class DriveCar4 {
    public static void main(String[] args){
        Car4 c1 = new Car4();
        c1.display();

        Car4 c2 = new Car4(2525);
        c2.display();

        Car4 c3 = new Car4(8888);
        c3.display();
    }
}
