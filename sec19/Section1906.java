package sec19;

/**
 * Section1906
 */
public class Section1906 {

    public static void main(String[] args) {
        int valX,valY;//2つの変数XとYの宣言
        int temp; // 作業エリアtempの宣言

        valX=1000;
        valY=500;
        System.out.println("入れ替え前");
        System.out.println("Xは"+valX);
        System.out.println("Yは"+valY);

        // データの入れ替え
        temp=valX; // valXの値をtempに代入
        valX=valY; // valYの値をvalXに代入
        valY=temp; // tempの値をvalYに代入

        System.out.println("入れ替え後");
        System.out.println("Xは"+valX);
        System.out.println("Yは"+valY);
    }
}