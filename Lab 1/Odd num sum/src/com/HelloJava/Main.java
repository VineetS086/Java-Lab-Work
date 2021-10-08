package com.HelloJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();

        int ans = 0;

        for (int i = 0; i < num; i++) {
            if (i%2==1)
                ans += i;
        }
        System.out.println(ans);
    }
}


