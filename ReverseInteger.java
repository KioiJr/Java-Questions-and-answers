package com.koso.questions;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int rev = 0;

        while (number!=0){
            int digit = number%10;
            rev = (rev*10)+digit;
            number = number/10;
        }
        System.out.println(" Reversed: "+rev);
    }
}
