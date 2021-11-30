package sec23;

/**
 * Section2307
 */
public class Section2307 {

    public static void main(String[] args) {
        int[] arrayNo=new int[10];

        // 値設定ループ
        for (int i = 0; i < arrayNo.length; i++) {
            arrayNo[i] = i+1;
        }

        // 値表示ループ
        for (int i = 0; i < arrayNo.length; i++) {
            System.out.print(arrayNo[i]+" ");
        }
        System.out.println();
    }
}