package Assignment;

public class SportFactory {

    public Sport createSport(String inputClass)
    {
        if(inputClass == null || inputClass.isEmpty())
        {
            return null;
        }
        switch(inputClass)
        {
            case "Badminton":
                return new Badminton();
            case "Football":
                return new Football();
            default:
                throw new IllegalArgumentException("Unknown class" + inputClass);
        }
    }
    
}
