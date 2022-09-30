package Task_3;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCartMenu {

    int choice;
    Scanner scanner = new Scanner(System.in);

    String category, itemName;
    int amount, cost;

    String nameToBeRemoved, categoryToBeRemoved;
    int costToBeRemoved, amountToBeRemoved;
    
    public ShoppingCartMenu ()
    {
        Map<String, Item> shoppingCart = new HashMap<String, Item>();
        try 
        {
            while(true) {
 
                //Creating menu
                System.out.println("Press 1 to add an item");
                System.out.println("Press 2 to display all items");
                System.out.println("Press 3 to display total cost");
                System.out.println("Press 4 to remove an item");
                System.out.println("Press 5 to Quit \n ");
     
    
                System.out.println("Choose your option");
                choice = scanner.nextInt();
     
                switch (choice) {
    
                    case 1:
                        scanner.nextLine();
                        System.out.println("Enter the category");
                        category = scanner.nextLine();
                        System.out.println("Enter the item name");
                        itemName = scanner.nextLine();
                        System.out.println("Enter the amount");
                        amount = scanner.nextInt();
                        System.out.println("Enter the cost");
                        cost = scanner.nextInt();

                        for(Item i : shoppingCart.values())
                        {
                            if(i.getName().equals(itemName) & i.getCost() == cost)
                            {
                                amount = i.getAmount() + amount;
                            }
                        }
                        
                        
                        shoppingCart.put(category, new Item(itemName, amount, cost));
                        System.out.println("You have successfully added an item!\n");
                        break;
    
                    case 2:
                        /*for (String i : shoppingCart.keySet())
                        {
                            System.out.println(i + " Amount:" + shoppingCart.get(i).getAmount() + " " + shoppingCart.get(i).getName() + " PHP" + shoppingCart.get(i).getCost());
                        }*/

                        shoppingCart.entrySet().stream()
                        .forEach(x -> System.out.println(x.getKey() + " Amount:" + x.getValue().getAmount() + " " + x.getValue().getName()
                        + " PHP" + x.getValue().getCost()));

                        System.out.println("\n");
                        break;
    
                    case 3:
                        int totalCost = 0;
                        for (Item i: shoppingCart.values())
                        {
                            totalCost += (i.getAmount() * i.getCost());
                        }

                        System.out.println("Total cost: " + totalCost);
                        System.out.println("\n");
                        break;
                    
                    case 4:
                        if (shoppingCart.isEmpty())
                        {
                            System.out.println("There are no items!");
                            System.out.println("\n");
                            break;
                        }
                        else
                        {
                            scanner.nextLine();
                            System.out.println("What is the category of the item you want to remove?");
                            categoryToBeRemoved = scanner.nextLine();
                            System.out.println("What is the name of the item you want to remove?");
                            nameToBeRemoved = scanner.nextLine();
                            System.out.println("Enter the cost of the item");
                            costToBeRemoved = scanner.nextInt();
                            
                            for(String i : shoppingCart.keySet())
                            {
                                if(i.equals(categoryToBeRemoved) & shoppingCart.get(i).getName().equals(nameToBeRemoved) & shoppingCart.get(i).getCost() == costToBeRemoved)
                                {
                                    shoppingCart.remove(categoryToBeRemoved, shoppingCart.get(i));
                                    System.out.println("You have successfully removed "+ nameToBeRemoved);
                                }
                                else
                                {
                                    System.out.println("Item does not exist!");
                                }
                            }
                            
                            System.out.println("\n");
                            break;

                        }
                        
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
