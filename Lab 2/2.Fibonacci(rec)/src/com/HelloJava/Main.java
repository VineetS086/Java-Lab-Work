package com.HelloJava;

import java.util.Scanner;

public class Main {

    public static int fibonacci_nth_term(int n) {
        if(n==1){
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci_nth_term(n - 1) + fibonacci_nth_term(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci Sequence till 'nth' term\nn = ");
        int n = scan.nextInt();

        int nth_val = fibonacci_nth_term(n);
        System.out.println(nth_val);
    }
}
