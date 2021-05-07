package ikinciHaftaOdev;

public class Main {

	public static void main(String[] args) {
		
		Courses course1 = new Courses(1, "Java", "Engin Demiroğ", 30);
		Courses course2 = new Courses(2, "C#", "Engin Demiroğ", 40);
		Courses course3= new Courses(3, "Python", "Engin Demiroğ", 100);
		
		Courses[] courses = {course1,course2,course3};
		
		for(Courses course : courses){
			System.out.println(course.name +" kursu. Eğitmen "+ course.instructor+ " ilerleme %"+course.progress );
		}
		
		System.out.println("---------------------------------------------------------");
		
		CoursesManager coursesManager = new CoursesManager();
		coursesManager.courseFinishAndContinue(course3);
		coursesManager.courseStart(course1);

	}

}
