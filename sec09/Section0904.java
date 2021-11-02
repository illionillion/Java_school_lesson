package sec09;

/**
 * Section0904
 */
public class Section0904 {

    public static void main(String[] args) {
        System.out.println("あなたの運勢を占います。");
        int fortune=new java.util.Random().nextInt(4)+1;//1～$\4の乱数発生

        switch (fortune) {
            case 1:
                System.out.println("大吉");
            break;

            case 2:
                System.out.println("中吉");
            break;

            case 3:
                System.out.println("小吉");
            break;

            default:
                System.out.println("凶");
            // break;//defaultのbreakはあってもなくても一緒
        }
    }
}