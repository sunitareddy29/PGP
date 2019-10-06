/* program to display first "n" natural numbers*/

import java.util.Scanner;

public class Naturals3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many natural numbers to be displayed: ");
		int n = sc.nextInt();
		
		System.out.print("Which Pattern [1-Multiline/2-Singleline]: ");
		int pattern = sc.nextInt();
		
		if(pattern<1 || pattern>2) {
			System.out.println("Invalid Pattern Selected! Try Again!");
		}
		else {
			System.out.println("First "+n+" Natural Numbers are:");
			if(pattern==1)
				pattern1(n); //method call
			else
				pattern2(n); //method call
		}
		sc.close();
	} //main

	static void pattern1(int n) 
	{
	 for(int i=1;i<=n;i++) {
		 System.out.println(i);
	 }
	} //method pattern1
	
	static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i==n)
				System.out.println(i);
			else
				System.out.print(i+", ");
		}		
	} 
}
