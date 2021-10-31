package com.HelloJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

interface College {
    String college_name = null;
}

class Department implements College {
    String depatrmant_name;
    String department_number;

    public Department(String depatrmant_name, String department_number) {

    }
}


