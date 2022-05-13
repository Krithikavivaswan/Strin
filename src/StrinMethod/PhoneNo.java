package StrinMethod;
import java.util.Scanner;
public class PhoneNo {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		System.out.println("Enter your email id");
//		String email = s.next();
//		String rl = email.replace("gmail", "yahoo");
//		System.out.println(rl);

		
		
		
		
		
		System.out.println("Enter your phone no ");
		String phNo = s.next();
		int length = phNo.length();
		int count=0, c=0;
		for (int i = 0; i<length; i++) {
			char ch = phNo.charAt(i);
			
		if (ch<='9') {
			count++;
		} else {
c++;
		}

		}
		
		if (count==10 && c==0) {
			System.out.println("Valid phone number");
			
		} else {
System.out.println("Invalid phone number");

		}

//		
//		int len = phNo.length();
//		if (len==10) {
//			System.out.println("Entered number is valid ");
//		} else {
//System.out.println("Entered number is invalid");
//		}
//		
	}

}
