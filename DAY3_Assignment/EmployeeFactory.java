package Assignment;

public class EmployeeFactory {

    public Organization createEmployee(String channel)
    {
        if(channel == null || channel.isEmpty())
        {
            return null;
        }
        switch(channel)
        {
            case "permanent employee":
                return new PermanentEmployee();
            case "contractual employee":
                return new ContractEmployee();
            default:
                throw new IllegalArgumentException("Unknown employee: " + channel);
        }
    }
    
}
