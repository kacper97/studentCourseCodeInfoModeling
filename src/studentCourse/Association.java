package studentCourse;

import java.util.ArrayList;

public class Association {
		static ArrayList<Student> students= new ArrayList<Student>();
		static ArrayList<Course> courses= new ArrayList<Course>();
		
	 
		public static void main(String[] args){
			createCourses();
			createStudents();
			students.get(0).setEnrollodOn(courses.get(2));
			students.get(1).setEnrollodOn(courses.get(1));
			students.get(2).setEnrollodOn(courses.get(0));
			students.get(3).setEnrollodOn(courses.get(1));
			for (Student student:students){
				System.out.println(student.getName()+ ", is Enrolled on -> "+ (student.getEnrollodOn().getCourseName()));
			}
			System.out.println("\n");
			for (Course course:courses){
				System.out.println(course.getCourseName());
				for (Student student: course.getEnrolledStudent()
			}
		}
		
		public static void createCourses(){
			courses.add(new Course("Applied Computing"));
			courses.add(new Course("IOT"));
			courses.add(new Course("Entertainments"));
		}
		
		public static void createStudents(){
			students.add(new Student("Adam",1));
			students.add(new Student("Bart",2));
			students.add(new Student("Charles",3));
			students.add(new Student("David",4));
		}
}
