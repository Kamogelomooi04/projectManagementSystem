package projectManagementSystem.java;

public class Person {

	//Attributes.
	private String architectFirstName;
	private String architectLastName;
	private int architectTelephoneNum;
	private String architectEmailAddress;
	private String architectPhysicalAddress;
	
	private String contractorFirstName;
	private String contractorLastName;
	private int contractorTelephoneNum;
	private String contractorEmailAddress;
	private String contractorPhysicalAddress;

	private String customerFirstName;
	private String customerLastName;
	private int customerTelephoneNum;
	private String customerEmailAddress;
	private String customerPhysicalAddress;
	
	//Methods
	public String getArchitectFirstName() {
		return architectFirstName;
	}
	
	public String getArchitectLastName() {
		return architectLastName;
	}
	
	public int getArchitectTelePhoneNum() {
		return architectTelephoneNum;
	}
	
	public String getArchitectEmailAddress() {
		return architectEmailAddress;
	}
	
	public String getArchitectPhysicalAddress() {
		return architectPhysicalAddress;
	}
	
	//Getter method for the contractor's details.
	public String getContractorFirstName() {
		return contractorFirstName;
	}
	
	public String getContractorLastName() {
		return contractorLastName;
	}
	
	public int  getContractorTelephoneNum() {
		return contractorTelephoneNum;
	}
	
	public String getContractorEmailAddress() {
		return contractorEmailAddress;
	}
	
	public String getContractorPhysicalAddress() {
		return contractorPhysicalAddress;
	}
	
	//Getter method for the customer's details.
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	
	public String getCustomerLastName() {
		return customerLastName;
	}
	
	public int getCustomerTelephoneNum() {
		return customerTelephoneNum;
	}
	
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	
	public String getCustomerPysicalAddress() {
		return customerPhysicalAddress;
	}
	
	//Constructor for the arhitect's details.
	public Person(String architectFirstName, String architectLastName, int architectTelephoneNum, String architectEmailAddress, String architectPhysicalAddress,
			String contractorFirstName, String contractorLastName, int contractorTelephoneNum, String contractorEmailAddress, String contractorPhysicalAddress,
			String customerFirstName, String customerLastName, int customerTelephoneNum, String customerEmailAddress, String customerPhysicalAddress) {
		
		this.architectFirstName = architectFirstName;
		this.architectLastName = architectLastName;
		this.architectTelephoneNum = architectTelephoneNum;
		this.architectEmailAddress = architectEmailAddress;
		this.architectPhysicalAddress = architectPhysicalAddress;
		
		this.contractorFirstName = contractorFirstName;
		this.contractorLastName = contractorLastName;
		this.contractorTelephoneNum = contractorTelephoneNum;
		this.contractorEmailAddress = contractorEmailAddress;
		this.contractorPhysicalAddress = contractorPhysicalAddress;
		
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerTelephoneNum = customerTelephoneNum;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhysicalAddress = customerPhysicalAddress;
		
	}
	
	/*This method will return a string object that will 
	 * be used to display the contents of the object.*/
	public String toStringPerson() {
		
		String output2 = "\n";
				
		output2 += "Architect's first name: " + architectFirstName;
			
		output2 += "\nArchitect's last name: " + architectLastName;
			
		output2 += "\nArhitect's telephone number: " + architectTelephoneNum;
			
		output2 += "\nArchitect's email address: " + architectEmailAddress;
			
		output2 += "\nArchitect's pysical address: " + architectPhysicalAddress;

		output2 += "\n";
			
		output2 = "Customer's first name: " + customerFirstName;
		
		output2 += "\nCustomer's last name: " + customerLastName;
			
		output2 += "\nCustomer's telephone number: " + customerTelephoneNum;
			
		output2 += "\nCustomer's email address: " + customerEmailAddress;
			
		output2 += "\nCustomer's pysical address: " + customerPhysicalAddress;
		
		output2 += "\n";
		
		output2 += "Contractor's first name: " + contractorFirstName;
		
		output2 += "\nContractor's last name: " + contractorLastName;
			
		output2 += "\nContractor's telephone number: " + contractorTelephoneNum;
			
		output2 += "\nContractor's email address: " + contractorEmailAddress;
			
		output2 += "\nContractor's pysical address: " + contractorPhysicalAddress;
		
		output2 += "\n";

		output2 += "Architect's first name: " + architectFirstName;
		
		output2 += "\nArchitect's last name: " + architectLastName;
			
		output2 += "\nArhitect's telephone number: " + architectTelephoneNum;
			
		output2 += "\nArchitect's email address: " + architectEmailAddress;
			
		output2 += "\nArchitect's pysical address: " + architectPhysicalAddress;
		
		return output2;
	}
	
}
