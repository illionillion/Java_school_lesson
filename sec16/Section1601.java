package sec16;

/**
 * Section1601
 */
public class Section1601 {

    public static void main(String[] args) {
        int[] array={1,2,3};
        array=null;//arrayにはアドレスが格納されているが、それをnullにする
        array[0]=10;//arrayにはアドレスが格納されていないので、場所が分からず例外発生

    }
}