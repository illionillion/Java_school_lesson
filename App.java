import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int arr[]=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        // arr[0]="a";
        // arr[1]="b";

        System.out.println(Arrays.toString(arr));
        // int myage=19;
        // System.out.println("myage="+myage);

        // int max=30;
        // for (int i = 0; i < max; i++) {
        //     System.out.println(i);
        // }
        // int a=0;
        // int b=10;
        // while (a<b) {
        //     System.out.println("sssss");
        //     a++;
        // }
        // System.out.println(System.getProperty("file.encoding"));
        InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
 
        // System.out.println("名前を入力してください");
 
        // String str = null;
        // try {
        //     str = br.readLine();
        //     br.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        // System.out.println("sysout");
        // System.out.println(str);
        // System.out.println(str + "さんよろしくお願いします。");

        System.out.println(new java.util.Random().nextInt(100));
    }
}
