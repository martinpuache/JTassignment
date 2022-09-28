package Task_2;

public class Chef implements Runnable {
    Food food;
    Thread t;

    public Chef(Food food)
    {
        this.food = food;
        t = new Thread(this, "Chef");
        t.start();
    }

    public void run()
    {
        int i = 0;
        while(i < 10)
        {
            food.cook("pizza");
            i++;
        }
    }
}
