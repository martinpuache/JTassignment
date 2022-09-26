package Task_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();

        studentMap.put(101, new Student(101, "Sarah", 24));
        studentMap.put(102, new Student(102, "Hector", 21));
        studentMap.put(103, new Student(103, "Sonny", 22));
        studentMap.put(104, new Student(104, "Moses", 22));

        for(int key : studentMap.keySet())
        {
            Student stud = studentMap.get(key);

            if(stud.getName().startsWith("S") || stud.getName().startsWith("s"))
            {
                System.out.println("Key: "+ key + " " + stud.getName());
            }
        }


    }
}
