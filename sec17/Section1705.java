package sec17;

/**
 * Section1705
 */
public class Section1705 {

    public static void main(String[] args) {
        int[] A={5,4,3,2,1}; //配列Aを宣言、これを1,2,3,4,5に入れ替える
        int w; //入れ替え用変数
        int m; //比較用添え字
        int N=A.length; //配列Aの要素数をNに代入
        int k=N-1; //最大値格納要素位置

        while (k>0) {
            m=0;
            while (m<k) {
                // 添え字m+1とmの要素を比較し、大小関係が逆なら入れ替え
                if (A[m+1]<A[m]) {
                    w=A[m+1];
                    A[m+1]=A[m];
                    A[m]=w;               
                }
                m++; //隣の要素へ添え字を変更
            }
            k--; // 最大値格納要素位置の添え字を変更
        }

        // 配列の中身を表示
        for (int i = 0; i < A.length; i++) {
            System.out.println("A["+i+"] = "+A[i]);
        }
    }
}