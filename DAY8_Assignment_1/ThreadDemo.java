package Task_1;

public class ThreadDemo extends Thread {
    private String threadName;
    
    Thread t;

    ThreadDemo(String name, int priorityLevel)
    {
        super(name);
        this.threadName = name;
        setPriority(priorityLevel);
        t = new Thread(this, "thread");
        System.out.println(this.threadName + " has been created");
        start();
    }

    public void run(){
        try {
            for (int i = 0 ; i <= 3 ; i++){
                System.out.println(this.threadName + " is running" + " Output: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(this.threadName + " has been interrupted");
        }
        System.out.println(this.threadName + " has finished");
    }
}
