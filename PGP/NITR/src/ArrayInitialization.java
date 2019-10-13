
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {92,86,90,73,88,94};
		System.out.println("No of Subjects = "+ marks.length);
		
		/* array iteration*/
		for(int i=0;i<marks.length;i++) {
			System.out.println("mark for Subject-"+(i+1)+" = "+ marks[i]);
		}
		
		int[] marks1 = {92,86,90,73,88,94};
		System.out.println(marks == marks1); //false
		
		/*array iteration using enhanced for loop from Java 5*/
		System.out.print("Marks Obtained: ");
		for(int mark : marks) {
			System.out.print(mark+" | ");
		}
		System.out.println();
		
		System.out.println("Array Type = "+ marks.getClass().getName()); //[I
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException	
	}
}
