package ucuncuGunOdev;

public class StudentUser extends User{
	private String studentMail;
	private String studentPassword;
	private String studentNumber;
	

	
	public String getStudentMail() {
		return this.studentMail;
	}
	public void setStudentMail(String studentMail) {
		this.studentMail = studentMail;
	}
	
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	
	public String getStudentNumber(String studentNumber) {
		return this.studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}
