package Task_1;
import java.util.ArrayList;

public class CollegeFilter {
    void printStudent(ArrayList<Student> al, String inputCollege)
    {
        for(int i = 0; i < al.size(); i++)
        {
            if(al.get(i).getCollege().equals(inputCollege))
            {
                System.out.println(al.get(i).getName());
            }
        }
    }
}
