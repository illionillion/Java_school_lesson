package sec21;

import java.util.Scanner;

/**
 * Section2102
 */
public class Section2102 {

    public static void main(String[] args) {
        System.out.println("何の段で九九表を表示しますか？");

        // 段の設定
        int num=new Scanner(System.in).nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(num+"*"+i+"="+num*i);
        }

    }
}