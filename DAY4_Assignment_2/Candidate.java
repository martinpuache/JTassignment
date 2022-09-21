package Task_2;


public class Candidate {
    String name, gender;
    int expectedSalary;
    
    public Candidate(String name, String gender, int expectedSalary) throws InvalidSalaryException
    {
       if(expectedSalary < 10000)
       {
        throw new InvalidSalaryException("Salary cannot be less than 10000");
       }
       else
       {
        this.name = name;
        this.gender = gender;
        this.expectedSalary = expectedSalary;
       }
    }

    public void getDetails()
    {
        System.out.println(name);
        System.out.println(gender);
        System.out.println("PHP " + expectedSalary);
    }
}
