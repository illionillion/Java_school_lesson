package sec11;

/**
 * Section1101
 */
public class Section1101 {

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if (i==3) {
                break;//iが3の時にfor文を終了して次のブロックへ
            }
            System.out.println(i);
        }
    }
}