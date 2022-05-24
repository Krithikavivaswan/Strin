package StrinMethod;

// GIT pull req testing
public class Equality {
public static void main(String[] args) {
	String s1= "Java";
	String s2= "Java";
	String s3= "Greens Technology";
	String s4= "GreensTechnology";
	String s5= "velmurugank451@gmail.com";
	String s6= "5-35-2a,venkatesh nivas,Aruppukottai";
	
	
	boolean a = s1.equals(s2);
	System.out.println(a);
	
	if (a==true) {
		System.out.println("It is equal");
	} else {
System.out.println("It is not equal");
	}
	
	boolean b = s3.equals(s4);
	System.out.println("\n"+b);
	
	if (b==true) {
		System.out.println("It is equal");
	} else {
System.out.println("It is not equal");
	}
	
	boolean e = s3.equalsIgnoreCase(s4);
	System.out.println("\n"+e);
	
	boolean c = s5.contains("@");
	System.out.println("\n"+c);
	
	if (c==true) {
		System.out.println("Valid email id ");
	} else {
System.out.println("Invalid email id");
	}
	
	boolean cs = s6.contains("pincode");
	
	if (cs==true) {
		System.out.println("Valid address");
	} else {
System.out.println("Invalid address");
	}
	
}
}
