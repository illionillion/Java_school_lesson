package sec23;

import java.util.Scanner;

/**
 * Section2301
 */
public class Section2301 {

    public static void main(String[] args) {

        System.out.println("点数を入力");

        int score = new Scanner(System.in).nextInt();

        if (score>=70) {
            System.out.println("合格です");
        }
    }
}