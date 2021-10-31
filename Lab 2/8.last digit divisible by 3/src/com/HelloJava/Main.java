package com.HelloJava;

import java.util.Scanner;

public class Main {
    //To print the last digit, which is multiple of 3. e.g. input 23617 output 6.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scan.nextInt();

        int n = 0;
        int d = -1;

        while (true) {
            n = num % 10;
            if (n % 3 == 0) {
                d = n;
                break;
            }
            num = (int) num / 10;

        }
        System.out.println(d);

    }
}