package com.koso.questions;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Side A length: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Side B length: ");
        int b = sc.nextInt();
        System.out.println("Side C length: ");
        int c  = sc.nextInt();
        sc.close();

        if ((a+b)>c &&(b+c)>a &&(a+c)>b){
            double s = (a+b+c)/2.0;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of the triangle: "+area);
        }
        else {
            System.out.println("Area doesn't exist");
        }
    }
}
