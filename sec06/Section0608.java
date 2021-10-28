package sec06;
/**
 * Section0608
 */
public class Section0608 {

    public static void main(String[] args) {
        // 整数Aを入力してくださいと表示
        System.out.println("整数Aを入力してください");
        // 整数型で変数aを宣言し、キーボード入力を受け付ける
        int a=new java.util.Scanner(System.in).nextInt();
        // 整数Bを入力してくださいと表示
        System.out.println("整数Bを入力してください");
        // 整数型で変数bを宣言し、キーボード入力を受け付ける
        int b=new java.util.Scanner(System.in).nextInt();
        // A + Bを行い、「A + B = ○○」と表示する
        System.out.println("A + B = "+a+b);
    }
}