package com.HelloJava;

import java.sql.Array;

public class Main {

    public static void main(String[] args) {
        Vector_ v1 = new Vector_(new int[]{1, 2, 3, 4});
        Vector_ v2 = new Vector_(new int[]{13, -5, 1, 6});
        v1.print_vector();
        Vector_ v3 = v1.add(v2);
        v3.print_vector();

    }
}

class Vector_ {
    int dimension;
    int[] arr = new int[dimension];

    public Vector_(int dimension) {
        this.dimension = dimension;
    }
    public Vector_(int[] arr) {
        this(arr.length);
        this.arr = arr;
    }

    void print_vector() {
        System.out.print("[");
        for (int i = 0; i < dimension-1; i++) {
            System.out.print(this.arr[i]+", ");
        }
        System.out.println(this.arr[dimension-1]+"]");
    }

    Vector_ add(Vector_ v) {
        if (this.dimension != v.dimension) {
            System.out.println("Not Applicable");
            return new Vector_(0);
        }
        int[] sum = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            sum[i] = this.arr[i] + v.arr[i];
        }
        return new Vector_(sum);
    }

    int dot(Vector_ v) {
        if (this.dimension != v.dimension) {
            System.out.println("Not Applicable");
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < dimension; i++) {
            sum += this.arr[i] * v.arr[i];
        }
        return sum;


    }

}

