# Project-management-system
Project management system created in Java for a small structural engineering firm that does the engineering needed to ensure the structural integrity of various buildings. 
Program can be used to keep track of the many projects on which the firm works.

Firm stores the following information for each project that they work on: project number, project name, what type of building is being designed? E.g. House, apartment block or
store, etc., the physical address for the project, ERF number, the total fee being charged for the project, the total amount paid to date, deadline for the project, the name, 
telephone number, email address and physical address of the architect, contractor and customer for the project.

Program features:
- Capture information about new projects. 
- Update information about existing projects. Information may need to be adjusted at different stages throughout the lifecycle of a project. 
- Finalise existing projects. When a project is finalised, an invoice is generated for the client. This invoice contain the customer’s contact details and the total amount 
that the customer must still pay. This amount is calculated by subtracting the total amount paid to date from the total fee for the project. If the customer has already paid 
the full fee, an invoice is not generated. The project marked as “finalised” and the completion date is added. All the information about the project is added to a text file called 
CompletedProject.txt.
- See a list of projects that still need to be completed.
- See a list of projects that are past the due date.
- Find and select a project by entering either the project number or project name.

