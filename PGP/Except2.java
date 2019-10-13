class Except2 
{
	public static void main(String[] args) 
	{
      try{
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = n1/n2;
		System.out.println("Result = "+ n3);
	  }
	  catch(ArithmeticException ex){
        System.out.println("Cannot divide a number by zero!");
	  }
	  catch(ArrayIndexOutOfBoundsException ex){
        System.out.println("Please provide minimum 2 cmd args!");
	  }
	  catch(NumberFormatException ex){
        System.out.println("Please provide numbers as cmd args");
	  }
	  System.out.println("Done..");
	}
}
