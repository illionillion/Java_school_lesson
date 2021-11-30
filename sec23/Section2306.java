package sec23;

/**
 * Section2306
 */
public class Section2306 {

    public static void main(String[] args) {
        int[] arrayResult=new int[10];

        // 要素設定ループ
        for (int i = 0; i < arrayResult.length; i++) {
            arrayResult[i]=1;
        }

        // 要素表示ループ
        for (int i = 0; i < arrayResult.length; i++) {
            System.out.print(arrayResult[i]+" ");
        }
        System.out.println();
    }
}