package com.HelloJava;

import java.util.Scanner;

public class Main {

    public static void solver(int a, int b, int c) {
        int root_term = b * b - 4 * a * c;
        if (root_term<0) {
            System.out.println("No Possible real solution!");
        } else {
            double s1 = (-b - Math.sqrt(root_term)) / 2 * a;
            double s2 = (-b + Math.sqrt(root_term)) / 2 * a;
            System.out.printf("In Equation - %sx^2 + %sx + %s\n",a, b, c);
            if(s1==s2)
                System.out.printf("x = %s", s1);
            else
                System.out.printf("x = %s, %s", s1, s2);
        }

    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Quadratic Equation Coefficients- \n'ax^2 + bx + c'");
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.print("c = ");
        int c = scan.nextInt();

        solver(a, b, c);

    }
}
