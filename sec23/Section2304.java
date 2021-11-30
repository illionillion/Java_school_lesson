package sec23;

import java.util.Scanner;

/**
 * Section2304
 */
public class Section2304 {

    public static void main(String[] args) {
        String buf; //入力バッファ

        System.out.println("終了は[Enter]だけを入力");
        System.out.print("点数入力>");
        while (!(buf=new Scanner(System.in).nextLine()).equals("")) {
            int score=Integer.parseInt(buf); //点数の設定
            String message=""; //表示メッセージ

            // 合否判定
            if (score<50) {
                int lack=50-score; //不足分計算

                message="あと"+lack+"点で合格です"; //メッセージ表示
            } else {
                message="合格です";
            }
            System.out.println(message);
            System.out.print("点数入力>");
        }
    
    }
}