package oop.buoi07.testprotected2;

public class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee employee = new Employee("Teo", "05/05/2005", 10000000);
        employee.testProtected();
        System.out.println(employee);
    }
}
