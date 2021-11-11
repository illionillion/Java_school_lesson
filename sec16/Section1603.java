package sec16;

/**
 * Section1603
 */
public class Section1603 {

    public static void main(String[] args) {
        // int型の2次元配列scoresを宣言し、2行3列の要素を生成する
        int scores[][]=new int[2][3];
        // 0行0列目に10を代入
        scores[0][0]=10;
        // 0行1列目に20を代入
        scores[0][1]=20;
        // 0行2列目に30を代入
        scores[0][2]=30;
        // 1行0列目に40を代入
        scores[1][0]=40;
        // 1行1列目に50を代入
        scores[1][1]=50;
        // 1行2列目に60を代入
        scores[1][2]=60;
        // scores配列の行数を表示
        System.out.println("scoresの行数は"+scores.length);
        // scores配列の0行目の要素を表示
        System.out.println("scores配列0行目の要素は"+scores[0].length);
        // scores配列の1行目の要素を表示
        System.out.println("scores配列1行目の要素は"+scores[1].length);
        // 2次元配列をすべて表示
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(scores[i][j]);
            }
        }
    }
}