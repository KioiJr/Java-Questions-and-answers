package com.koso.questions;

import java.util.Scanner;

public class Multiple5And7 {
    public static void main(String[] args) {
        System.out.println("Enter number to check: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if ((number%5 ==0)&&(number%7==0)){
            System.out.println(number+" is a multiple of both 5 and 7.");
        }
        else {
            System.out.println(number+" is not a multiple of 5 and 7.");
        }
    }
}
