package StrinMethod;

public class SamStrin {
	public static void main(String[] args) {
		String s= "Java Programming";
		String s1= "java programming";
		
		// To find the length
		int l=s.length();
		System.out.println(l);
		
		// To uppercase
		
	String u=s.toUpperCase();
	System.out.println(u);
		
		// To lowercase
	String lo=s.toLowerCase();
	System.out.println(lo);
		
		//To check string starts with given prefix or not
	
	boolean sw = s.startsWith("comp");
	System.out.println(sw);
	
	// To check string ends with given suffix or not
	
	boolean ew=s.endsWith("ing");
	System.out.println(ew);
	
	// To find the index of the particular value
		
	int io= s.indexOf('m');
	System.out.println(io);
	
	
	// To find the lastindex 
	int lio=s.lastIndexOf('g');
	System.out.println(lio);
	
	
	// To find the middle of 'm'
	
	int iof=s.indexOf('a',2);
	System.out.println(iof);
	
	boolean empty = s.isEmpty();
	System.out.println(empty);
	
	String substring = s.substring(3);
	System.out.println(substring);
	
	String substring2 = s.substring(4, 16);
	System.out.println(substring2);
	
	boolean contains = s.contains("gram");
	System.out.println(contains);
	
	boolean equals = s.equals(s1);
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
	System.out.println(equalsIgnoreCase);
	
	String replace = s.replace('m','A');
	System.out.println(replace);
	
	
	String replaceAll = s.replaceAll("Programming", "Application");
	System.out.println(replaceAll);
	
	String trim = s.trim();
	System.out.println(trim);
	
	int compareTo = s.compareTo(s1);
	System.out.println(compareTo);
	
	
	
	
	
	
		
	}

}
