package sec17;

/**
 * Section1706
 */
public class Section1706 {

    public static void main(String[] args) {
        int[] A={5,4,3,2,1};

        for (int i = 0; i < A.length; i++) {
            for (int j = A.length-1; j > i; j--) {
                if (A[j-1]>A[j]) {
                    int tmp=A[j-1];
                    A[j-1]=A[j];
                    A[j]=tmp;
                }
            }
            // 最小値確定した際の配列状態
            for (int k = 0; k < A.length; k++) {
                System.out.println("A["+k+"] = "+A[k]);
            }
            System.out.println();
        }
    }
}