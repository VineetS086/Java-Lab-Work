package com.HelloJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci Sequence till 'nth' term\nn = ");
        int n = scan.nextInt();

        int t1 = 0;
        int t2 = 1;
        if (n < 1) {
            System.out.println("n must be a natural number");
            System.exit(0);
        }
        switch (n) {
            case 1:
                System.out.println(t1);
                System.exit(0);
            case 2:
                System.out.println(t2);
                System.exit(0);
        }
        while (n > 2) {
            t2 += t1;
            t1 = t2 - t1;
            n--;
        }
        System.out.println(t2);

    }
}
