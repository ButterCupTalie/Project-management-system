/**
 * 
 * @author Natalia
 * Person class
 * Class creates Person object for the main method
 *  
 */
public class Person {

	// Initializing variables to create a constructor for person object
	String personRole;
	String personName;
	String personSurname;
	String personPhoneNumber;
	String personEmail;
	String personAddress;
	
/**
 * This method initializing variables for <Person> object
 * 
 * @param initPersonRole
 * @param initPersonName
 * @param initPersonSurname
 * @param initPersonPhoneNumber
 * @param initPersonEmail
 * @param initPersonAddress
 */

	// Creating a constructor by assigning values to the variables
	public Person(String initPersonRole, String initPersonName, String initPersonSurname, String initPersonPhoneNumber, String initPersonEmail, String initPersonAddress) {
 
		this.personRole = initPersonRole;
		this.personName = initPersonName;
		this.personSurname = initPersonSurname;
		this.personPhoneNumber = initPersonPhoneNumber;
		this.personEmail = initPersonEmail;
		this.personAddress = initPersonAddress;
	}
	
/**
 * This method gets role of the <Person> object in the project e.g Architect, Contractor, Customer
 * @return person role
 */
    public String getPersonRole(){
        return personRole;
    }

/** 
 * This method gets surname of the person in <Person> object
 * @return person surname
 */
    public String getSurname(){
        return personSurname;
    }

 /**
  * This method gets phone number of the person in <Person> object for editing purposes in the main method
  * @param personPhoneNumber
  */
    public void setPersonPhoneNumber(String personPhoneNumber){
        if(personPhoneNumber.isEmpty() != true){
            this.personPhoneNumber = personPhoneNumber;
        }
    }
/**
 * This method gets email address of the person in <Person> object for editing purposes in the main method
 * @param personEmail
 */
    public void setPersonEmail(String personEmail){
        if(personEmail.isEmpty() != true){
            this.personEmail = personEmail;
        }
    }
    
/**
 * This method gets physical address of the person in <Person> object for editing purposes in the main method
 * @param personAddress
 */
    public void setPersonAddress(String personAddress) {
    	if(personAddress.isEmpty() != true) {
    		this.personAddress = personAddress;
    	}
    }
    
/**
 * This method writes information about <person> object into the txt file
 * @return output with data
 */
    public String write() {
        String output = personRole + "\n"+ personName + "\n" + personSurname + "\n" + personPhoneNumber + "\n" + personEmail + "\n" + personAddress; 
   
        return output;
     }
 
/**
 * This method displaying information about the object <person> in the main method
 */

	public String toString() {
		String output = "";
		output = personRole + personName + " " + personSurname  + ", " + personPhoneNumber + ", " + personEmail + ", " + personAddress;

		return output;

	}
}
