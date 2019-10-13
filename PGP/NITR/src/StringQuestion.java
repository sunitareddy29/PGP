
public class StringQuestion {

	public static void main(String[] args) {
		String s1 = "edureka";
		String s2 = s1.concat("");
		System.out.println(s1 == s2);
		
		String s3 = s1+"";
		System.out.println(s1==s3);
		
		s3=s3+null;
		System.out.println(s3);
		s2=s1.concat(null);
	}

}
