package StrinMethod;

public class TypesStrin {

	public static void main(String[] args) {

		String s1 = "Java";

		String s2 = "Java";

		System.out.println("Literal string");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		// To identify the memory location of String

		String s3 = new String("Selenium");
		String s4 = new String("Selenium");
		System.out.println("\nNon literal string");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));

		
		
		
	}

}
