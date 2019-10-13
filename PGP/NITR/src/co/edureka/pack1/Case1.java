package co.edureka.pack1;

public class Case1 {

	public static void main(String[] args) {
		String data = "625"; 
		System.out.println(data+25);
		
		int n = Integer.parseInt(data);
		System.out.println(n+25); //650
		
		n = Integer.parseInt("A"); //java.lang.NumberFormatException
		
	}
}
