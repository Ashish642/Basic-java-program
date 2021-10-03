package org.BLZ;
import java.util.Scanner;

public class QutientOrReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divident");
        int divident = sc.nextInt();
        System.out.println("Enter the divisor");
        int divisor = sc.nextInt();
        sc.close();
        int qutient = divident / divisor;
        int remainder = divident % divisor;
        System.out.println("The qutient is " + qutient);
        System.out.println("The remainder is " + remainder);

    }
}
