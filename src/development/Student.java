package development;

/**
 * @author Alperen Ekin 230201010,Seymur Babaþlý 220201064
 *
 */
public class Student {
	String id;
	String name;
	University university;
	DepartmentName dname;
	Thesis thesis;
	Advisor advisors;
	public Student(String id, String name, University university, DepartmentName dname, Thesis thesis, Advisor advisors) {
		this.id = id;
		this.name = name;
		this.university = university;
		this.dname = dname;
		this.thesis = thesis;
		this.advisors = advisors;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public DepartmentName getDname() {
		return dname;
	}
	public void setDname(DepartmentName dname) {
		this.dname = dname;
	}
	public Thesis getThesis() {
		return thesis;
	}
	public void setThesis(Thesis thesis) {
		this.thesis = thesis;
	}
	public Advisor getAdvisors() {
		return advisors;
	}
	public void setAdvisors(Advisor advisors) {
		this.advisors = advisors;
	}
}
