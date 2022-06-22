package com.koso.questions;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter number to check:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        if (number%2==0){
            System.out.println(number+" is an even number.");
        }
        else {
            System.out.println(number+" is an odd number.");
        }
    }
}
