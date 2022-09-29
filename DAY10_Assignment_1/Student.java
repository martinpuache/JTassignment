package Task_1;

public class Student {
    String name, grade;
    int age;

    public Student(String name, int age, String grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public String getGrade()
    {
        return grade;
    }
}
