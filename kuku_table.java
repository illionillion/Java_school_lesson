/**
 * kuku_table
 */
public class kuku_table {

    public static void main(String[] args) {

        int kuku_arr[][] =new int[9][9];//九九表を格納する２次元配列
        for (int i =0 ; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                kuku_arr[i][j]=(i+1)*(j+1);//0から始まってるので+1する
            }
        }
        for (int i =0 ; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (kuku_arr[i][j]<10) {//一桁だった場合は「0」を前に付けて出力
                    System.out.print("0"+kuku_arr[i][j]);
                }else{
                    System.out.print(kuku_arr[i][j]);
                }
                if (j<8) {//jが8より小さい場合は「,」で区切る
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}