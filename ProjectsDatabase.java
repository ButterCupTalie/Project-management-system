import java.util.*;
import java.io.*;
import java.text.*;


/**
 * 
 * @author Natalia
 * @version 1.00, 4 March 2021
 */

public class ProjectsDatabase{
	
/**
 * Main method
 * <br>
 * Main method of the program allows user to create, edit and finalize projects
 * 
 * @param args displays project details on the console and editing options available to the user
 */
    public static void main(String args[]) {
       
        Scanner input = new Scanner (System.in);
               
        // Creating the list of all projects
        List <Project> projects = new ArrayList <Project>();

        readText(projects);
       
        while(true){
        	
           // Program will display user menu until user chooses to exit the program
            System.out.println("\nUser menu:" + "\n1. View all projects" + "\n2. Add project" 
		               + "\n3. View outstanding projects" + "\n4. View overdue projects" 
					   + "\n5. Exit the program");

            try{
                int userChoice = input.nextInt();
                input.nextLine();

                if (userChoice == 1){              	
                	
                	// To display all projects reading data from the projects list
                	 for (int i = 0 ; i < projects.size() ; i++){
                         System.out.println(projects.get(i));
                         System.out.println("#\n");
                     }
                	 
                	 // Adding option to edit available projects
                	  System.out.println("Would you like to edit the project? (Yes/No): ");
                	  String userInput = input.nextLine();
                	  
                	  // Account for capitalization of the user's answer
                	  if(userInput.equalsIgnoreCase("YES")) {
                		  
                		  System.out.print("Enter the project number to edit: ");
                		  String projectNumber = input.nextLine();
                		  
                		  // Locating the project requested by the user
                		  for (int i = 0 ; i < projects.size() ; i++){
                	            if (projectNumber.equals(projects.get(i).getProjectNumber())) {
                	            
                	                while(true){
                	                	
                	                    // Displaying which elements of the project user can edit 
                	                    System.out.println("\nWhat would you like to edit?");
                	                    System.out.println("1 - Deadline");
                	                    System.out.println("2 - Paid To Date");
                	                    System.out.println("3 - Finalised");
                	                    System.out.println("4 - Architect");
                	                    System.out.println("5 - Contractor");
                	                    System.out.println("6 - Customer");
                	                    System.out.println("7 - Back to User Menu");

                	                    try{
                	                        int menuOption = input.nextInt();
                	                        input.nextLine();

                	                        // Changing deadline of the project by using set method
                	                        if (menuOption == 1){
                	                            System.out.print("Deadline (e.g 1 December 2021): ");
                	                            String deadline = input.nextLine();
                	                            projects.get(i).setDeadline(deadline);
                	                        }
                	                        // Changing paid to date by using set method
                	                        else if (menuOption == 2){
                	                            System.out.print("Paid To Date: ");
                	                            String paidToDate = input.nextLine();
                	                            projects.get(i).setPaidToDate(Double.parseDouble(paidToDate));
                	                        }
                	                        
                	                        // Finalizing the project by changing status 
                	                        else if (menuOption == 3){

                	                            System.out.println("\nThe project is currently set as " + projects.get(i).getFinalisedString());
                	                            System.out.print("Enter 1 to change: ");
                	                            String projectFinalised = input.nextLine();
                	                            projects.get(i).setFinalised(projectFinalised);

                	                            System.out.println("\nThe project has been changed to " + projects.get(i).getFinalisedString());
                	                            
                	                            Double Difference = 0.0;
                	                            Difference = projects.get(i).getTotalFee() - projects.get(i).getPaidToDate();

                	                            if (Difference == 0) {

                	                            	   System.out.println("Invoice will not be generated, customer paid full amount");
                	                            	                  	                            	
                	                            }
                	                            else {
                	                                   System.out.println("\n*****Invoice******");
                	                                   System.out.println(projects.get(i).getCustomer());
                	                                   System.out.println("Amount outstanding R" + Difference);
                	                               }
                	                            
                	                            Formatter f = new Formatter("C:\\Users\\Natalia\\Dropbox\\Natalia Antropova-82496\\Introduction to Software Engineering\\Task 24\\Completed projects.txt");
                	                            
                	                            for (i = 0 ; i < projects.size() ; i++){
                	                                f.format("%s", projects.get(i).write());
                	                                
                	                                if(projects.size()-1 == i){
                	                                    f.format("%s", "\n###");
                	                                }

                	                                else{
                	                                    f.format("%s", "\n###\n");
                	                         
                	                      
                	                        }
                	                            }
                	                        }
                	                        // Editing details of architect, contractor or customer by using <editPerson> method
                	                        else if (menuOption == 4){
                	                            projects.get(i).setArchitect(editPerson(projects.get(i).getArchitect()));
                	                            
                	                        } 
                	                        else if (menuOption == 5){
                	                            projects.get(i).setContractor(editPerson(projects.get(i).getContractor()));
                	                            
                	                        } 
                	                        else if (menuOption == 6){
                	                            projects.get(i).setCustomer(editPerson(projects.get(i).getCustomer()));
                	                            
                	                        } 
                	                        else if (menuOption == 7){
                	                            break;
                	                            
                	                        } 
                	                        else{
                	                            System.out.println("\nPlease enter a correct menu option.");
                	                        }
                	                        
                	                     // Catching error in case if the user entered incorrect menu option
                	                    } catch(Exception e){
                	                        System.out.println("\nPlease enter a number for a menu option.");
                	                        input.next();
                	                    }
                	                }               	            
                	                break;
                	            }
                	        }              	    
                	    }
                	  
                // Creating a new project using users input for details
                } else if (userChoice == 2){
                                   
                    System.out.println("Please enter the details of the new project.");
                    System.out.print("Project Number: ");
                    String projectNumber = input.nextLine();
                    
                    System.out.print("Project Name: ");
                    String projectName = input.nextLine();
                    
                    System.out.print("Project Type: ");
                    String projectType = input.nextLine();
                    
                    System.out.print("Project Address: ");
                    String projectAddress = input.nextLine();
                    
                    System.out.print("Erf Number: ");
                    String erfNumber = input.nextLine();
                    
                    // Make sure user input numbers by inserting <try/catch> method
                    double totalFee = 0.0;
    				while (true) {
    					try {
    						System.out.println("Total Fee: ");
    						totalFee = input.nextDouble();
    						input.nextLine();
    						break;
    					} catch (Exception e) {
    						System.out.println("Please only enter numbers");
    						input.next();

    					}
    				}
    				// Make sure user input numbers by inserting <try/catch> method
    				double paidToDate = 0.0;
    				while (true) {
    					try {
    						System.out.println("Paid to Date: ");
    						paidToDate = input.nextDouble();
    						input.nextLine();
    						break;
    					} catch (Exception e) {
    						System.out.println("Please only enter numbers");
    						input.next();
    					}
    				}
    				
                    System.out.print("Deadline (e.g 1 December 2021): ");
                    String deadline = input.nextLine();


                    // Creating 3 person objects using <addPerson> method
                    Person architect = addPerson("Architect: ");
                    Person contractor = addPerson("Contractor: ");
                    Person customer = addPerson("Customer: ");

   
                    // In case if user didn't input project name using project type and surname of the customer to create the name of the project
                    if(projectName.equals("")){
                        projectName = projectType + " " + customer.getSurname();
                    }
                    
   
                    // Creating new project object
                    Project newProject = new Project(projectNumber, projectName, projectType, projectAddress, erfNumber, totalFee, paidToDate, deadline, false, architect, contractor, customer);
                    projects.add(newProject);

                    System.out.println("\nNew project has been succesfully created.");
                
                
                } else if (userChoice == 3){
                	
                    boolean noProjectsFound = true;
                    
                    System.out.println("\nProjects Not Yet Finalised: \n");

                    // Looping through the projects list and printing the details if the finalized attribute is false to display outstanding projects
                    for (int i = 0 ; i < projects.size() ; i++){
                        if(projects.get(i).getProjectFinalised() == false){
                            System.out.println(projects.get(i));
                            System.out.println("###\n");
                            noProjectsFound = false;
                        }
                    }

                    if(noProjectsFound){
                        System.out.println("All Projects are finalised.");
                    }
               
                    
                } else if (userChoice == 4){
                    
                    boolean noProjectsFound = true;
                    String deadline;
                    Date dueDate;
                    Date today = new Date();
                    
                    System.out.println("\nOverdue Projects: \n");

                    // Looping through the projects list and printing the details if the deadline of the project is before todays date                   
                    for (int i = 0 ; i < projects.size() ; i++){
                        try{            
                            deadline = projects.get(i).getDeadline();
                            dueDate = new SimpleDateFormat("10 December 2021").parse(deadline);

                            if(dueDate.before(today)){
                                System.out.println(projects.get(i));
                                System.out.println("###\n");
                                noProjectsFound = false;
                            }
                        }

                        catch(ParseException e){
                            e.printStackTrace();
                        }
                    }

                    if(noProjectsFound){
                        System.out.println("No overdue projects has been found");
                    }
                    
                } else if (userChoice == 5){
                

                    // Creating the Formatter object to write the information to file. Using <write> method to return the string in the correct format.              
                    try{
                        Formatter f = new Formatter("C:\\Users\\Natalia\\Dropbox\\Natalia Antropova-82496\\Introduction to Software Engineering\\Task 24\\Projects.txt");
                        
                        for (int i = 0 ; i < projects.size() ; i++){
                            f.format("%s", projects.get(i).write());
                            
                            if(projects.size()-1 == i){
                                f.format("%s", "\n###");
                            }

                            else{
                                f.format("%s", "\n###\n");
                            }

                        }
                        f.close();
                    } catch(Exception e){
                        System.out.println("Error");                    
                    }
                break;
            }
                else {
                	System.out.println("\nError. Please enter correct menu option.");
            }
            
                }
            
            catch(Exception e){
                System.out.println("Error. Please enter correct menu option: ");
                input.next();
            }
        }
        input.close();
    }

/**
 * The method editing details of the person object
 * @param person editing details of the person object
 * @return edited details
 */
    public static Person editPerson(Person person){
        // Create the required variables
        @SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);

