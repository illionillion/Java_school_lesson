package sec14;

/**
 * Section1404
 */
public class Section1404 {

    public static void main(String[] args) {
        // int型の配列scoreArrayを宣言し、10,20,30,40,50を代入
        int[] scoreArray={10,20,30,40,50};
        // for文とlengthを使い、全ての要素に5を加算し、表示する。
        for (int i = 0; i < scoreArray.length; i++) {
            scoreArray[i]+=5;
            System.out.println(scoreArray[i]);
        }
    }
}