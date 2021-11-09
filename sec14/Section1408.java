package sec14;

/**
 * Section1408
 */
public class Section1408 {

    public static void main(String[] args) {
        // int型配列numbersを宣言し、10,20,30,40,50,60を宣言する
        int[] numbers={10,20,30,40,50,60};
        // int型変数のsearchを宣言し、40を代入
        int search=40;
        // 線形探索を参考にしてsearchを探す。見つかったら添え字を表示し、見つからなければエラーと表示する
        boolean flag=true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==search) {
                System.out.println(i);
                flag=false;
                break;
            }
        }
        if (flag) {
            System.out.println("エラー");
        }
    }
}