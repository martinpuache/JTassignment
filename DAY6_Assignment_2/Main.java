package Task_2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
 

public class Main {
 

    public static void main(String[] args){

        ArrayList<Contact> allContacts = new ArrayList<Contact>();

        //Contact creation
        String contactName, contactAddress;
        int choice, contactNo, contactID;
        //search and remove variables
        String contactToBeSearched, nameToBeRemoved; 
        int contactIDToBeRemoved;



        Scanner scanner = new Scanner(System.in);
        try 
        {
            while(true) {
 
                //Creating menu
                System.out.println("Press 1 to add a contact");
                System.out.println("Press 2 to display all contacts");
                System.out.println("Press 3 to search for a contact");
                System.out.println("Press 4 to remove a contact");
                System.out.println("Press 5 to Quit \n ");
     
    
                System.out.println("Choose your option");
                choice = scanner.nextInt();
     
                switch (choice) {
    
                    case 1:
                        scanner.nextLine();
                        System.out.println("Enter the contact ID number");
                        contactID = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter the name");
                        contactName = scanner.nextLine();
                        System.out.println("Enter the address");
                        contactAddress = scanner.nextLine();
                        System.out.println("Enter the number");
                        contactNo = scanner.nextInt();
                        allContacts.add(new Contact(contactID, contactName, contactAddress, contactNo));
                        System.out.println("You have successfully added a contact!\n");
                        break;
    
                    case 2:
                        for(int i = 0; i < allContacts.size(); i++)
                        {
                            System.out.println(allContacts.get(i).getContactID() + " " + allContacts.get(i).getName() + " " + allContacts.get(i).getAddress() + " "+ allContacts.get(i).getNumber());
                        }
                        System.out.println("\n");
                        break;
    
                    case 3:
                        scanner.nextLine();
                        System.out.println("Enter the name of the contact you want to look for");
                        contactToBeSearched = scanner.nextLine();
                        for(int i = 0; i < allContacts.size(); i++)
                        {
                            if(contactToBeSearched.equals(allContacts.get(i).getName()))
                            {
                                System.out.println(allContacts.get(i).getName() + " " + allContacts.get(i).getAddress() + " "+ allContacts.get(i).getNumber());
                            }
                        }
                        System.out.println("\n");
                        break;
                    
                    case 4:
                        scanner.nextLine();
                        System.out.println("What is the name of the contact that you want to remove?");
                        nameToBeRemoved = scanner.nextLine();
                        System.out.println("Enter his or her contact ID number");
                        contactIDToBeRemoved = scanner.nextInt();
                        for(int i = 0; i < allContacts.size(); i++)
                        {
                            if(nameToBeRemoved.equals(allContacts.get(i).getName()) & contactIDToBeRemoved == allContacts.get(i).getContactID())
                            {
                               allContacts.remove(i);
                            }
                        }
                        System.out.println("You have successfully removed "+ nameToBeRemoved);
                        break;
    
                    case 5:
                        System.exit(0);
     
                    default:
                        System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
                }
            }
            
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("You can only input integers for the choice or number");
        }
        
    }
}