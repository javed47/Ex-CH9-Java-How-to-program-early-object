
package exercise;

public class Employee {
	//Instance variables 
	private  String firstName;
	private  String lastName;
	private  String socialSecurityNumber;
	
	public Employee()
	{
		this(null,null,null);
	}
	 
	 //3 base Constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber)
	{
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.socialSecurityNumber = socialSecurityNumber;
		 
	}
	
	// return first name
		 public String getFirstName()
		 {
		 return firstName;
		 }
		
		 // return last name
		 public String getLastName()
		 {
		 return lastName;
		 }
		
		
		
		 // return social security number
		 public String getSocialSecurityNumber()
		 {
		 return socialSecurityNumber;
		 }
		 
		// return first name
		 public void setFirstName(String firstName)
		 {
			 this.firstName = firstName;
		 }
		
		 // return last name
		 public void setLastName(String lastName)
		 {
			 this.lastName = lastName;
		 }
		
		
		
		 // return social security number
		 public void setSocialSecurityNumber(String socialSecurityNumber)
		 {
			 this.socialSecurityNumber = socialSecurityNumber;
		 }
		 
		 //To String method
		 public String toString()
			{
			return String.format("%s: %s %s%n%s: %s",
			"commission employee", firstName, lastName,
			"social security number", socialSecurityNumber);
		}
}
