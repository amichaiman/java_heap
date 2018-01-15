
public class Student {
	private String id;
	private double age;
	private double grade;
	
	public Student(String id, double age, double grade) {
		this.id = id;
		this.age = age;
		this.grade = grade;
	}
	
	public String getId() {
		return id;
	}
	
	public double getAge() {
		return age;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public String toString() {
		return id;
	}
}
