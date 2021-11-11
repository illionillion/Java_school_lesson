package sec15;

/**
 * Section1507
 */
public class Section1507 {

    public static void main(String[] args) {
        // int型配列で10,20,30,40を代入
        int[] array={10,20,30,40};
        // 通常のfor文で、それぞれの要素を2倍し表示する
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]*2);
        }
    }
}