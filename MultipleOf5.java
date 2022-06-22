package com.koso.questions;

import java.util.Scanner;

public class MultipleOf5 {
    public static void main(String[] args) {
        System.out.println("Enter number to check: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if (number%5 ==0){
            System.out.println(number+" is a multiple of 5.");
        }
        else {
            System.out.println(number+" is not a multiple of 5.");
        }
    }
}
