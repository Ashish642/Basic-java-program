package org.BLZ;
import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        if(year>999 && year<9999) {
            if(((year%4==0)  && (year%100!=0)) || (year%400==0 )) {
                System.out.println("This year is leap year");

            }
            else{
                System.out.println("This year is not leap year");

            }

        }
    }

}
