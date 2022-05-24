package StrinMethod;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
// GIT pull req testing done by krithika
public class Interview {

	
	public static void main(String[] args) {

		/*// split the below statements
		String s = "has have has had have";
		String[] s1 = s.split(" ");

		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();

		for (String x : s1) {
			if (mp.containsKey(x)) {
				mp.put(x, mp.get(x) + 1);
			} else {
				mp.put(x, 1);
			}
		}

		System.out.println(mp);*/

		
		
		// Split the below words
		
		
		String s="Krithika";
		char[] cr = s.toCharArray();
		
		Map<Character, Integer>m=new LinkedHashMap<Character, Integer>();
		
for (char x : cr) {
	if (m.containsKey(x)) {
		m.put(x, m.get(x)+1);
		
	} else {
m.put(x, 1);
	}
}			

		System.out.println(m);
		
		
		
	}

}
