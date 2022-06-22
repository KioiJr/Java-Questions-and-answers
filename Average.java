package com.koso.questions;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Enter the count of numbers: ");
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());

        float sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number: ");
            int x = Integer.parseInt(sc.nextLine());
            sum = sum + x;
        }
        float avg = sum/count;
        System.out.println("Average: "+avg);

    }
}
