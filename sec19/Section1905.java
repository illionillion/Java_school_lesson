package sec19;

import java.util.Scanner;

/**
 * Section1905
 */
public class Section1905 {

    public static void main(String[] args) {
        int height; // 変数の宣言（縦）
        int width; // 変数の宣言（横）
        int area; // 変数の宣言（面積）

        // 縦の長さ入力
        System.out.println("縦の長さを入力してください");
        height=new Scanner(System.in).nextInt();
        
        // 横の長さ入力
        System.out.println("横の長さを入力してください");
        width=new Scanner(System.in).nextInt();

        // 面積の計算
        area=width*height; // 面積を求める
        System.out.println("面積は"+area);
    }
}