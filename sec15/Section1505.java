package sec15;

/**
 * Section1505
 */
public class Section1505 {

    public static void main(String[] args) {
        int[] arrayA={1,2,3};
        int[] arrayB;
        arrayB=arrayA;//シャローコピー
        arrayB[0]=100;
        System.out.println(arrayA[0]);//100
        System.out.println(arrayB[0]);//100
    }
}