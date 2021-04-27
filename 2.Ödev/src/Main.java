
public class Main {

	public static void main(String[] args) {
		
		Courses course1 = new Courses();
		course1.id = 1345;
		course1.name = "C# + Angular";
		course1.teacher="Engin Demiro�";
		
		Courses course2 = new Courses();
		course2.id = 5432;
		course2.name = "Java + React";
		course2.teacher="Engin Demiro�";
		
		Courses course3 = new Courses();
		course3.id = 3461;
		course3.name = "Python Temel Kurs";
		course3.teacher="Bilgehan Yaradanakul";
		
		Courses course4 = new Courses(42673,"S�f�rdan C++","Hakan Atarkan");
		
		Categories category1 = new Categories();
		category1.id = 8947256;
		category1.name = "Programlama";
		
		
		Courses[] courses = {
			course1,course2,course3,course4
		};
		
		Categories[] category = {
				category1
			};
		
		for (Courses course:courses) {
			System.out.println("Kurs Ad�: "+course.name);
			System.out.println("Kurs Hocas�: "+course.teacher);
			System.out.println("----------------------------------");
		};
		
		CoursesManager coursesManager = new CoursesManager();
		coursesManager.addCourse("S�f�rdan C# Kursu");
		coursesManager.deleteCourse("S�f�rdan C# Kursu ");

	}

}
