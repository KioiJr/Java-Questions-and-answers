package com.koso.questions;

import java.util.Scanner;

public class AvgWhileLoop {
    public static void main(String[] args) {

        int count = 0, sum = 0;
        while (count <5) {
            System.out.println("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum+num;
            count++;
        }
        double avg = ((double)sum)/5.0;
        System.out.println("Average: "+avg);
    }
}
