package Assignment_2;

public class Hosteller implements Student {
    int hostelNo, roomNo, registrationNo;
    String department, name;

    public Hosteller(int hostelNo, int roomNo, int registrationNo, String department, String name)
    {
        this.hostelNo = hostelNo;
        this.roomNo = roomNo;
        this.registrationNo = registrationNo;
        this.department = department;
        this.name = name;
    }

    public void getDetails()
    {
        System.out.println("Hostel No. "+ hostelNo + " Room No. "+ roomNo);
        System.out.println("Registration No. "+ registrationNo + " Department: " + department);
        System.out.println("Name: " + name);
    }
}