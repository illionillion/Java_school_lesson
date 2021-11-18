package sec19;

import java.util.Scanner;

/**
 * Section1907
 */
public class Section1907 {

    public static void main(String[] args) {
        int money; //金額入力の変数

        System.out.println("金額を入力してください");
        money=new Scanner(System.in).nextInt(); // 金額を入力
        money=(int)(money*1.08); // 税込金額を求める
        System.out.println("税込￥"+money);
    }
}