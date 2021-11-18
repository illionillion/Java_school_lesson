package sec19;

import java.util.Scanner;

/**
 * Section1908
 */
public class Section1908 {

    public static void main(String[] args) {
        int r; //半径
        double circ; //円周を求める変数 
        double area; //面積を求める変数

        final double PI=Math.PI; //定数で総数に格納できるPIを宣言し、PI(3.14)を代入

        System.out.println("半径を整数で入力してください");
        r=new Scanner(System.in).nextInt();

        // 円周を求めて表示
        circ=2*r*PI;
        System.out.println("円周は"+circ);

        // 面積を求めて表示
        area=r*r*PI;
        System.out.println("面積は"+area);
    }
}