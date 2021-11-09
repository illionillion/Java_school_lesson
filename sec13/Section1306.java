package sec13;

/**
 * Section1306
 */
public class Section1306 {

    public static void main(String[] args) {
        // String型配列codeArrayを宣言し、String型の要素を3個作成する
        String[]codeArray=new String[3];
        // 「codeArrayの要素数は3」と表示(ただし、lengthを使用)
        System.out.println("codeArrayの要素数は"+codeArray.length);
        // 配列codeArrayの0番目の要素に"A001"を代入
        codeArray[0]="A001";
        // 配列codeArrayの1番目の要素に"B002"を代入
        codeArray[1]="B002";
        // 配列codeArrayの2番目の要素に"C003"を代入
        codeArray[2]="C003";
        // 「配列codeArrayの0番目の要素はA001」と表示(配列を参照)
        System.out.println("配列codeArrayの0番目の要素は"+codeArray[0]);
        // 「配列codeArrayの1番目の要素はB002」と表示(配列を参照)
        System.out.println("配列codeArrayの1番目の要素は"+codeArray[1]);
        // 「配列codeArrayの2番目の要素はC003」と表示(配列を参照)
        System.out.println("配列codeArrayの2番目の要素は"+codeArray[2]);


    }
}