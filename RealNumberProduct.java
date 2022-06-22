package com.koso.questions;

import java.util.Scanner;

public class RealNumberProduct {
    public static void main(String[] args) {
        System.out.println("Enter count od real numbers: ");
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());

        float prod = 1.0f;
        for (int i = 0; i < count; i++) {
            System.out.println("Enter real number: ");
            float number  = Float.parseFloat(sc.nextLine());
            prod = prod * number;
        }
        System.out.println("The Product is: "+prod);
    }
}
