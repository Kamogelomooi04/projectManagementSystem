package projectManagementSystem.java;


public class Project {

	//Attributes 
	private int projectNumber;
	private String projectName;
	private String buildingType;
	private String projectAddress;
	private int ERFNumber;
	private int totalFeeCharged;
	private int totalPaidToDate;
	private String projectDeadline;
	
	//Methods
	public int getProjectNumber() {
		return projectNumber;		
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public String getBuildingType() {
		return buildingType;
	}
	
	public String getProjectAddress() {
		return projectAddress;
	}
	
	public int getERFNumber() {
		return ERFNumber;
	}
	
	public int getTotalFeeCharged() {
		return totalFeeCharged;
	}
	
	public int getTotalPaidToDate() {
		return totalPaidToDate;
	}
	
	public String getProjectDeadline() {
		return projectDeadline;
	}
	
	
	//Constructor.
	public Project(int projectNumber, String projectName, String buildingType, String projectAddress,
			int ERFNumber, int totalFeeCharged, int totalPaidToDate, String projectDeadline) {
		
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.projectAddress = projectAddress;
		this.ERFNumber = ERFNumber;
		this.totalFeeCharged = totalFeeCharged;
		this.totalPaidToDate = totalPaidToDate;
		this.projectDeadline = projectDeadline;
	}
	
	/*This method will return a string object that will 
	 * be used to display the contents of the object.*/
	public String toString() {
			
		String output = "Project number: " + projectNumber;
			
		output += "\nProject name: " + projectName;
			
		output += "\nBuiling type: " + buildingType;
			
		output += "\nProject address: " + projectAddress;
			
		output += "\nProject ERF number: " + ERFNumber;
		
		output += "\nTotal amount charged for this project: " + "R" + totalFeeCharged;
		
		output += "\nTotal amount paid to date: " + "R" + totalPaidToDate;
		
		output += "\nProject deadline: " + projectDeadline;
			
		return output;
	}
}

