package Task_2;
import java.util.ArrayList;
//Importing Saanner class
import java.util.Scanner;
 

public class Main {
 

    public static void main(String[] args){

        ArrayList<Member> members = new ArrayList<Member>();
        AddressFilter addressFilter = new AddressFilter();
        String name, address, addresString;
        int choice;
        Scanner scanner = new Scanner(System.in);

        while(true) {
 
            //Creating menu
            System.out.println("Press 1 to add a new member");
            System.out.println("Press 2 to view all members");
            System.out.println("Press 3 to view all members of a given address");
            System.out.println("Press 4 to Quit \n ");
 

            System.out.println("Choose your option");
            choice = scanner.nextInt();
 
            switch (choice) {

                case 1:
                    scanner.nextLine();
                    System.out.println("Enter the name ");
                    name = scanner.nextLine();
                    System.out.println("Enter the address");
                    address = scanner.nextLine();
                    members.add(new Member(name, address));
                    System.out.println("You have successfully added a member!\n");
                    break;

                case 2:
                    for(int i = 0; i < members.size(); i++)
                    {
                        System.out.println("Name: "+ members.get(i).getName() + " Address: " + members.get(i).getAddress() + "\n");
                    }
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.println("Enter the address");
                    addresString = scanner.nextLine();
                    addressFilter.printMember(members, addresString);
                    break;

                case 4:
                    System.exit(0);
 
                default:
                    System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
            }
        }
    }
}