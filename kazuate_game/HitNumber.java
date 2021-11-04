package kazuate_game;
/**
 * HitNumber
 */
public class HitNumber {

    public static void main(String[] args) {
        System.out.println("■■■■■数当てゲーム■■■■■");
        System.out.println("0～999 までの数値を入力し、10 回で当てろ！");

        boolean game_flag=true;
        int ran=new java.util.Random().nextInt(1000);
        int count=0;

        while (game_flag) {
            int input_num =new java.util.Scanner(System.in).nextInt() ;
            count++;
            System.out.println(count+" 回目："+input_num);
            if (input_num==ran) {
                System.out.println("★☆ 正解 ☆★");
                game_flag=false;
            }else{
                // System.out.println(ran);
                if (input_num>ran) {
                    System.out.println("それより小さい数です");                    
                }
                if (input_num<ran) {
                    System.out.println("それより大きい数です");                    
                }
                if (count>=10) {
                    System.out.println("GAME OVER");
                    game_flag=false;
                }
            }
        }
    }
}