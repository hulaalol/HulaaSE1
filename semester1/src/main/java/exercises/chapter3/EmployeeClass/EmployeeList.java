package exercises.chapter3.EmployeeClass;


public class EmployeeList {

		public static void main( String[] args )
		{	
		Employee Hans = new Employee (20, 10);
		Employee Paule = new Employee (20, 10);
		
//		System.out.println("Hans Einkommen vor der Gehaltserhöhung= " + Hans.salary +"€ pro Jahr");
//		System.out.println("Paule Einkommen vor der Gehaltserhöhung= " + Paule.salary +"€ pro Jahr");
	//	
//		Hans.raiseSalary(7.5);
//		Paule.raiseSalary(38.5);
	//
	//	
//		System.out.print("\n");
//		System.out.println("Hans Einkommen nach der Gehaltserhöhung= " + Hans.salary +"€ pro Jahr");
//		System.out.println("Hans Einkommen nach der Gehaltserhöhung= " + Paule.salary +"€ pro Jahr");
	//	
//		System.out.print("\n");
//		Hans.printStatus();
//		Paule.printStatus();
		
		Hans.printStatus();
		System.out.println("Raising Salary by 5%");
		Hans.raiseSalary(5);
		Hans.printStatus();
		System.out.println("Set Salary to -50€");
		Hans.setSalary(-50);
		Hans.printStatus();
		Hans.raiseSalary(10);
		System.out.println("Raising Salary by 10%");
		Hans.printStatus();
		
		
		}

	}

	
	

