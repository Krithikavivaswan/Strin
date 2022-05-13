package StrinMethod;
import java.util.Scanner;
public class Replac {
	public static void main(String[] args) {
		String s= "Welcome to Java class";
		String s1= "Greens Adyar";
		Scanner s2=new Scanner(System.in);
//		System.out.println("Enter your address");
//		String addr = s2.nextLine();
//		boolean pin = addr.contains("pincode");
//		String rp = addr.replace("pincode", " ");
//		System.out.println(rp);
//		
//		System.out.println("Enter your name ");
//		String name = s2.next();
//		String lc = name.toLowerCase();
//		System.out.println(lc);
//		String uc = name.toUpperCase();
//      System.out.println(uc);
//
//		String upr = s1.toUpperCase();
//		System.out.println(upr);
		
//		String rep = s.replace("Java", "Sql");
//		System.out.println(rep);
//		
//		String re = s1.replace("Adyar", "OMR");
//		System.out.println("\n"+re);
//		
//		
//		
//		String rl = s.replace(" ", "#");
//		System.out.println("\n"+rl);
//	
		
		boolean sw = s.startsWith("Welcome");
		System.out.println(sw);
		
		boolean ew = s.endsWith("class");
		System.out.println(ew);
		
		boolean e = s.isEmpty();
		System.out.println(e);
		
		
	}

}
