package Task_1;

public class Main {
    public static void main(String[] args) throws Exception {
        new ThreadDemo("Thread #1", 1);
        new ThreadDemo("Thread #2", 1);
        new ThreadDemo("Thread #3", 10);
    }
}
