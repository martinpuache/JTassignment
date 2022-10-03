package java_jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;

import jdbc.model.Student;


public class jdbcDemo {
	
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String userName = "sys as sysdba";
			String password = "123"; //not real password
			
			Connection con = DriverManager.getConnection(url, userName, password);
			
			//Statement stmt = con.createStatement();
			
			/*String query = "CREATE TABLE STUDENT("
							+ "STUD_ID VARCHAR(6) PRIMARY KEY, "
							+ "STUD_NAME VARCHAR2(20) NOT NULL, "
							+ "ADDRESS VARCHAR2(30) NOT NULL, "
							+ "BRANCH VARCHAR2(10) NOT NULL) ";*/
			
			//String query = "INSERT INTO STUDENT VALUES('ST101', 'JOHN', 'BRAZIL', 'CS')";
			
			//stmt.execute(query);
			
			//PreparedStatement stmt = con.prepareStatement("insert into student values(?,?,?,?)");
			//PreparedStatement stmt = con.prepareStatement("select * from student where stud_id = ?");
			
			//stmt.setString(1, "ST102");
		
			String query = "{? = call STUD_DETAIL(?)}";
			
			CallableStatement cs = con.prepareCall(query);
		
			cs.registerOutParameter(1, Types.VARCHAR);
			
			cs.setString(2, "ST101");
			
			cs.execute();
			
			//System.out.println("Student Name: "+ cs.getString(1));
			
			//ASSIGNMENT (inserting using a stored procedure)
			/*PreparedStatement stmt = con.prepareStatement("call ADD_STUDENT(?,?,?,?)");
			stmt.setString(1, "ST104");
			stmt.setString(2, "MARTIN");
			stmt.setString(3, "PHILIPPINES");
			stmt.setString(4, "CS");
			
			stmt.execute();*/
			
			//ASSIGNMENT (fetch and display all records from the STUDENT table)

			
			Statement stmt = con.createStatement();
			ResultSet allStudentRecords = stmt.executeQuery("SELECT * FROM STUDENT");
			
			ArrayList <Student> students = new ArrayList<Student>();
			
			while(allStudentRecords.next()) {

				students.add(new Student(allStudentRecords.getString(1), 
						allStudentRecords.getString(2), 
						allStudentRecords.getString(3),
						allStudentRecords.getString(4)));
			}
			
			students.stream()
			.sorted(Comparator.comparing(Student::getStudName))
			.forEach(x -> System.out.println(x.getStudId() 
					+ " " + x.getStudName() 
					+ " " + x.getStudAddress() 
					+ " " + x.getDepartments()));
			
			
			
			/*stmt.setString(1, "ST102");
			stmt.setString(2, "PETER");
			stmt.setString(3, "MUMBAI");
			stmt.setString(4, "EC");*/
			
			//int count = stmt.executeUpdate();
			
			/*ResultSet rs = stmt.executeQuery();*/
			
			//System.out.println(count + " row(s) inserted");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
