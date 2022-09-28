package Task_2;

public class Main {
    public static void main(String[] args) throws Exception {
        Food food = new Food();
        new Chef(food);
        new Waiter(food);
        
    }
}
