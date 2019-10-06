
public class IntegerTypes {

	public static void main(String[] args) {
		//byte b = 128; //cannot convert from int to byte
		byte b = (byte)128;
		System.out.println(b); //[128-256] -128
		
		b = (byte)300;
		System.out.println(b); //[300-256] 44
		
		long pop = 9898989878L;
		System.out.println("World Population = " + pop);
		
		int n = (int)12L;
		System.out.println(n);
	}

}
