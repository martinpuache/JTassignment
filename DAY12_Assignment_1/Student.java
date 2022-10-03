package jdbc.model;

public class Student {
	private String studId;
	private String studName;
	private String studAddress;
	private String departments;
	
	public Student(String id, String name, String address, String deparment) {
		this.studId = id;
		this.studName = name;
		this.studAddress = address;
		this.departments = deparment;
	}
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}

}
