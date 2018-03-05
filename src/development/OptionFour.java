package development;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Alperen Ekin 230201010,Seymur Babaþlý 220201064
 *
 */
public class OptionFour {
	ArrayList<String> country=new ArrayList<String>();
	public void Start() {
	DataAccessLayer data=new DataAccessLayer();
	data.ReadXml();	
	
	for(int i=0;i<data.uList.size();i++) {
		country.add(data.uList.get(i).getCountry());
	}
	Map<String, Integer> stringsCount = new HashMap<>();
	for(String s: country){
	  Integer c = stringsCount.get(s);
	  if(c == null) c = new Integer(0);
	  c++;
	  stringsCount.put(s,c);
		}
	Map.Entry<String,Integer> mostRepeated = null;
	for(Map.Entry<String, Integer> e: stringsCount.entrySet()) {	
	    if(mostRepeated == null || mostRepeated.getValue()<e.getValue())
	        mostRepeated = e;
		}
	if(mostRepeated != null)
        System.out.println("Country that has the most number of published theses is " + mostRepeated.getKey());
	}
}
