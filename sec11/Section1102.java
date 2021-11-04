package sec11;

/**
 * Section1102
 */
public class Section1102 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==3) {
                continue;//iが3の時にfor文を1回スキップする
            }
            System.out.println(i);
        }
    }
}