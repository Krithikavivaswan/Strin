package StrinMethod;

public class Mut {
	public static void main(String[] args) {
		

		String s1="Greens";
		String s2="Tech";
		System.out.println("Immutable String");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		 s1 = s1.concat(s2);
		 System.out.println(s1);
		 System.out.println(System.identityHashCode(s1));
		 // s1 Store in different memory location
		 
		 
		 StringBuffer s3=new StringBuffer("Greens");
		 StringBuffer s4=new StringBuffer("Tech");
		 System.out.println("\nMutable String");
		 System.out.println(System.identityHashCode(s3));
		 System.out.println(System.identityHashCode(s4));
		 s3=s3.append(s4);
		 System.out.println(s3);
		 System.out.println(System.identityHashCode(s3));
		 //s3 store in same location
		 
		 
		
		
		

	}

}
