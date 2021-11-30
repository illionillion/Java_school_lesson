package sec23;

/**
 * Section2305
 */
public class Section2305 {

    public static void main(String[] args) {
        int[] arrayAmScore={70,85,60,65,75}; //AM点数
        int[] arrayPmScore={80,60,70,65,70}; //PM点数
        int[] arrayTotalScore=new int[5]; // 合計点数の配列を
    
        // 合計点数の計算と表示
        for (int i = 0; i < arrayTotalScore.length; i++) {
            arrayTotalScore[i]=arrayAmScore[i]+arrayPmScore[i];
            System.out.println((i+1)+"人目の合計は"+arrayTotalScore[i]);
        }

    }
}