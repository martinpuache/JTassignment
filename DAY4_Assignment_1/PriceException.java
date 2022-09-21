package Task_1;
import java.util.Scanner;
import java.util.*;

public class PriceException {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int noItems = 0;
        System.out.println("How many items will you enter?");
        try{
            noItems = sc.nextInt();
            int price[] = new int[noItems];
            for(int i = 0; i < noItems; i++)
            {
                System.out.println("Please enter the price");
                int itemPrice = sc.nextInt();
                price[i] = itemPrice;
            }
            System.out.println("Please enter the index of the price you want to know");
            int index = sc.nextInt();
            System.out.println("The price of that item is "+ price[index]);

        }
        catch (InputMismatchException e){
            System.out.println("Please enter an integer only");
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That is not found within the array");
        }
    }
}