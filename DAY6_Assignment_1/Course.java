package Task_1;

import java.util.ArrayList;

public class Course {
    String name, description;
    int courseNo;
    ArrayList<Student> studentsEnrolled = new ArrayList<Student>();

    public Course (int courseNo, String name, String description)
    {
        this.courseNo = courseNo;
        this.name = name;
        this.description = description;
    }

    public int getCourseNo()
    {
        return courseNo;
    }
    public String getCourseName()
    {
        return name;
    }
    public String getCourseDescription()
    {
        return description;
    }
    public void enroll(Student student)
    {
        studentsEnrolled.add(student);
    }

    public ArrayList<Student> getStudentsEnrolled()
    {
        return studentsEnrolled;
    }
}
