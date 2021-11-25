package sec21;

import java.util.Scanner;

/**
 * Section2105
 */
public class Section2105 {

    public static void main(String[] args) {
        
        final int CAL=324;

        System.out.println("数を入力してください");
        int n=new Scanner(System.in).nextInt();
        System.out.println((CAL*n)+"カロリー");
    }
}