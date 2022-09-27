package Task_2;

public class multipleOf5 extends Thread {
    private String threadName;
    public int ans;
    Thread t;

    multipleOf5(String name)
    {
        super(name);
        this.threadName = name;
        t = new Thread(this, "thread");
        start();
    }

    public void run(){
        try {
            for(int i = 1; i <= 11; i++){
                ans = 5 * i;
                System.out.println(ans);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(this.threadName + " has been interrupted");
        }
        System.out.println(this.threadName + " has finished");
    }

    public int getAns()
    {
        return ans;
    }
}
