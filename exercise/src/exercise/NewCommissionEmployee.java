package exercise;

public class NewCommissionEmployee extends Employee
{
	//Instance variables
	 private double grossSales; // gross weekly sales
	 private double commissionRate; // commission percentage
	 
	  public NewCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
			 double grossSales, double commissionRate) 
	  {
		  //Calling the constructor of super class	
		  super ( firstName, lastName, socialSecurityNumber);
		  	
		// if grossSales is invalid throw exception
			 if (grossSales < 0.0)
			 throw new IllegalArgumentException("Gross sales must be >= 0.0");
			
			 // if commissionRate is invalid throw exception
			 if (commissionRate <= 0.0 || commissionRate >= 1.0)
			 throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0");
			 
			 this.grossSales = grossSales;
			 this.commissionRate = commissionRate;

	  }
	  
	// set gross sales amount
		 public void setGrossSales(double grossSales)
		 {
		 if (grossSales < 0.0)
		 throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		 this.grossSales = grossSales;
		 }
		
		 // return gross sales amount
		 public double getGrossSales()
		 {
		 return grossSales;
		 }
		
		 // set commission rate
		 public void setCommissionRate(double commissionRate)
		 {
		 if (commissionRate <= 0.0 || commissionRate >= 1.0)
		 throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		
		 this.commissionRate = commissionRate;
		 }
		
		 // return commission rate
		 public double getCommissionRate()
		 {
		 return commissionRate;
		 }


		// calculate earnings
		public double earnings()
		{
		return commissionRate * grossSales;
		}
		
		@Override
		public String toString()
		{
		return String.format("%s%n%s:%.2f%n%s:%.2f",
		super.toString(),
		"gross sales", grossSales,
		"commission rate", commissionRate);
	}
}
