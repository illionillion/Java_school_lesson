package sec09;

import java.util.Scanner;
// 06が課題
/**
 * Section0905
 */
public class Section0905 {

    public static void main(String[] args) {
        // 「あなたの点数を入力してください」と表示
        System.out.println("あなたの点数を入力してください");
        // int型で変数名scoreを宣言し、コマンドラインから点数を入力させる
        int score = new Scanner(System.in).nextInt();

        // もし、scoreが90以上なら「○○点は、秀」と表示する。
        if (score>=90) {
            System.out.println(score+"点は、秀");
            //そうでなければ80以上なら「○○点は、優」と表示する。
        }else if(score>=80){
            System.out.println(score+"点は、優");
            //そうでなければ70以上なら「○○点は、良」と表示する。
        }else if(score>=70){
            System.out.println(score+"点は、良");
            //そうでなければ70以上なら「○○点は、可」と表示する。
        }else if(score>=60){
            System.out.println(score+"点は、可");
            //それ以外は「○○点は、不可」と表示する。
        }else{
            System.out.println(score+"点は、不可");
        }
    }
}