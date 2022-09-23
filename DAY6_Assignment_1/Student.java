package Task_1;

public class Student {
    String name, address, birthday, gender;
    int idNo;
    

    public Student (int idNo, String name, String gender, String birthday, String address)
    {
        this.idNo = idNo;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public int getIdNo()
    {
        return idNo;
    }
    public String getStudentName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public String getBirthday()
    {
        return birthday;
    }
    public String getAddress()
    {
        return address;
    }
}
