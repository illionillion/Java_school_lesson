package sec23;

import java.util.Scanner;

/**
 * Section2303
 */
public class Section2303 {

    public static void main(String[] args) {
        String buf; //入力バッファ
        System.out.println("終了は[Enter]だけを入力");
        System.out.print("整数入力>");

        while (!(buf=new Scanner(System.in).nextLine()).equals("")) {
            // 数値の設定と表示
            int num=Integer.parseInt(buf);

            // 奇数判定
            if (num%2==0) {
                System.out.println(num+"は偶数です");
            }else{
                System.out.println(num+"は奇数です");
            }

            System.out.print("整数入力>");
        }
    }
}