package sec21;
import java.util.Random;
import java.util.Scanner;
/**
 * Section2110
 */
public class Section2110 {

    public static void main(String[] args) {
        int book_num=23;
        String books="";
        books=make_book(books,book_num);
        boolean game_flag=true;

        String player="";
        while (game_flag) {

            player="あなた";
            System.out.print(player+"のターン、1～3で入力 : ");
            int nyuuryoku=new Scanner(System.in).nextInt();
            while (nyuuryoku>3) {
                System.out.println("値が不正です");
                System.out.print(player+"のターン、1～3で入力 : ");
                nyuuryoku=new Scanner(System.in).nextInt();
            }

            book_num-=nyuuryoku;
            books=make_book(books,book_num);

            game_flag=book_check( game_flag , book_num , player);
            if (!game_flag) {
                    break;
            }


            player="コンピューター";
            nyuuryoku=new Random().nextInt(3) + 1;

            System.out.println(player+"のターン、1～3で入力 : "+nyuuryoku);

            book_num-=nyuuryoku;
            books=make_book(books,book_num);

            game_flag=book_check( game_flag , book_num , player);
            if (!game_flag) {
                    break;
            }
        }


    }

    // マッチ出力
    private static String make_book(String books,int book_num) {
        books="";
        for (int i = 0; i < book_num; i++) {
            books+="□";
        }
        System.out.println("残りマッチの数\n"+books);
        return books;
    }

    //負けかどうか判定
    private static boolean book_check(boolean game_flag , int book_num , String player) {
        if (book_num<=0) {
            System.out.println(player+"の負け");
            game_flag=false;
            // break;
            return game_flag;
        }
        return game_flag;
    }
}
