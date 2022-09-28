package Task_1;

public class BankAccount {
    int savings = 1000;

    void withdraw(int amount) throws InvalidWithdrawalException{
        if(savings < amount)
        {
            throw new InvalidWithdrawalException("There is not enough money!");
        }
        else{
            savings = savings - amount;
        }
    }

    synchronized void withdrawException(int arg)  {

        try {
            withdraw(arg);
            System.out.println("You have withdrawn: " + arg + " Savings left: " + savings);
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) {
            System.out.println("Thread has been interrupted.");
        }
        catch (InvalidWithdrawalException e)
        {
            System.out.println(e);
        }
        
    }
}
