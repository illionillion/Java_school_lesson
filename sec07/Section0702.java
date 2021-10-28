package sec07;
/**
 * Section0702
 */
public class Section0702 {

    public static void main(String[] args) {
        boolean doorClose=true;
        int count=0;
        while (doorClose==true) { //doorCloseだけでもtrueになるのでOK
            System.out.println("ノックする");
            System.out.println("1分待つ");
            count++;
            if (count>=10) {
                doorClose=false;
            }
        }
        // 無限ループじゃん
    }
}