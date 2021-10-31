package com.HelloJava;

public class Main {

    public static void main(String[] args) {
        int height = 30;
        int climb_rate = 3;
        int fall_rate = 2;
        double net_climb_rate = climb_rate - fall_rate;
        if (net_climb_rate < 0) {
            System.out.println("The frog can't climb the well");
        } else {
            double time = height / net_climb_rate;
            System.out.println("It will take " + time + " for the frog to climb the well.");
        }
    }
}
