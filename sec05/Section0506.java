package sec05;
/**
 * Section0506
 */
// 課題 スクショ提出
public class Section0506 {

    public static void main(String[] args) {
        // 体重を意味する変数weightに53.5を代入する。型は自分で考える
        double weight=53.5;
        // 身長を意味する変数heightに1.75を代入する。型は自分で考える
        double height=1.75;
        // BMIを意味する変数bmiを宣言する
        double bmi;
        // 体重 ÷ 身長(m) ^ 2 の計算結果をBMIとして代入する
        bmi=weight/(height*height);
        // BMIを表示する
        System.out.println(bmi);

        // 小数第2位までで四捨五入
        System.out.println(((double)Math.round(bmi*100))/100);
    }
}