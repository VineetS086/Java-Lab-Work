package com.HelloJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //To print 2nd digit. e.g. input 23516 output.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        String num = scan.nextLine();
        System.out.println(num.charAt(1));

    }
}