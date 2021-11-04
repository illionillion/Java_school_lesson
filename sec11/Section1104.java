package sec11;

import java.util.Scanner;

/**
 * Section1104
 */
public class Section1104 {

    public static void main(String[] args) {
        // 「年齢を入力してください」と表示
        System.out.println("年齢を入力してください");
        // 変数ageを宣言し、ユーザーから年齢を整数型で受け付ける
        int age=new Scanner(System.in).nextInt();
        // 変数ageを使い、「あなたの年齢は○○歳です。」と表示
        System.out.println("あなたの年齢は"+age+"歳です。");
    }
}