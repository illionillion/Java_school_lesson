package sec09;

import java.util.Scanner;

/**
 * Section0906
 */
public class Section0906 {

    public static void main(String[] args) {
        // 評価を入力してください（syuu,yuu,ryo,ka,fuka）と表示
        System.out.println("評価を入力してください（syuu,yuu,ryo,ka,fuka）");
        // String型で変数gradeを宣言し、コマンドラインから評価を入力させる
        String grade=new Scanner(System.in).nextLine();

        switch (grade) {
            // 入力値が「syuu」なら「100点から90点です。」と表示
            case "syuu":
                System.out.println("100点から90点です。");
                break;
            // 入力値が「yuu」なら「89点から80点です。」と表示
            case "yuu":
                System.out.println("89点から80点です。");
                break;
            // 入力値が「ryo」なら「79点から70点です。」と表示
            case "ryo":
                System.out.println("79点から70点です。");
                break;
            // 入力値が「ka」なら「69点から60点です。」と表示
            case "ka":
                System.out.println("69点から60点です。");
                break;
            // 入力値が「fuka」なら「59点以下です。」と表示
            case "fuka":
                System.out.println("59点以下です。");
                break;
            // 入力値が不正なら「入力値エラーです。」と表示
            default:
                System.out.println("入力値エラーです");
                break;
        }
    }
}