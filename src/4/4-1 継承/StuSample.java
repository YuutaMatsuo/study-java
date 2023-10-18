
public class StuSample {
    public static void main(String[] args){
        Student stu = new Student();

        //スーパークラスのメソット
        stu.setName("菅原");
        stu.display();

        //サブクラスのメソッド
        stu.setStuNo(1);
        stu.displayStuNo();
    }
}
