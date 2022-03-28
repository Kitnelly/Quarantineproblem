
public class Quarantine {

	public static void main(String[] args) {
		People quarantined = new People();
		
		//adding people to the quarantine, method checks to see if person is already in the system
		quarantined.anyoneHome("Jill", 1);
		quarantined.anyoneHome("Jim", 2);
		quarantined.anyoneHome("Dave", 3);
		//Check that Jill won't be added a second time
		quarantined.anyoneHome("Jill", 4);
		
		//how to check if someone is in quarantine already
		System.out.println(quarantined.checkPerson("Jill"));
		
		//Query the number of people who should be quarantined
		System.out.println(quarantined.getSize());
	}

}
