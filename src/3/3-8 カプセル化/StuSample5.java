/*Student5.java 実行クラス
 * カプセル化について学習する public priveteの違いなど
 * 2023.8.1 松尾
 */
public class StuSample5 {
    public static void main(String[] args){
        Student5 stu1 = new Student5("菅原");
        stu1.setScore(80);
        stu1.display();

        Student5 stu2 = new Student5("村山");
        stu2.setScore(-50);
        stu2.display();
    }
}
