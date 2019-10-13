class Except3 
{
	public static void main(String[] args) 
	{
      try{
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = n1/n2;
		System.out.println("Result = "+ n3);
	  }
	  catch(Exception ex){
        System.out.println("Exception Occured!");
		System.out.println("Message : "+ ex.getMessage());
		System.out.println(ex.toString()); //object type with message

		if(ex instanceof ArithmeticException) {
  		 System.out.println("ERROR: Cannot divide a number by zero!");
		}
	  }
	  System.out.println("Done..");
	}
}
