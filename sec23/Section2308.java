package sec23;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Section2308
 */
public class Section2308 {

    public static void main(String[] args) {
        System.out.println("--タイピングゲーム--");
        System.out.println("説明\nランダムで表示される10単語を入力しよう");

        String[] wordlist={
                            "PowerShell",
                            "JavaScript",
                            "Jscript",
                            "VBA",
                            "VBS",
                            "JSON",
                            "PHP",
                            "HTML",
                            "CSS",
                            "batfile",
                            "stylesheet",
                            "markdown",
                            "React",
                            "Python",
                            "Java",
                            "Ruby",
                            "Rails",
                            "Engineer",
                            "Selenium",
                            "Internet Explorer",
                            "Google Chrome",
                            "Safari",
                            "Edge",
                            "Microsoft",
                            "Fire Fox",
                            "Opera",
                            "Macintosh",
                            "Windows",
                            "Linux",
                            "programmer"
                        };
        int counta=1;
        String selectword;

        // 処理開始時刻
        long start=System.currentTimeMillis();
        while (counta<=10) {
            int rnd=new Random().nextInt(wordlist.length);
            selectword=wordlist[rnd];
            Boolean inputflag=true;
            while (inputflag) {
                System.out.println(selectword);
                System.out.println();
                System.out.print("入力"+ counta +"：");
                String input=new Scanner(System.in).nextLine();
                System.out.println();
                if (selectword.equals(input)) {
                    inputflag=false;
                }
            }
            counta++;
        }
        // 終了時刻取得
        long end=System.currentTimeMillis();

        int delta=(int)(TimeUnit.MILLISECONDS.toSeconds(end-start));

        System.out.println(delta+"秒");
        
    }
}