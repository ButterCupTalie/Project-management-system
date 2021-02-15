import java.util.Scanner;

public class ProjectsDatabase {
	public static void main (String [] args) {
		
		// Initializing variables to create the project object
		String number;
		String name;
		String type;
		String address;
		String erfNumber;
		String deadline;
		String finalised;
		int totalFee;
		int paidToDate;
		
		
		// Initializing variables to create the person object
		String personName;
		String phoneNumber;
		String email;
		String personAddress;
		
	
		
		Scanner input = new Scanner(System.in);
		
		
		// Using Scanner asking user to input data to capture details to create a project object
		System.out.println("Enter project details: ");
		System.out.println("\nNumber: ");
		number = input.nextLine();

		System.out.println("Name: ");
		name = input.nextLine();

		System.out.println("Type: ");
		type = input.nextLine();

		System.out.println("Address: ");
		address = input.nextLine();

		System.out.println("ERF Number: ");
		erfNumber = input.nextLine();

		System.out.println("Deadline: ");
		deadline = input.nextLine();

		System.out.println("Completion Status: ");
		finalised = input.nextLine();

		System.out.println("Total Fee: ");
		totalFee = input.nextInt();

		System.out.println("Paid to Date: ");
		paidToDate = input.nextInt();
		input.nextLine();

		// Based on information provided by the user creating project object by calling Project class 
		// Project class constructor creates the object Project
		Project prj1 = new Project(number, name, type, address, erfNumber, deadline, finalised, totalFee, paidToDate) ;


		// Using Scanner asking user's input to create architect object for the project
		System.out.println("Enter architect's details: ");
		System.out.println("Name: ");
		personName = input.nextLine();	

		System.out.println("Phone Number: ");
		phoneNumber = input.nextLine();

		System.out.println("Email: ");
		email = input.nextLine();

		System.out.println("Address: ");
		personAddress = input.nextLine();


		// Using constructor from class person creating architect object based on user's input
		Person architect = new Person(personName, phoneNumber, email, personAddress);


		// Using Scanner asking user's input to create contractor object for the project
		System.out.println("Enter contractor's details: ");
		System.out.println("Name: ");
		personName = input.nextLine();

		System.out.println("Phone Number: ");
		phoneNumber = input.nextLine();

		System.out.println("Email: ");
		email = input.nextLine();

		System.out.println("Address: ");
		personAddress = input.nextLine();

		// Using constructor from class person creating contractor object based on user's input
		Person contractor = new Person(personName, phoneNumber, email, personAddress);


		// Asking user's input to create customer object for the project
		System.out.println("Enter customer's details: ");
		System.out.println("Name: ");
		personName = input.nextLine();

		System.out.println("Phone Number: ");
		phoneNumber = input.nextLine();

		System.out.println("Email: ");
		email = input.nextLine();

		System.out.println("Address: ");
		personAddress = input.nextLine();

		// Using constructor from class person creating contractor object based on user's input
		Person customer = new Person(personName, phoneNumber, email, personAddress);



		// Printing project details using created objects
		System.out.println(prj1.toString());
		System.out.println("\nArchitect: " + architect.toString());
		System.out.println("Contractor: " + contractor.toString());
		System.out.println("Customer: " + customer.toString());
		
		

        // Changing deadline for the project
		// Asking user if deadline needs to be changed
		// Replacing value of the variable deadline with a new value and updating the object project with a new value for deadline
		
		System.out.println("\nWould you like to change the daedline for this project (yes/no): ");
		String answer = input.nextLine();
		
		// using if statement to indicate that the user wants to change deadline of the project
		if (answer.equals("yes")) {
			System.out.println("Enter new deadline: ");
			
			// Setting new variable to update old deadline
			String deadline1 = input.nextLine();
			
			// Updating deadline by fetching variable that needs to be updated from the project object
			prj1.deadline = deadline1;
			
		}
			
		// Changing deadline for the project
		System.out.println("\nWould you like to change the amount paid to date (yes/no): ");
		String answer1 = input.nextLine();
		
		// Using if statement to indicate that the user wants to change the amount paid for the project
		if (answer1.equals("yes")) {
			System.out.println("Enter new amount: ");
			
			// Setting new variable to update old value and updating the object project with a new value for amount paid to date
			int paidToDate1 = input.nextInt();
			prj1.paidToDate = paidToDate1;
		
		}
	    // Updating contractor's contact details
		System.out.println("\nWould you like to change the contractor's cotact details (yes/no): ");
		String answer2 = input.nextLine();
		
		// Using if statement to indicate that the user wants to update the contractor's contact details
		if (answer2.equals("yes")) {
						
			// Setting new variables to update contractor's contact details in object contractor
			System.out.println("Enter new phone number : ");
			String phoneNumber1 = input.nextLine();
			architect.phoneNumber = phoneNumber1;
			
			System.out.println("Enter new email address : ");
			String email1 = input.nextLine();
			contractor.email = email1;
			
			System.out.println("Enter new address : ");
			String personAddress1 = input.nextLine();
			contractor.personAddress = personAddress1;
		}
	    // Printing updated information for project summary
		System.out.println(prj1.toString());
		System.out.println("\nArchitect: " + architect.toString());
		System.out.println("Contractor: " + contractor.toString());
		System.out.println("Customer: " + customer.toString());
	
		
		// Finalizing the project 
		System.out.println("\nWould you like to finalise the project: ");
		String answer3 = input.nextLine();
		
		// If answer is yes the follow up question displayed to determine whether an invoice should be generated or not
		if (answer3.equals("yes")) {
			
			System.out.println("\nHas customer already paid the full fee? (yes/no): ");
			String paid = input.nextLine();
			
			// If the customer has not paid full fee invoice is generated 
			if (paid.equals("no")) {
				System.out.println("******INVOICE******");
				
				// Amount due is calculated by subtracting the total amount paid to date from the total fee for the project.
				int amountDue = totalFee - paidToDate;
				
				// Customers details and amount due is printed out 
				System.out.println("\nCustomer: " + customer.toString() + "\nAmount to be paid: " + amountDue);
				
				System.out.println("\n*******************");
			}
			
			
			// Adding completion date to the project by using users input
			System.out.println("\nPlease add completion date of the project: ");
			
			// Creating new variable for project object to update value of the completion status
			String finalised1 = input.nextLine();
			prj1.finalised = "Finalised. Completion Date: " + finalised1;
			
			// Printing project summary
			System.out.println(prj1.toString());			
			
		}
		
	input.close();
	}
	
}
	








// ***References***
// UniProgrammer. 11 October 2017. Java Programming Tutorial - 18 - Getting user Input and Creating Objects. Retrieved 12 February 2021, from
// https://www.youtube.com/watch?v=_9BgM9c8mIo
	
// Working with objects. Retrieved 12 February 2021, from
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Working_with_Objects


