package Task_2;

public class Waiter implements Runnable {
    Food food;
    Thread t;
    
    public Waiter(Food food)
    {
        this.food = food;
        t = new Thread(this, "Waiter");
        t.start();
    }

    public void run()
    {
        int i = 0;
        while(i < 10)
        {
            food.serve();
            i++;
        }
    }
}
