package Task_3;

public class Item {
    String name;
    int amount, cost;

    public Item (String name, int amount, int cost)
    {
        this.name = name;
        this.amount = amount;
        this.cost = cost;
    }

    public String getName()
    {
        return name;
    }

    public int getAmount()
    {
        return amount;
    }

    public int getCost()
    {
        return cost;
    }

    public int getTotalCost()
    {
        return amount*cost;
    }
}
