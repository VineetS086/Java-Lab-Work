package com.HelloJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length in CMs : ");
        double len_cm = scan.nextDouble();
        double len_in, IN_to_CM = 2.54;

        len_in = len_cm / IN_to_CM;

        System.out.println(len_cm+" cm = "+Math.floor(len_in/12)+" feet "+Math.round(len_in%12)+" inch");
    }
}