        while (true){
            System.out.println("Would you like to edit contact details?");
            String userInput = input.nextLine();
            
            if(userInput.equalsIgnoreCase("YES")) {
                
            	try{
                    System.out.print("Phone Number: ");
                    String personPhoneNumber = input.nextLine();
                    
                    System.out.print("Email Address: ");
                    String personEmail = input.nextLine();
                    
                    System.out.print("Physical Address: ");
                    String personAddress = input.nextLine();
    
                    // Set the new elements
                    person.setPersonPhoneNumber(personPhoneNumber);
                    person.setPersonEmail(personEmail);
                    person.setPersonAddress(personAddress);
    
                    System.out.println("\nContact details has been succesfully updated\n");
    
                    // Return the person object
                    return person;
                }
            
            catch(Exception e){
                System.out.println("\nNot Recognized. Please enter a number for a menu option.");
                input.next();
            }
            }
        }
    }

    
/**
 * The method creates person object
 * @param personRole adding person details to the person object
 * @return person object
 * 
 */
    public static Person addPerson(String personRole){

                Scanner input = new Scanner (System.in);
				System.out.println("\nPlease enter the details of the " + personRole);
							
				System.out.print("Name: ");
				String personName = input.nextLine();
				
				System.out.print("Surname: ");
				String personSurname = input.nextLine();
				
				System.out.print("Telephone: ");
				String personPhoneNumber = input.nextLine();
				
				System.out.print("Email: ");
				String personEmail = input.nextLine();
				
				System.out.print("Address: ");
				String personAddress = input.nextLine();			
   
				Person person = new Person(personRole, personName, personSurname, personPhoneNumber, personEmail, personAddress);
				
				return person;
			}
		
    

