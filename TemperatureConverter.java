package com.koso.questions;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Enter temperature in degrees Celsius:");
        Scanner sc = new Scanner(System.in);
        int degree = Integer.parseInt(sc.nextLine());
        float fahrenheit = ((9*degree)/5)+32;
        System.out.println("Temperature in fahrenheit is: "+fahrenheit+"f");
    }
}
