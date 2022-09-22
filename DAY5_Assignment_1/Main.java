package Task_1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<Student>();
        
        students.add(new Student("Daniel", "Fordham University"));
        students.add(new Student("Kevin", "Fordham University"));
        students.add(new Student("Anna", "Fordham University"));
        students.add(new Student("Elsa", "Fordham University"));

        students.add(new Student("Markif", "UCLA"));
        students.add(new Student("Lebron", "UCLA"));
        students.add(new Student("Kobe", "UCLA"));
        students.add(new Student("Tracy", "UCLA"));

        try (//Accepts input of college
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose the college of students who you want to see");
            String college = sc.nextLine();

            CollegeFilter collegeFilter = new CollegeFilter();
            collegeFilter.printStudent(students, college);
        }


    }
}
