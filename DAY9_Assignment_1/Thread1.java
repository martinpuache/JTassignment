package Task_1;

public class Thread1 extends Thread {
    BankAccount bankAccount;
    int amount;
    Thread t;

    Thread1(BankAccount bankAccount, int amount)
    {
        this.bankAccount = bankAccount;
        this.amount = amount;
        t = new Thread(this);
        start();
    }

    public void run(){
        bankAccount.withdrawException(amount);
    }
}
