/**
 * kazuateGAME
 */
public class kazuateGAME {

    public static void main(String[] args) {
        System.out.println("数当てゲーム！！");
        System.out.println("0~9までの整数で当てよう！！");
        
        boolean game_flag=true;
        int r_num=new java.util.Random().nextInt(10);
        int count=0;

        while (game_flag) {
            System.out.println("数字を入力してね！！:");
            int input_num =new java.util.Scanner(System.in).nextInt() ;
            count++;            

            if (input_num==r_num) {
                System.out.println("正解！！おめでとう！！");
                System.out.println("解答回数"+count+"回");
                game_flag=false;
            }else{
                System.out.println("不正解…。残念…！！");
                // System.out.println("答えは"+r_num+"だよ！！");
                if (input_num>r_num) {
                    System.out.println("ヒント！！");                    
                    System.out.println("正解の値は入力された値より小さいよ！！");                    
                }
                if (input_num<r_num) {
                    System.out.println("ヒント！！");                    
                    System.out.println("正解の値は入力された値より大きいよ！！");                    
                }
            }            
        }


    }
}