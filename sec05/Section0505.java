package sec05;
/**
 * Section0505
 */
// 0506課題提出
public class Section0505 {

    public static void main(String[] args) {
        // 定数TAXを宣言し、0.10を代入。型は自分で考える
        final double TAX=0.10;
        // int型、税抜価格を意味する変数priceを宣言し、1008を代入
        int price=1008;
        // int型、税込価格を意味する変数priceWithTaxを宣言し
        int priceWithTax;
        // priceの税込価格を計算し,priceWithTaxに代入する
        priceWithTax=price + (int) (price*TAX);

        System.out.println(priceWithTax);
    }
}