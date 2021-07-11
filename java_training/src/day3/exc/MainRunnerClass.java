package day3.exc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Laptop{
	public void doThings() {}
}

public class MainRunnerClass {

	public static void main(String[] args) {

		Laptop dell = null;
		PrintWriter abc = null;
		
		try {
			 abc = new PrintWriter(new File(""));
			 dell.doThings();
			 abc.append('c');
		}
		catch(NullPointerException e)
		{
			System.out.println(" dell obj is "+e.getMessage());
		}
		catch(FileNotFoundException e)
		{
			System.out.println("vdfg");
		}
		finally {
			System.out.println("execute shut-down process");
		}
		
		
		System.out.println("Shut-down Complete");
		
		
	}

}
