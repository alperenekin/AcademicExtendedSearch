package development;

/**
 * @author Alperen Ekin 230201010,Seymur Babaþlý 220201064
 *
 */
public class University {
	String name;
	String founded_year;
	String country;
	public University(String name,String founded_year,String country) {
		this.name=name;
		this.founded_year=founded_year;
		this.country=country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setfounded_year(String founded_year) {
		this.founded_year = founded_year;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getfounded_year() {
		return founded_year;
	}
	public String getCountry() {
		return country;
	}
}
