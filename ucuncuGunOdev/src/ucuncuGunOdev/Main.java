package ucuncuGunOdev;

public class Main {

	public static void main(String[] args) {
		
		StudentUser user1 = new StudentUser();
		user1.setFirstName("Ali Furkan");
		user1.setId(1);
		user1.setLastName("Kurban");
		user1.setStudentMail("alifurkan@hotmail.com");
		user1.setStudentPassword("ali123");
		user1.setStudentNumber("182");
		
		InstructorUser user2 = new InstructorUser();
		user2.setId(2);
		user2.setFirstName("Engin");
		user2.setLastName("Demiro�");
		user2.setInstructorMail("engindemirog@gmail.com");
		user2.setInstructorPassword("engin123"); 
		user2.setProfession("Java");
		
		
		System.out.println("��renci ad� : " + user1.getFirstName());
		System.out.println("E�itmen ad� : " + user2.getFirstName());
		System.out.println("��renci soyad� : " + user1.getLastName());
		System.out.println("E�itmen soyad� : " + user2.getLastName());
		System.out.println("��renci mail : " + user1.getStudentMail());
		System.out.println("E�itmen mail : " + user2.getInstructorMail());
		System.out.println("E�itmen uzmanl��� : " + user2.getProfession());
		
		System.out.println("**************************************************************");
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.del(user2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.startLesson(user2);
		instructorManager.finishLessons(user2);

		StudentManager studentManager = new StudentManager();
		studentManager.attendRollCall(user1);
		
		
		
		
	}

}
