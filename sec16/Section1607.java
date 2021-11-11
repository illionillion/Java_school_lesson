package sec16;

import java.util.Scanner;

import javax.swing.border.Border;

/**
 * Section1607
 */
public class Section1607 {

    public static void main(String[] args) {
        // 盤面
        char[][] board={
            {'□','□','□'},
            {'□','□','□'},
            {'□','□','□'}
        };

        // board= show_array(board);
        // show_array(board);

        boolean gameflag=true;
        int counta=1;
        System.out.println("初期状態");
        board= show_array(board);

        // while (counta<board.length*board[0].length) {
        while (gameflag) {

            System.out.println("回数："+counta);
            System.out.print("プレイヤー1の番：");
            String input=new Scanner(System.in).nextLine();
            int row=Character.getNumericValue(input.charAt(1))-1;
            int col=(int)(input.charAt(0))-97;
            board[row][col]='○';

            board= show_array(board);
            
            counta++;
            if (counta>board.length*board[0].length) {
                gameflag=false;
                System.out.println("ゲーム終了");
                break;
            }

            System.out.println("回数："+counta);
            System.out.print("プレイヤー2の番：");
            input=new Scanner(System.in).nextLine();
            row=Character.getNumericValue(input.charAt(1))-1;
            col=(int)(input.charAt(0))-97;
            board[row][col]='×';

            board= show_array(board);

            counta++;
            if (counta>board.length*board[0].length) {
                gameflag=false;
                System.out.println("ゲーム終了");
                break;
            }


        }


    }

    public static boolean board_check(boolean gameflag,char[][] board) {

        char[][][] board_pattern={
            {
                {'○','□','□'},
                {'○','□','□'},
                {'○','□','□'}
            },
            {
                {'□','○','□'},
                {'□','○','□'},
                {'□','○','□'}
            },
            {
                {'□','□','○'},
                {'□','□','○'},
                {'□','□','○'}
            },
            {
                {'×','□','□'},
                {'×','□','□'},
                {'×','□','□'}
            },
            {
                {'□','×','□'},
                {'□','×','□'},
                {'□','×','□'}
            },
            {
                {'□','□','×'},
                {'□','□','×'},
                {'□','□','×'}
            }

        };

        return true;
    }

    public static char[][] show_array(char data[][]) {

        System.out.println("  abc");
        for (int i =0 ; i < data.length; i++) {
            System.out.print((i+1)+" ");
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println();
        }

        return data;
    }
}