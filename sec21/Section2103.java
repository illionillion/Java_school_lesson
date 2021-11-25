package sec21;

/**
 * Section2103
 */
public class Section2103 {

    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.print("i="+i+"\t"); //iの値とタブの表示
            for (int j = 1; j <= i; j++) {
                System.out.print("o"); //oの表示
            }
            System.out.println(); //改行
        }
    }
}