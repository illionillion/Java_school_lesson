package sec09;

/**
 * Section0903
 */
public class Section0903 {

    public static void main(String[] args) {
        System.out.println("あなたの運勢を占います。");
        int fortune=new java.util.Random().nextInt(4)+1;//1～$\4の乱数発生
        if (fortune==1) {
            System.out.println("大吉");
        }else if (fortune==2) {
            System.out.println("中吉");
        }else if (fortune==3) {
            System.out.println("小吉");
        }else{
            System.out.println("凶");
        }
    }
}