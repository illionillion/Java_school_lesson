package sec17;

import java.util.Scanner;

/**
 * Section1703
 */
public class Section1703 {

    public static void main(String[] args) {
        // 3人の試験の点数を配列に格納するプログラム

        // 整数型配列でexamScoresを宣言し、要素を3つ生成する
        int[] examScores=new int[3];

        // for文でexamScoresの要素数だけループさせる
        for (int i = 0; i < examScores.length; i++) {
            System.out.println("点数を入力してください"+(i+1)+"人目>");
            examScores[i]=new Scanner(System.in).nextInt();
        }

        // for文でexamScoresの要素を全て表示する
        for (int i = 0; i < examScores.length; i++) {
            // 60点以上を合格として表示する
            if (examScores[i]>60) {
                System.out.println(examScores[i]+"点は合格です"); //「○○点は合格です」と表示
            }else{
                System.out.println(examScores[i]+"点は不合格です"); //「○○点は不合格です」と表示
            }
        }
    }
}