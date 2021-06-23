package projectManagementSystem.java;

import java.util.Scanner;

public class ProjectManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialized all the variables below.
		int projectNumber = 0;
		String projectName = "";
		String buildingType = "";
		String projectAddress = "";
		int ERFNumber = 0;
		int totalFeeCharged = 0;
		int totalPaidToDate = 0;
		String projectDeadline = "";
		
		String architectFirstName = "";
		String architectLastName = "";
		int architectTelephoneNum = 0;
		String architectEmailAddress = "";
		String architectPhysicalAddress = "";
		
		String contractorFirstName = "";
		String contractorLastName = "";
		int contractorTelephoneNum = 0;
		String contractorEmailAddress = "";
		String contractorPhysicalAddress = "";

		String customerFirstName = "";
		String customerLastName = "";
		int customerTelephoneNum = 0;
		String customerEmailAddress = "";
		String customerPhysicalAddress = "";
		
		char userChoice = '\0';
		String newDeadline = "";
		char updateChoice = '\0';
		int newTotalPaidToDate;
		String newContractorEmailAddress = "";
		int newContractorTelephoneNum = 0;
		
		//Created the Scanner object here.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome, you may create a project.");

		System.out.println();
		
		//Asking the user for some input, the details needed to create a project.
		//The input will be store in the appropriate variable.
		System.out.println("Enter the project number:");
		projectNumber = scan.nextInt();
	
		System.out.println("Enter the ERF number:");
		ERFNumber = scan.nextInt();
	
		System.out.println("Enter the total amount charged for this project:");
		totalFeeCharged = scan.nextInt();
	
		System.out.println("Enter the amount paid to date");
		totalPaidToDate = scan.nextInt();
	
		System.out.println("Enter the project name:");
		projectName = scan.next();
	
		System.out.println("Enter the address of this project.\n"
				+ "In the format 'House number/street name/town/city/postal code':");
		projectAddress = scan.next();
	
		System.out.println("Enter the deadline set for this project.In the format DD/MM/YYYY:");
		projectDeadline = scan.next();

		System.out.println("Enter the building type.House, Apartment block or Store:");
		buildingType = scan.next();
	
		//Getting the details of the architect.
		System.out.println("Enter the architect's first name:");
		architectFirstName = scan.next();
	
		System.out.println("Enter the architect's last name:");
		architectLastName = scan.next();
	
		System.out.println("Enter the architect's telephone number:");
		architectTelephoneNum = scan.nextInt();
	
		System.out.println("Enter the architect's email address:");
		architectEmailAddress = scan.next();
	
		System.out.println("Enter the architect's physical address.\n"
				+ "In the format 'House number/street name/town/city/postal code':");
		architectPhysicalAddress = scan.next();
	
		//Getting the details of the architect.
		System.out.println("Enter the contractor's first name:");
		contractorFirstName = scan.next();
	
		System.out.println("Enter the contractor's last name:");
		contractorLastName = scan.next();
	
		System.out.println("Enter the contractor's telephone number:");
		contractorTelephoneNum = scan.nextInt();
	
		System.out.println("Enter the contractor's email address:");
		contractorEmailAddress = scan.next();
	
		System.out.println("Enter the contractor's pysical address.\n"
				+ "In the format 'House number/street name/town/city/postal code':");
		contractorPhysicalAddress = scan.next();
	
		//Getting the details of the customer.
		System.out.println("Enter the customer's first name:");
		customerFirstName = scan.next();
	
		System.out.println("Enter the customer's last name:");
		customerLastName = scan.next();
	
		System.out.println("Enter the customer's telephone number:");
		customerTelephoneNum = scan.nextInt();
	
		System.out.println("Enter the customer's email address.:");
		customerEmailAddress = scan.next();
	
		System.out.println("Enter the customer's physical address.\n"
				+ "In the format 'House number/street name/town/city/postal code':");
	
		customerPhysicalAddress = scan.next();
		
		System.out.println();
		
		//Here we created the project object.
		//This helps create the project.
		Project ProjectCreds = new Project(projectNumber, projectName, buildingType, 
				projectAddress, ERFNumber, totalFeeCharged, totalPaidToDate, projectDeadline);
		
		//Here we created the object that will capture the details needed to create a person. 
		Person personTitles = new Person( architectFirstName, architectLastName, architectTelephoneNum, architectEmailAddress, architectPhysicalAddress,
				contractorFirstName, contractorLastName, contractorTelephoneNum, contractorEmailAddress, contractorPhysicalAddress,
				customerFirstName, customerLastName, customerTelephoneNum, customerEmailAddress, customerPhysicalAddress);
		
		//Calling this method in order to display the details of the project to the user in an easy to read manner.
		System.out.println(ProjectCreds.toString());
	
		//Calling this method in order to display the details of the project to the user in an easy to read manner.
		System.out.println(personTitles.toStringPerson());
		
		System.out.println("\n");
		
		System.out.println("Below are some menu options. Enter the letter of the option you would like.");
		
		System.out.println("\n");
		
		//Here the user is given an option menu.
		//The user is free to select which ever option they would would like to carry out.
		System.out.println("c - to change the due date of a project."
				+ "\np - to change the total amount paid to date.\nu - to update the contractor's contact details."
				+ "\nf - to finalise a project.");
		
		//Here is where the user's option will be taken in and stored in the variable named below.
		userChoice = scan.next().charAt(0);
		
		//Depending on the option or the character the user enters, the program will carry out a specific task.
		//In this case the user will be able to to change or update the project's deadline date
		if (userChoice == 'c') {
			
			System.out.println("Enter the new deadline you would like to set. In the format DD/MM/YYYY:");
			newDeadline = scan.next();
			
			projectDeadline = newDeadline;
			
			Project ProjectCreds1 = new Project(projectNumber, projectName, buildingType, 
					projectAddress, ERFNumber, totalFeeCharged, totalPaidToDate, projectDeadline);
		
			Person personTitles1 = new Person( architectFirstName, architectLastName, architectTelephoneNum, architectEmailAddress, architectPhysicalAddress,
					contractorFirstName, contractorLastName, contractorTelephoneNum, contractorEmailAddress, contractorPhysicalAddress,
					customerFirstName, customerLastName, customerTelephoneNum, customerEmailAddress, customerPhysicalAddress);
				
			System.out.println(ProjectCreds1.toString());
		
			System.out.println(personTitles1.toStringPerson());
			
			System.out.println();
		}
		
		//Depending on the option or the character the user enters, the program will carry out a specific task.
		//In this case the user will be able to change or update the total amount that has been bee paid to date.
		if (userChoice == 'p') {
			
			System.out.println("Update the total amount paid to date:");
			newTotalPaidToDate = scan.nextInt();
			
			totalPaidToDate = newTotalPaidToDate;
			
			Project ProjectCreds1 = new Project(projectNumber, projectName, buildingType, 
					projectAddress, ERFNumber, totalFeeCharged, totalPaidToDate, projectDeadline);
		
			Person personTitles1 = new Person( architectFirstName, architectLastName, architectTelephoneNum, architectEmailAddress, architectPhysicalAddress,
					contractorFirstName, contractorLastName, contractorTelephoneNum, contractorEmailAddress, contractorPhysicalAddress,
					customerFirstName, customerLastName, customerTelephoneNum, customerEmailAddress, customerPhysicalAddress);
				
			System.out.println(ProjectCreds1.toString());
		
			System.out.println(personTitles1.toStringPerson());
		}
		
		//Depending on the option or the character the user enters, the program will carry out a specific task.
		/*In this case here the user will be able to change or update the contractor's contact details.
		 * Because the contractor has both email address and telephone number, the user will be asked which one of the two
		 * they would like to change.*/
		if (userChoice == 'u') {
			
			System.out.println("Would you like to update the contractor's email address or telephone number?"
					+ "\ne - to update the contractor's email address.\nt - to update the contractor's telephone number.");
			updateChoice = scan.next().charAt(0);
			
			//The code below will run if the user enters the character that represents the option to change the contractors Email address.
			if (updateChoice == 'e') {
				
				System.out.println("Update the contrsctor's email address:");
				newContractorEmailAddress = scan.next();
				
				contractorEmailAddress = newContractorEmailAddress;
				
				Project ProjectCreds1 = new Project(projectNumber, projectName, buildingType, 
						projectAddress, ERFNumber, totalFeeCharged, totalPaidToDate, projectDeadline);
			
				Person personTitles1 = new Person( architectFirstName, architectLastName, architectTelephoneNum, architectEmailAddress, architectPhysicalAddress,
						contractorFirstName, contractorLastName, contractorTelephoneNum, contractorEmailAddress, contractorPhysicalAddress,
						customerFirstName, customerLastName, customerTelephoneNum, customerEmailAddress, customerPhysicalAddress);
					
				System.out.println(ProjectCreds1.toString());
			
				System.out.println(personTitles1.toStringPerson());
			}
			
			//The code below will run if the user enters the character that represents the option to change the contractors telephone number.
			if (updateChoice == 't') {
				
				System.out.println("Update the contrsctor's email address:");
				newContractorTelephoneNum = scan.nextInt();
				
				contractorTelephoneNum = newContractorTelephoneNum;
				
				Project ProjectCreds1 = new Project(projectNumber, projectName, buildingType, 
						projectAddress, ERFNumber, totalFeeCharged, totalPaidToDate, projectDeadline);
			
				Person personTitles1 = new Person( architectFirstName, architectLastName, architectTelephoneNum, architectEmailAddress, architectPhysicalAddress,
						contractorFirstName, contractorLastName, contractorTelephoneNum, contractorEmailAddress, contractorPhysicalAddress,
						customerFirstName, customerLastName, customerTelephoneNum, customerEmailAddress, customerPhysicalAddress);
					
				System.out.println(ProjectCreds1.toString());
			
				System.out.println(personTitles1.toStringPerson());
			}
		}
		
		//Depending on the option or the character the user enters, the program will carry out a specific task.
		/*In this case the user will be able to finalize a project, if the customer has paid the full amount
		 * there will be a message stating that to the user. If the customer has not paid the full amount an
		 * invoice will be generated and displayed to the user. */
		if (userChoice == 'f') {
			
			if (totalFeeCharged == totalPaidToDate) {
				
				System.out.println("Project Finalised and fully paid for.");
			}
			
			else {
				
				System.out.println("Invoice--------------");
			
				System.out.println("Invoice for: " + customerFirstName + " " + customerLastName);
			
				System.out.println("Telepone Number: " + customerTelephoneNum);
			
				System.out.println("Email address: " + customerEmailAddress);
			
				System.out.println("Remaining balance: R" + (totalFeeCharged - totalPaidToDate));
			}
			
			//Closing the Scanner object.
			scan.close();
		}
		
	}
	
}
