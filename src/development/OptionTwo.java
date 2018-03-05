package development;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 * @author Alperen Ekin 230201010,Seymur Babaþlý 220201064
 *
 */
public class OptionTwo {
	ArrayList<String> option2=new ArrayList<String>();
	public void Start(){
		DataAccessLayer data=new DataAccessLayer();
		data.ReadXml();
			for(int i=0;i<data.aList.size();i++) {
				for(int k=0;k<data.aList.size();k++) {
					if(data.aList.get(i).getName().equals(data.aList.get(k).getStudent().getName())) {
						option2.add(data.aList.get(i).getName());
						}
					}
			}
			Set<String> hs = new HashSet<>();	
			hs.addAll(option2);
			option2.clear();
			option2.addAll(hs);
			for(int j=0;j<option2.size();j++) {
				System.out.println(option2.get(j));
			}
	}
}