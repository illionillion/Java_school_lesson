package sec19;

import java.util.Scanner;

/**
 * Section1910
 */
public class Section1910 {

    public static void main(String[] args) {
        System.out.print("整数を2つスペースで区切って入力してください >>>");
        String input=new Scanner(System.in).nextLine();
        System.out.println();

        String[] number=input.split(" ");

        if (Integer.parseInt(number[0]) == Integer.parseInt(number[1])) {
            System.out.println("等しい");
        }else{
            System.out.println(Math.min(Integer.parseInt(number[0]),Integer.parseInt(number[1])));
        }
    }
}
