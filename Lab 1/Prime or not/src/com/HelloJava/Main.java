package com.HelloJava;

import java.util.Scanner;

public class Main {

    static boolean is_prime(int n) {
        if (n<=1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (is_prime(num)) {
            System.out.println(num + " is a prime number!");
        } else {
            System.out.println(num + " is 'not' a prime number!");
        }
    }
}

