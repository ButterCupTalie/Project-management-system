/**
 * 
 * @author Natalia
 * Project class
 * <br>
 * Class creates project object for the main method of the program
 */
public class Project {

	// Initializing variables to create a constructor for project object
	String projectNumber;
	String projectName;
	String projectType;
	String projectAddress;
	String erfNumber;
	double totalFee;
	double paidToDate;
	String deadline;
	boolean projectFinalised;
	
	
	// Creating different types of <person> to include in the project description 
	
	Person architect;
	Person contractor;
	Person customer;

/**
 * This method initializing variables for Project object
 * 
 * @param initProjectNumber
 * @param initProjectName
 * @param initProjectType
 * @param initProjectAddress
 * @param initErfNumber
 * @param initTotalFee
 * @param initPaidToDate
 * @param initDeadline
 * @param initProjectFinalised
 * @param architect
 * @param contractor
 * @param customer
 */
	// Creating a constructor by assigning values to the variables
	public Project(String initProjectNumber, String initProjectName, String initProjectType, String initProjectAddress,
			String initErfNumber, double initTotalFee, double initPaidToDate, String initDeadline, boolean initProjectFinalised,  
			Person architect, Person contractor, Person customer) {

		this.projectNumber = initProjectNumber;
		this.projectName = initProjectName;
		this.projectType = initProjectType;
		this.projectAddress = initProjectAddress;
		this.erfNumber = initErfNumber;
		this.totalFee = initTotalFee;
		this.paidToDate = initPaidToDate;
		this.deadline = initDeadline;
		this.projectFinalised = initProjectFinalised;
		this.architect = architect;
		this.contractor = contractor;
		this.customer = customer;
	}

/**
 * This method gets project number in Project object to use as identifier in the main method
 * @return project number
 */
	public String getProjectNumber(){
        return projectNumber;
    }
	
/**
 * This method gets deadline of the project for editing purposes in the main method
 * @return deadline
 */
	public String getDeadline(){
	        return deadline;
	}
/**
 * This method gets project finalized status of the project for editing purposes in the main method
 * @return project finalized
 */
    public boolean getProjectFinalised(){
        return projectFinalised;
    }
 
/**
 * This method gets finalized status of the project in order to set status in the main method    
 * @return finalized/not finalized
 */
    public String getFinalisedString(){
        if(projectFinalised){
            return "Finalised";
        }

        else{
            return "Not Finalised";
        }
    }
 
/**
 * This method gets total fee charged for the project to calculate outstanding amount owned by the customer in the main method
 * @return totalFee
 */
    public Double getTotalFee() {
    	return totalFee;
    }
 /**
  * This method gets paid to date amount for the project to calculate outstanding amount owned by the customer in the main method   
  * @return paidTodate
  */
    public Double getPaidToDate() {
    	return paidToDate;
    }
/**
 * This method gets details of the Architect object
 * @return architect
 */
    public Person getArchitect(){
        return architect;
    }
/**
 * This method gets details of the Contractor object
 * @return contractor
 */
    public Person getContractor(){
        return contractor;
    }
/**
 * This method gets details of the Customer object
 * @return customer
 */
    public Person getCustomer(){
        return customer;
    }

  
 /** 
  * This method sets paid to date amount for editing purposes in the main method   
  * @param paidToDate
  */
    public void setPaidToDate(double paidToDate){
        if(paidToDate > 0){
            this.paidToDate = paidToDate;
        }
    }
/**
 * This method sets deadline of the project for editing purposes in the main method 
 * @param deadline
 */
    public void setDeadline(String deadline){
        if(deadline.isEmpty() != true){
            this.deadline = deadline;
        }
    }
/**
 * This method sets finalized status for editing purposes in the main method 
 * @param projectFinalised
 */
    public void setFinalised(String projectFinalised){
        if(projectFinalised.equals("1")){
            if(this.projectFinalised == true){
                this.projectFinalised = false;
            }

            else{
                this.projectFinalised = true;
            }
        }
    }
/**
 * This method sets details of the architect for editing purposes in the main method 
 * @param architect
 */
    public void setArchitect(Person architect){
        this.architect = architect;
    }
/**
 * This method sets details of the contractor for editing purposes in the main method 
 * @param contractor
 */
    public void setContractor(Person contractor){
        this.contractor = contractor;
    }
/**
 * This method sets details of the customer for editing purposes in the main method 
 * @param customer
 */
    public void setCustomer(Person customer){
        this.customer = customer;
    }

/**
 * This method writes information about the project to a txt file
 * @return output
 */

    public String write() {
        String output = projectNumber + "\n" + projectName + "\n" + projectType + "\n" + projectAddress + "\n" + erfNumber + "\n" + 
                        totalFee + "\n" + paidToDate + "\n"+ deadline + "\n" + projectFinalised + "\n" + architect + 
                        "\n" + contractor + "\n" + customer;
     
        return output;
     }
    

    /**
     * This method creating a string to display the information about the object
     * @return output
     */
	public String toString() {
		String output = "";
		output += "\nProject Number: " + projectNumber;
		output += "\nProject Name: " + projectName;
        output += "\nProject Type: " + projectType;
        output += "\nProject Address: " + projectAddress;
        output += "\nErf Number: " + erfNumber;
        output += "\nTotal Fee: " + totalFee;
        output += "\nPaid To Date: " + paidToDate;
        output += "\nDeadline: " + deadline;

        if(projectFinalised){
            output += "\nFinalised: Yes";
        }

        else{
            output += "\nFinalised: No";
        }

        output += "\n" + architect;
        output += "\n" + contractor;
        output += "\n" + customer;
     
		return output;
	}

}
