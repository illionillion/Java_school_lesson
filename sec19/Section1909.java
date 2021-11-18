package sec19;

import java.util.Scanner;

/**
 * Section1909
 */
public class Section1909 {

    public static void main(String[] args) {
        System.out.print("区間を入力してください >>>");
        int N=new Scanner(System.in).nextInt();

        // 計算
        int value=180;
        if (N>1) {
            value=180+(50*N);
        }
        System.out.println("運賃："+value+"円");
    }
}