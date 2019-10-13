import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		//int x=10, y=20, lar;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");
		int x = sc.nextInt();
		System.out.print("enter second no: ");
		int y = sc.nextInt();
		/*
		if(x>y)
		{
		  lar = x;
		}
		else
		{
		 lar = y;
		}
		*/
		int lar = (x>y)?x:y;
		
		System.out.println("Largest among("+ x +", "+ y +") = " + lar);
		
		sc.close();
	}

}
