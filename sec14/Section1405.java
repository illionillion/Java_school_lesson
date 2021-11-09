package sec14;

/**
 * Section1405
 */
public class Section1405 {

    public static void main(String[] args) {
        int[] scores={20,30,40,80};
        int sum=0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }
        int avg=sum/scores.length;
        System.out.println("合計点："+sum);
        System.out.println("平均点："+avg);
        }
}