/**
 * 
 * The method reading details of all projects from a text file 
 * @param projects displays projects
 */
    public static void readText (List<Project> projects){
        
    
        String line;
        List <String> projectData = new ArrayList <String>();

        Person person1;
        Person person2;
        Person person3;
        Project project;

        try{
            File text = new File("C:\\Users\\Natalia\\Dropbox\\Natalia Antropova-82496\\Introduction to Software Engineering\\Task 24\\Projects.txt");
            Scanner scan = new Scanner (text);
       
            // Using while loop to read from the file
            while (scan.hasNext()){

                line = scan.nextLine();
                
                
                // Projects are separated using ###, once this line is read program reaches the end of the project.
                // Data is read into person and project objects and added to the project array.
                if (line.equals("###"))
                {
                    person1 = new Person (projectData.get(9), projectData.get(10), projectData.get(11), projectData.get(12), projectData.get(13), projectData.get(14));
                    person2 = new Person (projectData.get(15), projectData.get(16), projectData.get(17), projectData.get(18), projectData.get(19), projectData.get(20));
                    person3 = new Person (projectData.get(21), projectData.get(22), projectData.get(23), projectData.get(24), projectData.get(25), projectData.get(26));
                    project = new Project (projectData.get(0), projectData.get(1), projectData.get(2), projectData.get(3), projectData.get(4), Double.parseDouble(projectData.get(5)), Double.parseDouble(projectData.get(6)), projectData.get(7), Boolean.parseBoolean(projectData.get(8)), person1, person2, person3);
                    projects.add(project);
                    projectData.clear();
                }
                else{
                    projectData.add(line);
                }
            } 
            scan.close();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}



// ***References***

// Java Encapsulation. Retrieved 1 March 2021, from https://www.w3schools.com/java/java_encapsulation.asp#:~:text=The%20get%20method%20returns%20the%20value%20of%20the%20variable%20name,refer%20to%20the%20current%20object.
// Getters and Setters in Java Explained. 25 January 2020. Retrieved 1 March 2021, from https://www.freecodecamp.org/news/java-getters-and-setters/
// Change values in object java. Retrieved 2 March 2021, from https://stackoverflow.com/questions/46724212/change-values-in-object-java
// Alvater, A. 22 August 2019. Retrieved 3 March 2021, from https://stackify.com/best-practices-exceptions-java/
// Scanner / Formatter - Reading/Wrting .txt file. Retrieved 3 March 2021, from https://www.daniweb.com/programming/software-development/threads/438604/scanner-formatter-reading-wrting-txt-file
