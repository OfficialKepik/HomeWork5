package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class For33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a number >1 : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int k = 2; k < n; k++) {
            arr[k] = arr[k - 2] + arr[k - 1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
