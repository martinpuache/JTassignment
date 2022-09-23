package Task_2;

public class Contact {
    String name, address; 
    int number, contactID;
    

    public Contact (int contactID, String name, String address, int number)
    {
        this.name = name;
        this.address = address;
        this.number = number;
        this.contactID = contactID;
    }

    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public int getNumber()
    {
        return number;
    }
    public int getContactID()
    {
        return contactID;
    }
}
