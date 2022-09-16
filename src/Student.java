public class Student {
    String studentName;
    int studentAge;
    int studentRollNo;
    int studentMarks;

    public Student(String name, int age, int rollNo, int marks){
        studentName = name;
        studentAge = age;
        studentRollNo = rollNo;
        studentMarks = marks;

        if(marks < 30)
        {
            System.out.println("Marks less than 30 cannot be accepted");
        }
    }

    public String getName(){
        return studentName;
    }
}
