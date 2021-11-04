/**
 * kannsuutesuto
 */
public class kannsuutesuto {

    public static void main(String[] args) {
        int a,b;
        boolean flag=true;
        a=10;
        b=20;
        System.out.println(kakeru(a,b,flag));
    }

    public static int kakeru(int a,int b,boolean flag) {
        if (flag) {
            return a*b;            
        }
        return 0; 
    }
}