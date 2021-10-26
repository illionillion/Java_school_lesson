/**
 * Section0610
 */
public class Section0610 {

    public static void main(String[] args) {
        // 1人目の名前を入力してくださいと表示
        System.out.println("1人目の名前を入力してください");
        // 文字列型で変数nameAを宣言し、キーボード入力を受け付ける。
        String nameA=new java.util.Scanner(System.in).nextLine();
        // 整数型で変数ageAを宣言し、キーボード入力を受け付ける。
        int ageA=new java.util.Scanner(System.in).nextInt();
        // 2人目の名前を入力してくださいと表示
        System.out.println("2人目の名前を入力してください");
        // 文字列型で変数nameBを宣言し、キーボード入力を受け付ける。
        String nameB=new java.util.Scanner(System.in).nextLine();
        // 整数型で変数ageBを宣言し、キーボード入力を受け付ける。
        int ageB=new java.util.Scanner(System.in).nextInt();
        // 1人目の名前と年齢を表示
        System.out.println(nameA+"さん"+ageA+"歳");
        // 2人目の名前と年齢を表示
        System.out.println(nameB+"さん"+ageB+"歳");
    }
}