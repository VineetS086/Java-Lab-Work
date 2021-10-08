package com.HelloJava;

import java.util.Scanner;

public class Main {

    public static boolean is_vowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (char vowel : vowels) {
            if (c == vowel)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char c = scan.next().charAt(0);

        if (is_vowel(c)) {
            System.out.println(c + " is a Vowel");
        } else {
            System.out.println(c + " is 'not' a Vowel!");
        }
    }
}
