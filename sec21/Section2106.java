package sec21;

import java.util.Scanner;

/**
 * Section2106
 */
public class Section2106 {

    public static void main(String[] args) {
        int[] numarr=new int[3];
        int max=0;
        for (int i = 0; i < numarr.length; i++) {
            System.out.print("値を入力"+(i+1)+"：");
            numarr[i]=new Scanner(System.in).nextInt();
            max=Math.max(max,numarr[i]);
        }

        System.out.println(max);

    }
}