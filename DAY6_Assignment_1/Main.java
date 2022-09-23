package Task_1;
import java.util.ArrayList;
import java.util.Scanner;
 

public class Main {
 

    public static void main(String[] args){

        ArrayList<Course> allCourses = new ArrayList<Course>();
        ArrayList<Student> allStudents = new ArrayList<Student>();

        //Course creation and Student creation
        String courseName, courseDescription;
        String studentName, gender, birthday, address;
        int choice, courseNo, idNo;
        //Enrollment variables
        String courseToBeEnrolled;
        int registeredIdNo;
        //View students under a specific course
        String courseToBeViewed;

        Scanner scanner = new Scanner(System.in);

        while(true) {
 
            //Creating menu
            System.out.println("Press 1 to add a course");
            System.out.println("Press 2 to create new student");
            System.out.println("Press 3 to enroll in to a course");
            System.out.println("Press 4 to view all course details");
            System.out.println("Press 5 to view students under a specific course");
            System.out.println("Press 6 to Quit \n ");
 

            System.out.println("Choose your option");
            choice = scanner.nextInt();
 
            switch (choice) {

                case 1:
                    scanner.nextLine();
                    System.out.println("Enter the course number ");
                    courseNo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the name of the course");
                    courseName = scanner.nextLine();
                    System.out.println("Enter short description of course");
                    courseDescription = scanner.nextLine();
                    allCourses.add(new Course(courseNo, courseName, courseDescription));
                    System.out.println("You have successfully created a course!\n");
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.println("Enter your ID number ");
                    idNo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter your name");
                    studentName = scanner.nextLine();
                    System.out.println("Enter your gender");
                    gender = scanner.nextLine();
                    System.out.println("Enter your birthday");
                    birthday = scanner.nextLine();
                    System.out.println("Enter your address");
                    address = scanner.nextLine();
                    allStudents.add(new Student(idNo, studentName, gender, birthday, address));
                    System.out.println("You have successfully created a new student!\n");
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.println("Enter the name of the course you want to enroll in");
                    courseToBeEnrolled = scanner.nextLine();
                    System.out.println("Enter your registered ID number");
                    registeredIdNo = scanner.nextInt();
                    for (int i = 0; i < allCourses.size(); i++)
                    {
                        if (courseToBeEnrolled.equals(allCourses.get(i).getCourseName()))
                        {
                            for(int j = 0; j < allStudents.size(); j++)
                            {
                                if(registeredIdNo == allStudents.get(j).getIdNo())
                                {
                                    allCourses.get(i).enroll(allStudents.get(j));
                                }
                            }
                            
                        }
                    }
                    System.out.println("You have successfully enrolled!\n");
                    break;
                
                case 4:
                    for(int i = 0; i < allCourses.size(); i++)
                    {
                        System.out.println(allCourses.get(i).getCourseNo() + " " + allCourses.get(i).getCourseName());
                        System.out.println(allCourses.get(i).getCourseDescription()+ "\n");
                    }
                    break;

                case 5:
                    scanner.nextLine();
                    System.out.println("Please enter the course of the students you want to view");
                    courseToBeViewed = scanner.nextLine();
                    for (int i = 0; i < allCourses.size(); i++)
                    {
                        if(allCourses.get(i).getCourseName().equals(courseToBeViewed))
                        {
                            for(int j = 0; j < allCourses.get(i).getStudentsEnrolled().size() ; j++)
                            {
                                System.out.println(allCourses.get(i).getStudentsEnrolled().get(j).name);
                            }
                        }
                    }
                    break;

                case 6:
                    System.exit(0);
 
                default:
                    System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
            }
        }
    }
}