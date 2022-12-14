package test1;

public class Java {

	public static void main(String[] args) {

		String s = "Software#$%^&*(@testing&";
		System.out.println(s);
		String s1 = s.replaceAll("[^a-z A-Z 0-9]", "");
		System.out.println(s1);
		
		System.out.println("*************************");

		int count = 0;
		for (int c = 'A'; c <= 'Z'; c++) {
			count++;
		}
		System.out.println(count);
		
		System.out.println("*************************");
		
		String s2 = "Software Testing";
		char[] ch = s2.toCharArray();
		
		for(Character c:ch) {
			count++;
		}
		System.out.println(s2.length());
		
		System.out.println("*************************");
	}
}
