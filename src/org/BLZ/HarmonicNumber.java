package org.BLZ;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String [] args) {
        double n =10, i;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        n = sc.nextInt();
        for(i=1; i<=n; i++) {
            sum = sum+(1/i++);

        }
        System.out.println("Harmonic number :" +sum);

    }

}
