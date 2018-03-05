package development;
import java.util.Scanner;
/**
 * @author Alperen Ekin 230201010,Seymur Babaþlý 220201064
 *
 */
public class OptionFive {
	public void Start() {
		DataAccessLayer data=new DataAccessLayer();
		data.ReadXml();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter an advisor name");
		String 	advisor=scn.nextLine();
		scn.close();
		for(int i=0;i<data.aList.size();i++) {
			if(advisor.equals(data.aList.get(i).getName()))
				System.out.println(data.aList.get(i).getName()+"----"+data.aList.get(i).getUniversity().getName());
			}
		}
}

