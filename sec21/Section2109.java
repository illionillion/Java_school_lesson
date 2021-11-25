package sec21;

import java.util.Random;

/**
 * Section2109
 */
public class Section2109 {

    public static void main(String[] args) {
        int num1=new Random().nextInt(10);
        int num2=new Random().nextInt(10);
        System.out.println(num1+"："+num2);
        if (num1==num2) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}