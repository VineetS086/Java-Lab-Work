package com.HelloJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();

        int ans = 1;
        for (int i = num; i >= 1; i--) {
            ans *= i;
        }

        System.out.println("Factorial of " + num + " is - " + ans);
    }
}
