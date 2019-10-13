class A{
 int a=10,b=20;
 void display(){
  System.out.println("Inside class A");
  System.out.println(super.toString()); //toString() - //Object_Type@hashCode in Hexadecimal form
 }
}

class B extends A{
 int a=11,b=22;
 void display(){
  System.out.println("Inside class B");
  super.display();
  System.out.println(a+" | "+this.b+" | "+super.a+" | "+super.b);
 }
}
class OverridingMembers 
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.display();
	}
}
