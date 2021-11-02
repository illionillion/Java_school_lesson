package sec10;

import java.util.Scanner;

/**
 * Section1007
 */
public class Section1007 {

    public static void main(String[] args) {
        // 「表示したい回数を入力してください」と表示
        System.out.println("「表示したい回数を入力してください」");

        // int型で変数名countを宣言し、コマンドラインから回数を入力させる
        int count=new Scanner(System.in).nextInt();

        // 指定された回数だけ「Hello」を表示する（for文とcountを使用）
        for (int i = 0; i < count; i++) {
            System.out.println("Hello");
        }
    }
}