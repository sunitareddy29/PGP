import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter first no: ");
			int x = sc.nextInt();
			
			System.out.print("enter second no: ");
			int y = sc.nextInt();
			
			int z = x/y;
			System.out.println(x+" / "+y+" = "+z);
		}
		catch(ArithmeticException e) {
			System.out.println(e); //toString()
		}
		finally {
			System.out.println("Application designed & developed by");
			System.out.println("Team @ NITR");		
			sc.close();
		}
		System.out.println("Done..");
	}

}
