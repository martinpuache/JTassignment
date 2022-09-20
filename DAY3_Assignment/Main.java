package Assignment;

public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Organization employee1 = employeeFactory.createEmployee("permanent employee");
        Organization employee2 = employeeFactory.createEmployee("contractual employee");

        double netPay = employee1.calculateSalary(15000);
        double netPay2 = employee2.calculateSalary(15000);

        System.out.println("The net salary of a permanent employee with PHP 15000 basic pay is PHP "+ netPay);
        System.out.println("The net salary of a contractual employee is PHP 15000 basic pay is PHP "+ netPay2);

        System.out.println("The loan a permanent employee, with PHP 15000 basic pay, can avail is PHP "+ employee1.calculateLoan(netPay));
        System.out.println("The loan a contractual employee, with PHP 15000 basic pay, can avail is PHP "+ employee2.calculateLoan(netPay2));
    }
    
}
