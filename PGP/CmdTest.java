class CmdTest 
{
	public static void main(String[] args) 
	{
	 System.out.println("No of cmd args = "+ args.length);
	 for(String data : args){
		 System.out.println(data);
	 }

	 System.out.println(args[0]);
	}
}
