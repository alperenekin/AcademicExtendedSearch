package development;

/**
 * @author Alperen Ekin 230201010,Seymur Babaþlý 220201064
 *
 */
public class Advisor {
	Student student;
	String name;
	Thesis thesis;
	University university;
	
	public Advisor(Student student,String name, Thesis thesis, University university) {
		this.name = name;
		this.thesis = thesis;
		this.university = university;
		this.student=student;
	}
	public void setStudent(Student student) {
		this.student=student;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Thesis getThesis() {
		return thesis;
	}
	public void setThesis(Thesis thesis) {
		this.thesis = thesis;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public Student getStudent() {
		return student;
	}
	
}
