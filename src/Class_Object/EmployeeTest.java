package Class_Object;

public class EmployeeTest{
	
	
	public static void main(String[] args){
		Employee emp = new Employee("Keshav");
		emp.age(4);
		emp.designation("QA");
		emp.salary(123456);
		emp.empInfo();
		
		emp = new Employee(""); //New object is created and previously created object will be handled by garbage collector
		emp.empInfo();
	}
	
}

class Employee{
	
	String empName;
	int empAge;
	String empDesignation;
	int empSalary;
	
	/** Here we create constructor*/
	
	 public Employee(String name) {
	      this.empName = name;
	 }
	 
	 public void age(int age){
		 empAge = age;
	 }
	 
	 public void designation(String designation){
		 empDesignation = designation;
	 }
	 
	 public void salary(int salary){
		 empSalary = salary;
	 }

	 public void empInfo(){
		 System.out.println("Name :: "+empName);
		 System.out.println("Age :: "+empAge);
		 System.out.println("Salary :: "+empSalary);
		 System.out.println("Designation :: "+empDesignation);
	 }
	 
}