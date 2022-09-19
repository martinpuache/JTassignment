package Assignment;

public class Main {
    
    public static void main(String[] args) throws Exception {
        SportFactory sportFactory = new SportFactory();
        Sport sport = sportFactory.createSport("Badminton");
        sport.pickSport();
    }
    
}
