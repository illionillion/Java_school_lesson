/**
 * Section0609
 */
public class Section0609 {

    public static void main(String[] args) {
        // あなたの名前を入力してくださいと表示
        System.out.println("あなたの名前を入力してください");
        // 文字列型で変数nameを宣言し、キーボード入力を受け付ける
        String name=new java.util.Scanner(System.in).nextLine();
        // 「○○さん、こんにちは」と表示
        System.out.println(name+"さん、こんにちは");
    }
}