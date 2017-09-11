package com.theironyard.installparty;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double[] nums = new double[2];

        System.out.println("Enter "+nums.length+" numbers: ");
        for(int i = 0; i < nums.length; i++)
            nums[i] = in.nextDouble();

           double operand1 = nums[0];
           double operand2 = nums[1];

           showResults(operand1, operand2);

    }
    public static void showResults(double operand1, double operand2) {

        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;

        System.out.println("the sum is " + sum + ", " + "the difference is " + difference + ", " + "the quotient is " + division + ", " + "the product is " + multiplication + ", " + "and the remainder is " + remainder);
    }

    }

