package Task_2;
import java.util.ArrayList;

public class AddressFilter {
    void printMember(ArrayList<Member> al, String inputAddress)
    {
        for(int i = 0; i < al.size(); i++)
        {
            if(al.get(i).getAddress().equals(inputAddress))
            {
                System.out.println(al.get(i).getName() + "\n");
            }
        }
    }
}
