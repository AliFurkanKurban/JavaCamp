package ucuncuGunOdev;

public class InstructorManager extends UserManager {
	public void startLesson(InstructorUser instructorUser) {
		System.out.println(instructorUser.getProfession()+" dersi baþlatýldý." );
	}
	
	public void finishLessons(InstructorUser instructorUser) {
		System.out.println(instructorUser.getProfession()+" dersi bitirildi" );
	}
}
