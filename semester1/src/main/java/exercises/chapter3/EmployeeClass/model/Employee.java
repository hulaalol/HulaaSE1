package exercises.chapter3.EmployeeClass.model;

/**
 * Raise the employee's salary by the given percentage.
 * 
 * Example: If the current annual salary is 30000 € then
 * raising by 2,5% will result in 30750 €
 * 
 * @param percentage Raise the current salary by this percentage.
 * 
 */


public class Employee {
		int age; // field 1
		double salary; // field 2
		
	
		public Employee (int age, double salary) // constructor
		{
			this.age = age;
			this.salary= salary;
		}
		
		public void raiseSalary(double raise) //method 1 
		{
			salary = salary*(1+(raise/100));
		}
		
		
		public void printStatus()
		{
			System.out.println("Alter= " + this.age + " Gehalt= " + (int) this.salary + "€ pro Jahr");
		}	
		
		public void setSalary(double newSalary)
		{
			if(newSalary<0)
			{
				System.err.println("Fehler: Gehalt kann nicht negativ sein! Änderung wird nicht durchgeführt");
			}
			else
			{
				salary=newSalary;
			}
			
		}
		

	}


