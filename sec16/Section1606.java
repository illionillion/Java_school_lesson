package sec16;

import java.util.Scanner;

/**
 * Section1606
 */
// p177 練習4-4
public class Section1606 {

    public static void main(String[] args) {
        int[] numbers={3,4,9};
        System.out.println("1桁の数字を入力したください");
        int input=new Scanner(System.in).nextInt();
        for(int n:numbers){
            if (n==input) {
                System.out.println("アタリ！");
            }
        }
    }
}