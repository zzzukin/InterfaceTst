package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	    Employee[] employees = new Employee[3];

        employees[0] = new Employee("Bob", 5000);
        employees[1] = new Employee("Jim", 7000);
        employees[2] = new Employee("Kate", 1000);

        Arrays.sort(employees);

        for(Employee e : employees){
            System.out.println(e.getName() + " " + e.getSalary());
        }
    }
}


