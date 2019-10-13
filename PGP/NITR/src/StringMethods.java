
public class StringMethods {

	public static void main(String[] args) {
		String str = "   edureka   ";
		System.out.println("Size of \""+str+"\" = "+ str.length());
		
		System.out.println("Character @ 0 = "+ str.charAt(0));
		
		System.out.println("Index of \"e\" = "+ str.indexOf("e"));
		
		System.out.println("Last Index of \"e\" = "+ str.lastIndexOf("e"));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('e', '*'));
		
		str = str.trim();
		System.out.println(str+" - "+str.length());
		System.out.println(str.substring(1,4));//dur
	}
}
