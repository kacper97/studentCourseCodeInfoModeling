package studentCourse;

public class Student {
			String name;
			int id;
			Course enrollodOn;
			
			
	public Course getEnrollodOn() {
			return enrollodOn;
	}

	public void setEnrollodOn(Course enrollodOn) {
			this.enrollodOn = enrollodOn;
	}

	public Student(String name, int id){
		this.name=name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
