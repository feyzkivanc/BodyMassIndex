package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your height: ");
        double height = scan.nextDouble();
        System.out.print("Please enter your weight: ");
        double weight = scan.nextDouble();
        double bmi = weight/(height*height);
        System.out.print("Your BMI is: " + bmi);
    }
}
