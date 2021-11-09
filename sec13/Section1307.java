package sec13;

/**
 * Section1307
 */
public class Section1307 {

    public static void main(String[] args) {
        // int型配列scoreArrayを宣言し、int型の要素を3個作成する
        int[] scoreArray=new int[3];
        //「scoreArrayの要素数は3」と表示(ただし、lengthを使用)
        System.out.println("scoreArrayの要素数は"+scoreArray.length);
        // int型でmaxScoreを宣言し、0を代入
        int maxscore=0;
        // 配列scoreArrayの0番目の要素に30を代入
        scoreArray[0]=30;
        // 配列scoreArrayの1番目の要素に60を代入
        scoreArray[1]=60;
        // 配列scoreArrayの2番目の要素に90を代入
        scoreArray[2]=90;
        // maxscoreにscoreArrayの0番目の要素を代入
        maxscore=scoreArray[0];
        // maxscoreにscoreArrayの1番目の要素と比較しを代入
        maxscore=Math.max(scoreArray[1], maxscore);
        // maxscoreにscoreArrayの0番目の要素を代入
        maxscore=Math.max(scoreArray[2], maxscore);
        // 「codeArrayの中で最も大きい値は90です。」と表示(maxscoreを使用)
        System.out.println("codeArrayの中で最も大きい値は"+maxscore+"です。");
    }
}