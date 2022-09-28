package Task_2;

public class Food {
    boolean isCooked = false;
    String food;

    synchronized void cook(String input)
    {
        if(isCooked)
        {
            try {
                wait();
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.food = input;
        System.out.println("The " + input + " is being prepared.");
        isCooked = true;
        notify();
    }

    synchronized void serve()
    {
        if(!isCooked)
        {
            try {
                wait();     
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isCooked = false;
        System.out.println(food + " is being served!");
        notify();
    }
}
