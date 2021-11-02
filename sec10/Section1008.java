package sec10;

/**
 * Section1008
 */
public class Section1008 {

    public static void main(String[] args) {
        // 「表示したい文字列を入力してください」と表示
        System.out.println("「表示したい文字列を入力してください」");

        // String型で変数名strを宣言し、コマンドラインから文字列を入力させる
        String str=new java.util.Scanner(System.in).nextLine();

        // 「表示したい回数を入力してください」と表示
        System.out.println("「表示したい回数を入力してください」");
        
        // int型で変数名countを宣言し、コマンドラインから回数を入力させる
        int count=new java.util.Scanner(System.in).nextInt();

        // 指定された回数だけ、指定した文字列を表示する（for文とstrとcountを使用）
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}