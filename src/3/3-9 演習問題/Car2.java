/*Car1.java 設計図クラス
 * 3章の総復習 演習問題 2
 * 2023.8.1 松尾
 */
public class Car2 {
    private int no;     //自動車のナンバー
    private int speed;  //自動車の速度

    Car2(){         //変数noに0を設定する
        no = 0;
    }
    Car2(int n){    //変数noにnを設定する
        no = n;
    }
    
    public void run(int s){
        speed = s;
    }
    public void brake(){
        speed = 0;
    }
    public void brake(int s){
        speed -= s;
    }

    public void display(){
        System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }

}
