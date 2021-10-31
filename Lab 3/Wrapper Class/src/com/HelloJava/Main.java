package com.HelloJava;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        Integer a_ = new Integer(a);
        int b = a_.intValue();
        String s = a_.toString();
        System.out.println("a = " + a + "\na_ = " + a_ + "\nb = " + b + "\ns+10 = " + s + 10);

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        arr.add(6);
        arr.add(7);

        System.out.println(arr.toString());

    }
}

