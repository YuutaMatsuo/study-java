/*Student4.java 設計図クラス
 * staticの意味と役割を理解する
 * 2023.8.1 松尾
 */
public class Student4 {
    String name;
    static int counter = 0;

    Student4(String n){
        name = n;
        counter++;
        System.out.println(name + "さんをインスタンス化しました");
    }
    static void display(){
        System.out.println(counter + "人です");
    }
}
