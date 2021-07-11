package day3.task1;


class Demo
{
   int x;
   String name;
   
   // default constructor
   Demo()
   {
	   System.out.println(" Inside constructor");
	   x = 10;
	   name = "No Name";
   }
   
   Demo(int x)   {}
   
   Demo(String name)   {}
   
   Demo(int x,String name)   {}

   public void doThing()
   {
	   System.out.println("Inside doThings "+x+" and "+name);
   }
   
}

public class ClassDemo {


	public static void main(String[] args) {
		
		Demo obj = new Demo();
		obj.doThing();
		
	}
}






