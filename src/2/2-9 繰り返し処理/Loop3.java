/*Loop3.java
 * 繰り返し処理を使って配列に対する処理を実行する
 * 2023.7.28 松尾
 */
public class Loop3 {
    public static void main(String[] args){
        int[] score = new int[3];
        score[0] = 80;
        score[1] = 100;
        score[2] = 75;
        String[] name = {"菅原", "村山", "寺島"};

        for(int i = 0; i < score.length; i++){
            System.out.println(name[i] + "さん：" + score[i] + "点");
        }
        System.out.println("受験者数" + score.length + "名");
    }
}
