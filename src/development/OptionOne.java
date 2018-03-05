package development;
import java.util.Scanner;
/**
 * @author Alperen Ekin 230201010,Seymur Babaþlý 220201064
 *
 */
public class OptionOne {
	public void Start(){
		DataAccessLayer data=new DataAccessLayer();
		data.ReadXml();
		Scanner department=new Scanner(System.in);
		System.out.println("Enter department");
		String 	dep=department.nextLine();
		if(dep.equals("MATHEMATICS")) {
			dep="MATH";
		}
		DepartmentName x=DepartmentName.valueOf(dep);
		Scanner uni=new Scanner(System.in);
		System.out.println("Enter university");
		String university=uni.nextLine();
		for(int k=0;k<data.uList.size();k++) {
			if(x.equals(data.sList.get(k).getDname()) && university.equals(data.uList.get(k).getName())) {
				System.out.println(data.tList.get(k).getName());
			}
			department.close();
			uni.close();
		}
		
	
	}
}
