import java.lang.reflect.Array;

/**
 * kuku_table
 */
public class kuku_table {

    public static void main(String[] args) {
        int row=1;
        int col=1;
        int kuku_arr[][] =new int[9][9];
        for (int i =0 ; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                kuku_arr[i][j]=row*col;
                col++;
            }
            row++;
        }
        // System.out.println(Arrays.toString(kuku_arr));
    }
}