package java2.HaftaOdev;

public class CoursesManager {
	public void courseFinishAndContinue(Courses course) {
		System.out.println(course.name + " kursu bitirildi ve yeni �deve devam ediliyor.");
	}
	
	public  void courseStart(Courses course) {
		System.out.println(course.name + " kursu �devine ba�land�.");
	}
}
