package com.HelloJava;

public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();

        t1.name = "Ram Singh";
        t1.qualification = "PhD - Neural Networks";
        t1.college_name = "SMVDU";
        t1.department_name = "CSE";
        t1.department_number = "EN-001";

        System.out.println(t1.toString());
    }
}

interface College {
    String college_name = null;
}

class Department implements College {
    String department_name;
    String department_number;
    String college_name;
}

class Teacher extends Department {
    String name;
    String qualification;

    @Override
    public String toString() {
        return "Teacher{" +
                "department_name='" + department_name + '\'' +
                ", department_number='" + department_number + '\'' +
                ", college_name='" + college_name + '\'' +
                ", name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}


