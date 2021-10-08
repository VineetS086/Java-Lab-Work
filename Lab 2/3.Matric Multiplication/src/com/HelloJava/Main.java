package com.HelloJava;

import java.util.Scanner;

public class Main {

    public static int[][] scan_matrix(int m, int n) {
        Scanner scan = new Scanner(System.in);
        int[][] mat = new int[m][n];
        System.out.println("Enter the matrix " + m + "*" + n + " elements");
        for (int i = 0; i < m; i++) {
            System.out.print("Enter row "+(i+1)+"("+n+" elements) - ");
            for (int j = 0; j < n; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        return mat;
    }

    public static void print_matrix(int[][] mat) {
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] multiply_matrix(int[][] m1, int[][] m2) {
        int m = m1.length;
        int n = m2.length;
        int p = m2[0].length;
        int[][] mat = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                mat[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    mat[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return mat;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Matrix Multiplication Program - ");

        // m*n n*p
        System.out.print("Enter The dimensions of M1 matrix m*n: ");
        int m = scan.nextInt();
        int n = scan.nextInt();
        System.out.printf("Enter The p dimension of M2 matrix n*p (n = %d): ", n);
        int p = scan.nextInt();

        int[][] m1 = scan_matrix(m, n);
        int[][] m2 = scan_matrix(n, p);

        print_matrix(multiply_matrix(m1, m2));

    }
}
