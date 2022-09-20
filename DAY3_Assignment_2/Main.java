package Assignment_2;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Student student1 = new Hosteller(1, 2, 77456, "English", "Mark");
        student1.getDetails();

        Student student2 = new DayScholar(663342, "Mathematics", "Annabelle");
        student2.getDetails();
    }
}
