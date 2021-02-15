
public class Project {
	
	// Initializing variables to create a constructor for project object
	String number;
	String name;
	String type;
	String address;
	String erfNumber;
	String deadline;
	String finalised;
	int totalFee;
	int paidToDate;
	
	// Creating a constructor by assigning values to the variables
	public Project(String initNumber, String initName, String initType, String initAddress, String initErfNumber, String initDeadline, String initFinalised, int initTotalFee, int initPaidToDate) {
		
		number = initNumber;
		name = initName;
		type = initType;
	    address = initAddress;
		erfNumber = initErfNumber;
		deadline = initDeadline;
		finalised = initFinalised;
		totalFee = initTotalFee;
		paidToDate = initPaidToDate;
	}
	
	// Creating a string to display the information about the object
	public String toString() {
		String output = "";
		output = "\nNumber: " + number + "\nName: " + name + "\nType: " + type + "\nAddress: " + address + "\nERF Number: " + erfNumber + "\nDeadline: " + deadline + "\nStatus: " + finalised + "\nTotal Fee: " + totalFee + "\nPaid to Date: " + paidToDate ;
		
		return output;
	}
	

	}
		



