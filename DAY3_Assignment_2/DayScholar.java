package Assignment_2;

public class DayScholar implements Student {
    int registrationNo;
    String department, name;

    public DayScholar(int registrationNo, String department, String name)
    {
        this.registrationNo = registrationNo;
        this.department = department;
        this.name = name;
    }

    public void getDetails()
    {
        System.out.println("Hostel No. INVALID" + " Room No. INVALID");
        System.out.println("Registration No. "+ registrationNo + " Department: " + department);
        System.out.println("Name: " + name);
    }
    
}
