package com.HelloJava;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //To find sum of all digits. Input 23617 output 2+3+6+1+7=19.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = scan.nextInt();
        int sum = 0;
        while (num > 0) {
            sum+=num%10;
            num = (int) num/10;
        }
        System.out.println(sum);

    }
}