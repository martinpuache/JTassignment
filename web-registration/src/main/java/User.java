import javax.persistence.*;


@Entity
@Table(name="User_Final")
public class User {
	
	@Id
	@Column(name="user_name")
	private String userName;
	@Column(name="user_password")
	private String password;
	@Column(name="user_email")
	private String email;
	@Column(name="user_dName")
	private String dName;
	@Column(name="user_type")
	private String usertype;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public User(String userName, String password, String email, String dName, String userType) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.dName = dName;
		this.usertype = userType;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}