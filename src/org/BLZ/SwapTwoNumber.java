package org.BLZ;
import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value : ");
        int a = sc.nextInt();
        System.out.println("Enter the second value : ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Before swapping the value A -:" + a + "and B" + b);
        int c  = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping the value of -:" + a + "and B -: " +b);
    }
}
