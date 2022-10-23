package Assignment1Part2;

import java.util.ArrayList;

import Assignment1.Course;
import Assignment1.Lecturer;
import Assignment1.Student;
import Assignment1.Module;

public class App {
	public static void main (String args[]) {
		
		// s (number) being the students number
		Student s1 = new Student("Matt Smyth", "19869081", "1982-10-28");
		Student s2 = new Student("Oliva Cooke", "19869082", "1993-11-27");
		Student s3 = new Student("Rick Astly", "19869082", "1986-10-17");
		Student s4 = new Student("Matt Mercer", "19869083", "2000-02-27");
		Student s5 = new Student("Gamer Cat", "19869084", "2002-12-10");
		Student s6 = new Student("Wiggly Tough", "19869085", "1997-03-02");
		Student s7 = new Student("Vu Neeson", "19869086", "2001-01-12");
		Student s8 = new Student("Rowlet Owlson", "19869087", "1997-05-02");
		
		// L (number) being the lectures number
		Lecturer l1 = new Lecturer("Izzy Bell", "7592101","1980-10-14");
		Lecturer l2 = new Lecturer("Tom Nook", "7592102", "1978-09-25");
		Lecturer l3 = new Lecturer("Cellest Feathers", "7592103", "1991-11-02");
		
		// m (number) being the modules number
		Module m1 = new Module("Software Eng.", "CT4101", l1);
		Module m2 = new Module("Python Basics", "CT543", l1);
		Module m3 = new Module("Economics", "CT4112", l2);
		Module m4 = new Module("How to be Pascal", "CT340", l2);
		Module m5 = new Module("Astronomy", "CT242", l3);
		Module m6 = new Module("Card Tricks", "CT340", l3);
		
		
		// c (number) being the course number
		Course c1 = new Course("Computer Science and I.T.", "2022-09-05", "2023-05-27");
		c1.addModule(m1);
		c1.addModule(m2);
		c1.addModule(m5);
		c1.addModule(m6);
		Course c2 = new Course("General IT with Arts", "2022-09-05", "2023-05-24");
		c2.addModule(m1);
		c2.addModule(m2);
		c2.addModule(m3);
		Course c3 = new Course("Applyed Socal Sciance", "2022-09-05", "2023-05-09");
		c3.addModule(m1);
		c3.addModule(m3);
		c3.addModule(m4);
		c3.addModule(m5);

		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		//adding the modules and courses to students
		s1.addCourse(c1);
		s1.addModule(m1);
		s1.addModule(m2);
		s1.addModule(m5);
		s1.addModule(m6);

		s2.addCourse(c1);
		s2.addModule(m1);
		s2.addModule(m2);

		s3.addCourse(c2);
		s3.addModule(m1);
		s3.addModule(m2);
		s3.addModule(m3);

		s4.addCourse(c2);
		s4.addModule(m1);
		s4.addModule(m2);
		s1.addModule(m6);

		s5.addCourse(c1);
		s5.addModule(m6);

		s6.addCourse(c3);
		s6.addModule(m2);
		s6.addModule(m3);
		s6.addModule(m4);

		s7.addCourse(c3);
		s7.addModule(m1);
		s7.addModule(m4);
		s7.addModule(m5);

		s8.addCourse(c2);
		s8.addCourse(c3);
		s8.addModule(m1);
		s8.addModule(m2);
		s8.addModule(m3);
		s8.addModule(m4);
		s8.addModule(m5);

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);

		System.out.println("Courses");
		for(int a = 0; a < courses.size(); a++){
			String CorInfor = "";
			CorInfor += "Course name: ";
			CorInfor += courses.get(a).getName();
			CorInfor += "\nModules:\n";
			for(int b = 0; b < courses.get(a).getModules().size(); b++)
			{
				CorInfor += "Name: ";
				CorInfor += courses.get(a).getModules().get(b).getName();
				CorInfor += "Code: ";
				CorInfor += courses.get(a).getModules().get(b).getId();
				CorInfor += "\n";
			}
			CorInfor += "\n";
			System.out.println(CorInfor);
		}
		
		System.out.println("Students");
		for(int a = 0; a < students.size(); a++){
			String StudInfo = "";
			StudInfo += "\nID: ";
			StudInfo += students.get(a).getId();
			StudInfo += "\nName: ";
			StudInfo += students.get(a).getName();
			StudInfo += "\n";

			StudInfo += "\nModules:\n";
			for(int b = 0; b < students.get(a).getModules().size(); b++)
			{
				StudInfo += "Name: ";
				StudInfo += students.get(a).getModules().get(b).getName();
				StudInfo += "\t\tCode: ";
				StudInfo += students.get(a).getModules().get(b).getId();
				StudInfo += "\n";
			}

			StudInfo += "\nCourses:\n";
			for(int c = 0; c < students.get(a).getCourses().size(); c++)
			{
				StudInfo += "Name: ";
				StudInfo+= students.get(a).getCourses().get(c).getName();
				StudInfo += "\n";
			}
			System.out.println(StudInfo);
		}
	}
}


