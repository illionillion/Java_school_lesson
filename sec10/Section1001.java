package sec10;

/**
 * Section1001
 */
public class Section1001 {

    public static void main(String[] args) {
        String te="グー";

        switch (te) {
            case "グー":
                System.out.println("勝てる手はチョキ");
                break;
            case "チョキ":
                System.out.println("勝てる手はグー");
                break;
            case "パー":
                System.out.println("勝てる手はパー");
                break;
        
            default:
                System.out.println("エラー");
                break;
        }
    }
}