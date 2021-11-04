package sec11;

/**
 * Section1110
 */
public class Section1110 {

    public static void main(String[] args) {
        // 1から100まで表示し、3の倍数の時だけ「3の倍数」と表示しなさい。
        for (int i = 1; i <= 100; i++) {
            if (i%3==0) {
                System.out.println("3の倍数");
            }else{
                System.out.println(i);
            }
        }
    }
}