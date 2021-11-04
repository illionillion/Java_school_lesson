package sec11;

import java.util.Scanner;

/**
 * Section1108
 */
public class Section1108 {

    public static void main(String[] args) {
        // 「あなたの血液型を入力してください」と表示
        System.out.println("あなたの血液型を入力してください");
        // 文字列型でbloodを宣言し、ユーザーから文字列型で血液型を受つける
        String blood=new Scanner(System.in).nextLine();
        // switch文を使い以下のように表示
        // Aの時は「日本人の約37%がA型です。」と表示
        // Bの時は「日本人の約22%がB型です。」と表示
        // Oの時は「日本人の約32%がO型です。」と表示
        // ABの時は「日本人の約9%がAB型です。」と表示
        // それ以外は「入力エラーです。」と表示
        switch (blood) {
            case "A":
                System.out.println("日本人の約37%がA型です。");
                break;
            case "B":
                System.out.println("日本人の約22%がB型です。");
                break;
            case "O":
                System.out.println("日本人の約32%がO型です。");
                break;
            case "AB":
                System.out.println("日本人の約9%がAB型です。");
                break;
        
            default:
                System.out.println("入力エラーです。");
                break;
        }
    }
}