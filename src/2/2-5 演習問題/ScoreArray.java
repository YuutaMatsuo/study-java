/*ScoreArray.java
  配列を生成し画面に表示する演習問題
  画面出力はfor文を使って少ない行数で実行出来るように改良した
  2023.7.24 松尾
 */
class ScoreArray{
  public static void main(String[] args){
    //配列の生成
    int[] data = new int[4];
    
    //配列に値を代入
    data[0] = 90;
    data[1] = 80;
    data[2] = 100;
    data[3] = 90;

    //値を表示
    for (int i = 0; i < 4; i++){
      System.out.println(i+1 +"人目は" + data[i] + "点");
    }

    }
  }
