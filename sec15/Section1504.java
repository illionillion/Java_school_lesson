package sec15;

/**
 * Section1504
 */
public class Section1504 {

    public static void main(String[] args) {
        // 文字列型配列namesを宣言し、"Ichiro","Jiro","Saburo"を代入
        String[] names={"Ichiro","Jiro","Saburo"};
        // 拡張for文で変数nameを使い、全ての要素を表示する
        for(String name:names){
            System.out.println(name);
        }
    }
}