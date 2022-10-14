import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/servlet")
public class Servlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) {
    	String msg = "Kevin";
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    ArrayList <User> users = new ArrayList<User>();
    boolean isValid = false;
    boolean isAdmin = false;
    
    String UN, pass, email, dName, userType;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*if(valid == true) {
			ArrayList <User> users = service.getUsersWithCheck();
			request.setAttribute("users" , users);
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			
			rd.forward(request,response);
		}
		
		String email = config.getInitParameter("email");
		
		String dName =  context.getInitParameter("dName");
				
		//String userName =  request.getParameter("uname");
				
		String password = request.getParameter("pwd");
		
		//request.setAttribute("user" , userName);
		
		/*request.setAttribute("courses" , courses);*/
		
		if(users.isEmpty()) {
			getAllUsers();
		}
		
		for(User s: users) {
			if(s.getUserName().equals(request.getParameter("uname")) & s.getPassword().equals(request.getParameter("pwd")) & s.getUsertype().equals("admin")) {
				isValid = true;
				isAdmin = true;
				//to check if the username and password is valid, and if he or she is an admin
			}
			else if(s.getUserName().equals(request.getParameter("uname")) & s.getPassword().equals(request.getParameter("pwd"))) {
				isValid = true;
				isAdmin = false;
				
				UN = s.getUserName();
				pass = s.getPassword();
				email = s.getEmail();
				dName = s.getdName();
				userType = s.getUsertype();
				//to check if the username and password is valid
			}
		}
		
		
		if(request.getParameter("register")!=null) {
			
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			
			rd.forward(request,response);
		}
		else if(request.getParameter("login")!=null & isValid == true & isAdmin == true) {
			
			request.setAttribute("users" , users);
			
			RequestDispatcher rd = request.getRequestDispatcher("login-admin.jsp");
			
			rd.forward(request,response);
		}
		else if(request.getParameter("login")!=null & isValid == true) {
			
			request.setAttribute("username", UN);
			request.setAttribute("password", pass);
			request.setAttribute("email", email);
			request.setAttribute("displayName", dName);
			request.setAttribute("userType", userType);
					
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			
			rd.forward(request,response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("loginFail.jsp");
			
			rd.forward(request,response);
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
				
				/*Statement stmt = con.createStatement();
				ResultSet allCourseRecords = stmt.executeQuery("SELECT * FROM COURSE");*/
				
				if(request.getParameter("register2") !=null) {
					PreparedStatement stmt = con.prepareStatement("insert into user_final values(?,?,?,?,?)");
					stmt.setString(1, request.getParameter("username"));
					stmt.setString(4, request.getParameter("password"));
					stmt.setString(3, request.getParameter("email"));
					stmt.setString(2, request.getParameter("dName"));
					stmt.setString(5, request.getParameter("userType"));
					
					stmt.execute();
					
					RequestDispatcher backToLogin = request.getRequestDispatcher("index.html");
					
					backToLogin.forward(request,response);
					
					getAllUsers();
					
				}
				/*while(allCourseRecords.next()) {
	
					courses.add(new Course(allCourseRecords.getInt(1), 
							allCourseRecords.getString(3), 
							allCourseRecords.getString(4),
							allCourseRecords.getDouble(2)));
			}*/
				doGet(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<User> getAllUsers(){
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			String url = "jdbc:oracle:thin:@localhost:1748/xe";
			String userName = "sys as sysdba";
			String password = "123";
			
			Connection con = DriverManager.getConnection(url, userName, password);
			
			Statement stmt = con.createStatement();
			ResultSet allUserRecords = stmt.executeQuery("SELECT * FROM USER_FINAL");
			
			while(allUserRecords.next()) {

				users.add(new User(
						allUserRecords.getString(1), 
						allUserRecords.getString(4), 
						allUserRecords.getString(3),
						allUserRecords.getString(2),
						allUserRecords.getString(5)));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
		
	}
}
