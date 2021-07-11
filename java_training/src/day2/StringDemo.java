package day2;

public class StringDemo {

	
	public static void main(String[] args) {
		
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		boolean a = (str1 == str2);  // true
		boolean b = (str1.equals(str3)); // false
		boolean c = (str1 == "Hello"); 
		boolean d = (str1.equalsIgnoreCase("heLLo")); 
			
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c+" "+d);
		
		
		
		
	}
}
