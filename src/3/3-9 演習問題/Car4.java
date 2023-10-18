/*Car1.java 設計図クラス
 * 3章の総復習 演習問題 4
 * 2023.8.1 松尾
 */
public class Car4 {
    private int no;
    static int count = 0;

    public Car4(){
        no = 0;
        count++;
        System.out.println("ナンバーなしを作りました");
    }

    public Car4(int n){
        no = n;
        count++;
        System.out.println("ナンバー" + no + "を作りました");
    }

    public void display(){
        System.out.println(count + "台作成済みです");
    }
}
