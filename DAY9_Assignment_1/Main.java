package Task_1;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount bankAcc = new BankAccount();

        Thread1 t1 = new Thread1(bankAcc, 100);
        Thread1 t2 = new Thread1(bankAcc, 200);
        Thread1 t3 = new Thread1(bankAcc, 500);
        Thread1 t4 = new Thread1(bankAcc, 500);

        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
            t4.t.join();
        } 
        catch (InterruptedException e) {
            System.out.println("Main thread has been interrupted");
        }
    }
}
