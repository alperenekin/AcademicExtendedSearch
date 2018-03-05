package development;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * @author Alperen Ekin 230201010,Seymur Babaþlý 220201064
 *
 */
public class OptionThree {
		ArrayList<String> option3=new ArrayList<>();
		public void Start() {
		DataAccessLayer data=new DataAccessLayer();
		data.ReadXml();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter an advisor name");
		String 	advisor=scn.nextLine();
		scn.close();
		for(int i=0;i<data.aList.size();i++) {
			if(advisor.equals(data.aList.get(i).getName())) {
				option3.add(data.aList.get(i).getThesis().getYear());			
				}
			}
		Collections.sort(option3);
		for(int k=0;k<option3.size();k++) {
				for(int temp=0;temp<data.aList.size();temp++) {
					if(option3.get(k).equals(data.aList.get(temp).getThesis().getYear()) && advisor.equals(data.aList.get(temp).getName())) {
						System.out.println(data.tList.get(temp).getName()+"---" + option3.get(k));
					}
				}
			}
		}	
}
