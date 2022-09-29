package Task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List <Student> students = new ArrayList<Student>();

        students.add(new Student("Patrick", 18, "A"));
        students.add(new Student("Elsa", 20, "B+"));
        students.add(new Student("Mark", 22, "A"));
        students.add(new Student("Daniel", 19, "C"));

        /*Collections.sort(students, (s1,s2) -> s1.getAge()-s2.getAge());
        students.forEach(s -> System.out.println(s.getName() + " " + s.getAge()));

        Collections.sort(students, (s1,s2) -> s1.getName().compareTo(s2.getName()));
        students.forEach(s -> System.out.println(s.getName() + " " + s.getAge()));*/

        students.stream().filter(s -> s.getGrade().equals("A"))
        .sorted(Comparator.comparing(Student::getName))
        .forEach(x -> System.out.println(x.getName()));

    }
}
