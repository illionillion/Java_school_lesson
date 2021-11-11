package sec15;

/**
 * Section1506
 */
// 課題
public class Section1506 {

    public static void main(String[] args) {
        // int型配列scoresを宣言し、60,70,80,50を代入する
        int[] scores={60,70,80,50};
        // 拡張for文でデータ型int,変数scoreを使う
        for(int score:scores){
            // 要素が60以上の時、「○○点は合格」とscoreを使って表示
            if (score>=60) {
                System.out.println(score+"点は合格");
            }
        }
    }
}