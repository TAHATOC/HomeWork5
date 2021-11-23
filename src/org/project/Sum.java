package org.project;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the length of array: ");
        Scanner scnr = new Scanner(System.in);
        int length = scnr.nextInt();
        int[] input = new int[length];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < length; i++) {
            input[i] = scnr.nextInt();
        } int total = sumOfElements(input);
        System.out.println("Sum  elements in array = " + total);
        scnr.close();
    }
        public static int sumOfElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        return sum;
    }
}



