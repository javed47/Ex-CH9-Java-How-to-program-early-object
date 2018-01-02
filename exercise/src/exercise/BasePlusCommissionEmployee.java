package exercise;

public class BasePlusCommissionEmployee {
	private CommissionEmployee cEmployee;
	private double baseSalary; // base salary per week
	public BasePlusCommissionEmployee(CommissionEmployee cEmployee, double baseSalary)
	{
		this.cEmployee = cEmployee;
		// if baseSalary is invalid throw exception
		 if (baseSalary < 0.0)
		 throw new IllegalArgumentException(
		 "Base salary must be >= 0.0");
		
		 this.baseSalary = baseSalary;
	}
	// set base salary
	public void setBaseSalary(double baseSalary)
	 {
	 if (baseSalary < 0.0)
	 throw new IllegalArgumentException(
	 "Base salary must be >= 0.0");
	
	 this.baseSalary = baseSalary;
	 }
	
	 // return base salary
	 public double getBaseSalary()
	 {
	 return baseSalary;
	 }
	// calculate earnings
	 public double earnings()
	 {
		 return getBaseSalary() + cEmployee.earnings();
	 }
	// return String representation of BasePlusCommissionEmployee
	 public String toString()
	 {
		 return String.format("%s %s%n%s: %.2f", "base-salaried",
				 cEmployee.toString(), "base salary", getBaseSalary());
	 }
}
