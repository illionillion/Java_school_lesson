package sec21;

import java.util.Scanner;

/**
 * Section2107
 */
public class Section2107 {

    public static void main(String[] args) {
        System.out.print("整数を入力してください>>>");
        int num=new Scanner(System.in).nextInt();
        if (num%2==0) {
            System.out.println(num+"は偶数です");
        }else{
            System.out.println(num+"は奇数です");
        }
    }
}