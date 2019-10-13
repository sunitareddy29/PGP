class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		empno = 102;
		name = "Naveen";
		sal = 25000.5f;
	}

	void displayDetails(){
      System.out.println(empno+" | "+name+" | "+sal);
	}
} //Employee

class ObjectTest
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);

		/*change object state using reference*/
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500.5f;
		//System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);
		emp.displayDetails();

		/*change object state using method*/
		emp.setDetails();
		emp.displayDetails();
	}
}
