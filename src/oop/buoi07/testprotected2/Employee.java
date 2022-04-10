package oop.buoi07.testprotected2;

import oop.buoi07.testprotected.Person;

public class Employee extends Person {
    // attribute
    private double salary;

    // getter setter
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // constructor
    public Employee(String name, String birday, double salary) {
        super(name, birday);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [salary=" + salary + "]" + super.toString();
    }

    public void testProtected() {
        // có thể truy xuất đến name và birthday dù ở khác package
        System.out.println(this.name + ", " + this.birthday);
    }
}
