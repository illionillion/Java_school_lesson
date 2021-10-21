import java.util.Arrays;//←配列を使ったら勝手に追加された？

/**
 * array_test
 */
public class array_test {

    public static void main(String[] args) {
        // 整数型の配列の宣言
        int arr[]=new int[10];//要素数10
        // 要素に番号を入れる
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        // 出力 Arrays.toString()で配列を表示できるように変換している
        System.out.println(Arrays.toString(arr));

        // 数を逆並びにに入れる
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr.length-i-1;
        }
        System.out.println(Arrays.toString(arr));

        // aは97?
        // a~zまでのアルファベットの合計を取得
        char a='a';
        char z='z';
        int count=0;
        while (a<=z) {
            a++;
            count++;
        }
        // System.out.println(count);//26
        // abc_arrの要素数の26のマジックナンバーをなくしたかった

        char abc_arr[]=new char[count];
        char start='a';//初期値
        for (int i = 0; i < abc_arr.length; i++) {
            abc_arr[i]= start;
            // System.out.println(start);
            start++;
        }
        System.out.println(Arrays.toString(abc_arr));

    }
}