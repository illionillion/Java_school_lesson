package sec11;
import java.util.Scanner;

/**
 * Section1107
 */
public class Section1107 {

    public static void main(String[] args) {
        //「 繰り返したい回数を入力してください」と表示
        System.out.println(" 繰り返したい回数を入力してください");
        // 整数型のcountを宣言し、ユーザーから回数を整数型で受け付ける
        int count = new Scanner(System.in).nextInt();
        // for文とcountを使用し、count回だけ「こんにちは」を表示する。
        for(int i=0;i<count;i++){
            System.out.println("こんにちは");
        }
    }
}