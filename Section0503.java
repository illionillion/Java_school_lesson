/**
 * Section0503
 */
public class Section0503 {

    public static void main(String[] args) {
        // int型の変数aに100を代入
        int a=100;
        // int型の変数bに50を代入
        int b=50;
        // 代入演算子を使い、aに10を加算
        a+=10;
        // aとbの剰余算をして、aに代入
        a=a%b;//a%=b;
        // aをインクリメント
        a++;
        // bをデクリメント
        b--;
        // aの値を表示
        System.out.println(a);
        // bの値を表示
        System.out.println(b);
    }
}