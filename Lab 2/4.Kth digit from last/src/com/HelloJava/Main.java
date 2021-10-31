package com.HelloJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // To print the kth digit from last. e.g. input 23617 and k=4 output 3.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        String num = scan.nextLine();

        System.out.print("K: ");
        int k = scan.nextInt();

        System.out.println(num.charAt(num.length()-k-1));

    }
}
