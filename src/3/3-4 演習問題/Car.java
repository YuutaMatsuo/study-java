/*Car.java
 * 自動車を管理する設計図クラス
 * 2023.7.31
 */
    class Car {
    int no;     //自動車のナンバー
    int speed;  //自動車の速度

    void setNo(int n){
        no = n;
    }

    void run(int s){
        speed = s;
    }

    void stop(){
        speed = 0;
    }

    void display(){
        System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }
    
}
