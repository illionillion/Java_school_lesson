package sec11;

import java.util.Scanner;

/**
 * Section1106
 */
public class Section1106 {

    public static void main(String[] args) {
        //「 繰り返したい回数を入力してください」と表示
        System.out.println(" 繰り返したい回数を入力してください");
        // 整数型のcountを宣言し、ユーザーから回数を整数型で受け付ける
        int count = new Scanner(System.in).nextInt();
        // while文とcountを使用し、count回だけ「こんにちは」を表示する。
        while (count>0) {
            System.out.println("こんにちは");
            count--;
        }
    }
}