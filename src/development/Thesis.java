package development;

/**
 * @author Alperen Ekin 230201010,Seymur Babaþlý 220201064
 *
 */
public class Thesis {
	String name;
	Student student;
	University university;
	String year;
	public Thesis(String name, Student student, University university, String year) {
		this.name = name;
		this.student = student;
		this.university = university;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
}

