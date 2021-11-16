package sec17;

/**
 * Section1701
 */
public class Section1701 {

    public static void main(String[] args) {
        // 配列変数englishScoresを宣言し、80,70,50,40,50を代入
        int[] englishScores={80,70,50,40,50};
        // 「englishScores配列の要素数は○○」を表示（lengthを使用）
        System.out.println("englishScores配列の要素数は"+englishScores.length);
        // for文を使い、「englishScoresの○番目の要素は○○」と表示
        for (int i = 0; i < englishScores.length; i++) {
            System.out.println("englishScoresの"+i+"番目の要素は"+englishScores[i]);
        }
    }
}