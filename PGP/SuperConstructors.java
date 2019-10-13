class A{
 A(){
	 System.out.println("Inside class A Constructor");
 }
}

class B extends A{
	B(){
		System.out.println("Inside class B Constructor");
	}
}

class SuperConstructors 
{
	public static void main(String[] args) 
	{
		B obj = new B();
		System.out.println("Hello World!");
	}
}
