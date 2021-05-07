package ucuncuGunOdev;

public class InstructorUser extends User{
	private String profession;
	private String instructorMail;
	private String instructorPassword;
	
	
	public String getProfession() {
		return this.profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public String getInstructorMail() {
		return this.instructorMail;
	}
	public void setInstructorMail(String instructorMail) {
		this.instructorMail = instructorMail;
	}
	
	
	public void setInstructorPassword(String instructorPassword) {
		this.instructorPassword = instructorPassword;
	}
}
