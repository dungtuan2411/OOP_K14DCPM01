package oop.buoi01;

public class BankTestDrive {
    public static void main(String[] args) {
        // Nhân viên
        Employee employee = new Employee();
        employee.getEmName();
        employee.getSalary();

        // Khách hàng
        Customer customer = new Customer();
        customer.getAddress();
        customer.getPhone();

        // Tiền 
        Account account = new Account();
        account.show();
    }
}
