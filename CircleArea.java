package com.koso.questions;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println("Enter the radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = Float.parseFloat(scanner.nextLine());
        scanner.close();

        double circumference = 2*Math.PI*radius;
        System.out.println("Circumference: "+circumference);
        double area = Math.PI*radius;
        System.out.println("Area: "+area);
    }
}
