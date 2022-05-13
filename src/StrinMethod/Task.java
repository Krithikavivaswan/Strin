package StrinMethod;

public class Task {
	public static void main(String[] args) {

		String s1 = "GreensTechnology";
		String s2 = "SeleniumAutomationtool";
		String s3 = "velmurugan";
		String s4 = "j a v a p r o g r a m";
		String s5 = "9095484678";

		int a = s1.length();
		System.out.println(a);
		int b = s2.length();
		System.out.println(b);
		int c = s3.length();
		System.out.println(c);
		int d = s4.length();
		System.out.println(d);
		int e = s5.length();
		System.out.println(e);

		int lio = s1.lastIndexOf('o');
		System.out.println("\n" + lio);

		int io = s2.indexOf('o');
		System.out.println("\n" + io);

		int id = s3.indexOf('n');
		System.out.println("\n" + id);

		int lof = s4.lastIndexOf(" ");
		System.out.println("\n" + lof);

		int iof = s5.indexOf("8");
		System.out.println("\n" + iof);

		char ca = s1.charAt(9);
		System.out.println("\n" + ca);

		for (int i = 0; i < 22; i++) {

			char cat = s2.charAt(i);
			if (cat == 'o') {
				System.out.println("\n" + cat);
			}

		}

		for (int j = 0; j < 10; j++) {

			char ct = s3.charAt(j);
			if (ct == 'u') {
				System.out.println("\n" + ct);
			}

		}

		
		char cr = s4.charAt(8);
		System.out.println("\n"+cr);
		
		char car = s5.charAt(8);
		System.out.println("\n"+car);

		
	}

}
