package sec17;

/**
 * Section1704
 */
public class Section1704 {

    public static void main(String[] args) {
        // 配列変数ascArrayを宣言し、10,20,30,40,50を代入する
        int[] ascArray={10,20,30,40,50};
        // 配列変数descArrayを宣言し、要素を5つ生成する
        int[] descArray=new int[5];
        // ascArrayの要素の順番を逆にしてdescArrayに代入
        for (int i = 0; i < descArray.length; i++) {
            descArray[i]=ascArray[descArray.length-i-1];
        }
        // for文で、ascArrayの要素を順番に表示
        for (int i = 0; i < ascArray.length; i++) {
            System.out.println("ascArray["+i+"]の要素は、"+ascArray[i]); //「ascArray[○]の要素は、○○」と表示
        }
        // for文で、descArrayの要素を順番に表示
        for (int i = 0; i < descArray.length; i++) {
            System.out.println("descArray["+i+"]の要素は、"+descArray[i]); //「descArray[○]の要素は、○○」と表示
        }        
    }
}