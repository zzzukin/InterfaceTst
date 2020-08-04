package com.company;

public class Employee implements Comparable <Employee>{

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    //    @Override
    public int compareTo(Employee o) {
        return -Double.compare(o.salary, salary);
    }
}
