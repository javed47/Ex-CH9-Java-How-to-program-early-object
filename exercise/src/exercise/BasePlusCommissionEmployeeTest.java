package exercise;

public class BasePlusCommissionEmployeeTest {
	public static void main(String[] args)
	{
		// instantiate CommissionEmployee BasePlusCommissionEmployee object
		CommissionEmployee cEmploy = new CommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04);
		BasePlusCommissionEmployee employee =
				new BasePlusCommissionEmployee(cEmploy ,300);
		// get base-salaried & commission employee data
		System.out.println(
		 "Employee information obtained by get methods:%n");
		 System.out.printf("%s %s%n", "First name is",
				cEmploy.getFirstName());
		System.out.printf("%s %s%n", "Last name is",
				cEmploy.getLastName());
		System.out.printf("%s %s%n", "Social security number is",
				cEmploy.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is",
				cEmploy.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is",
				cEmploy.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base salary is",      
				employee.getBaseSalary());
		
		employee.setBaseSalary(1000);
		
		//Only here composition will work 
		System.out.printf("%n%s:%n%n%s%n",                   
				 "Updated employee information obtained by toString",
				 employee.toString());
	}
}
