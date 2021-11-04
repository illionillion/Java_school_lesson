package sec11;

import java.util.Scanner;

/**
 * Section1109
 */
public class Section1109 {

    public static void main(String[] args) {
        // 「値を入力してください」と表示
        System.out.println("値を入力してください");
        // 整数型のvalueを宣言し、ユーザから値を整数値で受け付ける
        int value=new Scanner(System.in).nextInt();
        // 3で割り切れるときは、「hoge」と表示、5で割り切れるときは「moge」と表示、両方で割り切れるときは「hogemoge」と表示
        if (value%3==0 && value%5==0) {
            System.out.println("hogemoge");
        }else{
            if (value%3==0) {
                System.out.println("hoge");
            }else if(value%5==0){
                System.out.println("moge");
            }            
        }

    }
}