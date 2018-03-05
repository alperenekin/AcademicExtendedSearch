package development;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * @author Alperen Ekin 230201010,Seymur Babaþlý 220201064
 *
 */
public class DataAccessLayer {
	ArrayList<Thesis> tList = new ArrayList<Thesis>();
	ArrayList<University> uList = new ArrayList<University>();
	ArrayList<Student> sList = new ArrayList<Student>();
	ArrayList<Advisor> aList = new ArrayList<Advisor>();

	public ArrayList<Thesis> gettList() {
		return tList;
	}

	public void settList(ArrayList<Thesis> tList) {
		this.tList = tList;
	}

	public ArrayList<University> getuList() {
		return uList;
	}

	public void setuList(ArrayList<University> uList) {
		this.uList = uList;
	}

	public ArrayList<Student> getsList() {
		return sList;
	}

	public void setsList(ArrayList<Student> sList) {
		this.sList = sList;
	}

	public ArrayList<Advisor> getaList() {
		return aList;
	}

	public void setaList(ArrayList<Advisor> aList) {
		this.aList = aList;
	}

	public void ReadXml() {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		try {
			
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document doc=builder.parse("genealogy.xml");
			NodeList rootNodes=doc.getElementsByTagName("Advisor");
			for(int i=0;i<rootNodes.getLength();i++) {
				Node rootNode=rootNodes.item(i);
				Element rootElement=(Element) rootNode;
				String adivsor_name=rootElement.getAttribute("name");
				NodeList notesList=rootElement.getElementsByTagName("Student");
				for(int k=0;k<notesList.getLength();k++) {
					Node theNote=notesList.item(k);
					Element noteElement=(Element) theNote;
					String student_name =noteElement.getAttribute("name");
					String id =noteElement.getAttribute("id");
					NodeList thesisList=noteElement.getElementsByTagName("Thesis");
					Node theThesis=thesisList.item(0);
					Element thesisElement=(Element) theThesis;
					String thesis_name =thesisElement.getAttribute("name");
					String year =thesisElement.getAttribute("year");
					NodeList uniList=noteElement.getElementsByTagName("University");
					Node theuni=uniList.item(0)	;
					Element uniElement=(Element) theuni;
					String university_name=uniElement.getAttribute("name");
					String country=uniElement.getAttribute("country");
					String foundedyear=uniElement.getAttribute("foundedYear");
					NodeList depList=noteElement.getElementsByTagName("Department");
					Node theDep=depList.item(0);
					Element depElement=(Element) theDep;
					String department_name=depElement.getAttribute("name");
					if(department_name.equals("MATHEMATICS")) {
						department_name="MATH";
					}	
					DepartmentName depname=DepartmentName.valueOf(department_name);	
					if(department_name=="MATH") {
						depname=DepartmentName.MATH;
					}		
					if(department_name=="PHYSICS") {	
						depname=DepartmentName.PHYSICS;
					}
					if(department_name=="COMPUTER SCIENCE") {
						depname=DepartmentName.COMPUTER_SCIENCE;
					}
					if(department_name=="CHEMISTRY") {						
						depname=DepartmentName.CHEMISTRY;
					}
					University uni=new University(university_name,foundedyear,country);
					Advisor adv=new Advisor(null,adivsor_name,null,uni);
					Student std=new Student(id,student_name,uni,depname,null,adv);
					Thesis thesis=new Thesis(thesis_name,std,uni,year);
					std.setThesis(thesis);
					adv.setThesis(thesis);
					adv.setStudent(std);
					aList.add(adv);
					sList.add(std);
					tList.add(thesis);
					uList.add(uni);
					
				}
					
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
