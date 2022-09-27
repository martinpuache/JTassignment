package Task_2;

public class answerChecker extends Thread {
    private String threadName;
    public int ans;
    Thread t;
    multipleOf5 table5 = new multipleOf5("Thread 1");

    answerChecker(String name)
    {
        super(name);
        this.threadName = name;
        t = new Thread(this, "thread");
        //start();
    }

    public void run(){
        try {
            table5.join(1500);
            while(table5.isAlive()){
                if((table5.ans%2) == 0){
                    System.out.println("Even");
                }
                else{
                    System.out.println("Odd");
                }
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(this.threadName + " has been interrupted");
        }
        System.out.println(this.threadName + " has finished");
    }
}
