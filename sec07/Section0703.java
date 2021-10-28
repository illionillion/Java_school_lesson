package sec07;
/**
 * Section0703
 */
public class Section0703 {

    public static void main(String[] args) {
        int a=10; //このaはmainメソッド内で有効

        if (true) {
            int b=20; //このbはifブロック内で有効
            
            System.out.println(a);//aの中身を表示
            System.out.println(b);//bの中身を表示
        }
        // System.out.println(b); //この変数はifブロックのみ有効なのでエラーが発生する
        // 変数のスコープ
    }
}