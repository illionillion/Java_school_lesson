package sec13;

/**
 * Section1305
 */
public class Section1305 {

    public static void main(String[] args) {
        // int型配列screArrayを宣言し、int型の要素を3個作成する
        int[] scoreArray=new int[3];
        // 「scoreArrayの要素数は3」と表示(ただし、lengthを使用)
        System.out.println("scoreArrayの要素数は"+scoreArray.length);
        // 配列scoreArrayの0番目の要素に10を代入
        scoreArray[0]=10;
        // 配列scoreArrayの1番目の要素に20を代入
        scoreArray[1]=20;
        // 配列scoreArrayの2番目の要素に30を代入
        scoreArray[2]=30;
        // 「配列scoreArrayの0番目の要素は10」と表示(配列を参照)
        System.out.println("配列scoreArrayの0番目の要素は"+scoreArray[0]);
        // 「配列scoreArrayの1番目の要素は20」と表示(配列を参照)
        System.out.println("配列scoreArrayの1番目の要素は"+scoreArray[1]);
        // 「配列scoreArrayの2番目の要素は30」と表示(配列を参照)
        System.out.println("配列scoreArrayの2番目の要素は"+scoreArray[2]);

    }
}