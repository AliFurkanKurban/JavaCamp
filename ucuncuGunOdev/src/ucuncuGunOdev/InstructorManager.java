package ucuncuGunOdev;

public class InstructorManager extends UserManager {
	public void startLesson(InstructorUser instructorUser) {
		System.out.println(instructorUser.getProfession()+" dersi ba�lat�ld�." );
	}
	
	public void finishLessons(InstructorUser instructorUser) {
		System.out.println(instructorUser.getProfession()+" dersi bitirildi" );
	}
}
