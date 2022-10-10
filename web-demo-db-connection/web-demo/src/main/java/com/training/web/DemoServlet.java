package com.training.web;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.web.Student;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/demo-servlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	String msg = "Kevin";
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    ArrayList <Student> students = new ArrayList<Student>();
    boolean isValid = false;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String userName	= request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		for(int i = 0; i < students.size(); i++) {
			if(userName.equals(students.get(i).getStudName()) & (password.length() > 0))
			{
				isValid = true;
				break;
			}
			else {
				isValid = false;
			}
			
		}
		
		if (isValid) {
			out.println("<html><body>");
			out.println("<h1>Login Successful: Welcome "+userName + "!</h1>");
			out.println("/<body></html>");
		}
		else if (isValid == false) {
			out.println("<html><body>");
			out.println("<h1>Login Failed: Try again</h1>");
			out.println("/<body></html>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				
				String url = "jdbc:oracle:thin:@localhost:1748/xe";
				String userName = "sys as sysdba";
				String password = "123";
				
				Connection con = DriverManager.getConnection(url, userName, password);
				
				System.out.println("Connected to the db");
				
				Statement stmt = con.createStatement();
				ResultSet allStudentRecords = stmt.executeQuery("SELECT * FROM STUDENT_TEST");
				
				
				while(allStudentRecords.next()) {
	
					students.add(new Student(allStudentRecords.getInt(1), 
							allStudentRecords.getString(3), 
							allStudentRecords.getString(2)));
			}
				doGet(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
