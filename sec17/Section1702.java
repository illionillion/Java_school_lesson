package sec17;

/**
 * Section1702
 */
public class Section1702 {

    public static void main(String[] args) {
        // 配列変数mathScoresを宣言し、10,20,30,40,50を代入
        int[] mathScores={10,20,30,40,50};
        // 「mathScores配列の要素数は○○」を表示（lengthを使用）
        System.out.println("mathScores配列の要素数は"+mathScores.length);
        // 整数型averageを宣言し、0を代入
        int average=0;
        // for文を使い、averageにmathScoresの平均を代入
        for (int i = 0; i < mathScores.length; i++) {
            average+=mathScores[i];
        }
        // 「数学の平均点は○○点」と表示（averageを使用）
        System.out.println("数学の平均点は"+average+"点");
    }
}