package sec11;
import java.util.Scanner;
/**
 * Section1105
 */
public class Section1105 {

    public static void main(String[] args) {
        // 「年齢を入力してください」と表示
        System.out.println("年齢を入力してください");
        // 変数ageを宣言し、ユーザーから年齢を整数型で受け付ける
        int age=new Scanner(System.in).nextInt();
        // 20歳以上なら「成人しています。」それ以外なら「未成年です。」と表示する。
        if(age>=20){
            System.out.println("成人しています。");
        }else{
            System.out.println("未成年です。");
        }
    }
}