package Assignment;

public class ContractEmployee implements Organization {
    public double calculateSalary(int basicPay)
    {
        double netPay = (basicPay - (0.12 * basicPay));
        return netPay;
    }

    public double calculateLoan(double netPay)
    {
        double loan = 0.10 * netPay;
        return loan;
    } 
}
