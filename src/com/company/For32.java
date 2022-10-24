package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class For32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a number >0 : ");
        int n = scanner.nextInt();
        double[] darr = new double[n];
        darr[0] = 1;
        for (int k = 1; k < n; k++) {
            darr[k] = darr[k - 1] / k;
        }
        System.out.println(Arrays.toString(darr));
    }
}
