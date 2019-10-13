
public class FloatTest {

	public static void main(String[] args) {
		//float sal = 2500.5; //cannot convert from double to float
		//float sal = 2500.5f;
		//float sal = 2500.5F;
		float sal = (float)2500.5;
		System.out.println("My Salary = "+ sal);
		
		double data = 2500.5;
		//double data = 2500.5d;
		//double data = 2500.5D;
		System.out.println(data);
		
		data = 2500;
		System.out.println(data);
		
		System.out.println(Integer.toHexString(65));
	}

}
