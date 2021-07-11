package day2;

// step 1
import java.util.Scanner;

public class Dump {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in standard input device , which is keyboard
		
		
		System.out.println("Enter int ");
		//int x = sc.nextInt();
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		System.out.println(" x - "+x);
		
		System.out.println("Enter String ");
		//String str = new Scanner(System.in).nextLine();
		String str = sc.nextLine();
		//String str = sc.next(); // not used with white spaces
		System.out.println(" str - "+str);
		
		System.out.println("Enter float ");
		String strF = sc.nextLine();
		float b= Float.parseFloat(strF);
		System.out.println(" b - "+b);
		
		System.out.println("Enter byte ");
		byte b2 = Byte.parseByte(sc.nextLine());
		System.out.println(" b2 - "+b2);
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
