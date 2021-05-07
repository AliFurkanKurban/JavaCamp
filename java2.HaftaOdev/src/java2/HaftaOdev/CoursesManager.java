package java2.HaftaOdev;

public class CoursesManager {
	public void courseFinishAndContinue(Courses course) {
		System.out.println(course.name + " kursu bitirildi ve yeni ödeve devam ediliyor.");
	}
	
	public  void courseStart(Courses course) {
		System.out.println(course.name + " kursu ödevine başlandı.");
	}
}
