package org.BLZ;
import java.util.Scanner;

public class VowelOrConso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        String alpha = sc.next();
        String alphaLower = alpha.toLowerCase();
        if(alphaLower.equals("a")) || alphaLower.equals("e") || alphaLower.equals("i") || alphaLower.equals("o")
                || alphaLower.equals("u"))
    }
}
