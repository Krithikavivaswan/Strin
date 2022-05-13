package StrinMethod;

public class Memory {
	public static void main(String[] args) {
		
		String s1= "Nisha";
		String s2="Nisha";
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		s1=s1.concat(s2);
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
//		StringBuffer s3=new StringBuffer("Krithika");
//		StringBuffer s4=new StringBuffer("ganesh");
		
		StringBuffer s3 = new StringBuffer("krithika");
		StringBuffer s4 = new StringBuffer("ganesh");
		
		System.out.println();
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		System.out.println();
		s4=s3.append(s4);
		System.out.println(s3);
		System.out.println(System.identityHashCode(s4));
		
		
	}

}
