
public class ArrayCreation {

	public static void main(String[] args) {
		int[] marks = new int[7];
		marks[0] = 98;
		marks[1] = 85;
		System.out.println("Size of Array = "+ marks.length);
		
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"   ");
		}
		System.out.println();
		
		/*create a double array wth size of 6*/
		double []sal = new double[6];
		for(double s : sal) {
			System.out.print(s+"   ");
		}
		System.out.println();
		
		boolean status[] = new boolean[10];
		for(boolean stat : status) {
			System.out.print(stat+"  ");
		}
		System.out.println();
		
		String[] names = new String[5];
		for(String name : names) {
			System.out.print(name+"  ");
		}
	}
}
