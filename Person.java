
public class Person {
	
	// Initializing variables to create a constructor for person object
	String personName;
	String phoneNumber;
	String email;
	String personAddress;
	
	// Creating a constructor by assigning values to the variables
	public Person(String initPersonName, String initPhoneNumber, String initEmail, String initPersonAddress) {
		
		personName = initPersonName;
		phoneNumber = initPhoneNumber;
		email = initEmail;
		personAddress = initPersonAddress;						
	}
	
	// Creating a string to display the information about the object  
	public String toString() {
		String output = "";
		output = personName + ", " + phoneNumber + ", " + email + ", " + personAddress;
	
		return output;

}
}
