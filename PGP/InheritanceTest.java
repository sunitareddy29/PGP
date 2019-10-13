class A{
	int a=10,b=20;
	void displayAB(){
		System.out.println("Inside class A - "+a+" | "+b);
	}
}

class B extends A{
	int c=30,d=40;
	void displayCD(){
		System.out.println("Inside class B - "+a+" | "+b+" | "+c+" | "+d);
	}
}

class InheritanceTest 
{
	public static void main(String[] args) 
	{
		B obj = new B();
		System.out.println(obj.a+" | "+obj.b+" | "+obj.c+" | "+ obj.d);
		obj.displayAB();
		obj.displayCD();
	}
}
