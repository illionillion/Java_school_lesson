package FizzBuzzTest;
/**
 * FizzBuzzTest
 */
// 1から整数を数える
// 3で割り切れる=Fizz
// 5で割り切れる=Buzz
// 3でも5でも割り切れる=FizzBuzz
 public class FizzBuzzTest {

    public static void main(String[] args) {
        String output;//表示用の変数
        for (int i = 1; i <= 100; i++) {
            // 変数の中身をリセット
            output="";
            // 3で割り切れるとき
            if (i%3==0) {
                output="Fizz";
            }
            // 5で割り切れるとき
            if (i%5==0) {
                output+="Buzz";
            }
            // どちらでもないとき
            if ((i%3!=0)&&(i%5!=0)) {
                output="どちらでもない";
            }
            System.out.println(i+": "+output);
        }
        
    }
}