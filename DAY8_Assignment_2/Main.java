package Task_2;

public class Main {
    public static void main(String[] args) throws Exception {
        /*multipleOf5 t1 = new multipleOf5("Thread 1");
        answerChecker t2 = new answerChecker("Thread 2");

        t1.join(5000);
        t2.join(5000);

        t1.start();
        t2.start();*/

        answerChecker t1 = new answerChecker("Thread 2");
        t1.start();

    }
}
