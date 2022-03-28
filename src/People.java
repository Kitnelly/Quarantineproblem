import java.util.Map;
import java.util.TreeMap;

public class People {
	private Map<String, Integer> people = new TreeMap<>();
	
	public boolean checkPerson(String name) {
		if(people.containsKey(name)) { 
			return true;
		}	
		return false;
	}
	
	public void anyoneHome(String name, int place) {
		if(checkPerson(name) == false) {
			people.put(name, place);
		}
	}
	
	public int getSize() {
		return(people.size());
	}
}

