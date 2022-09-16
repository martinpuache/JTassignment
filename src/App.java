public class App extends Student {
    public App(String name, int age, int rollNo, int marks) {
        super(name, age, rollNo, marks);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Martin", 22, 30, 29);
        Student student2 = new Student("Mark", 27, 14, 79);

        System.out.println("Student 2: " + student2.studentName + " age: " + student2.studentAge + " roll no: " + student2.studentRollNo + " marks: " + student2.studentMarks);
    }
}
