package day3.col;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import day2.Employee;
import p1.Account;
import p1.Laptop;

public class MainClass1 {
	
	public static void main(String[] args) {
		
		MainClass1 obj = new MainClass1();
		
		// Employee e = new Accountant();
		
		List list1 = new ArrayList<>();
		
		list1.add(new Laptop());
		list1.add(new Exception("My Test Exception"));
		list1.add(10);// Integer
		list1.add(new String("Hello"));
		list1.add(new Object());
		
		obj.doPrint(list1);
		
		
		List list2 = new LinkedList<>();
		
		list2.add(new Account());
		list2.add(5.5);
		list2.add(10);// Integer
		list2.add(true);
		
		obj.doPrint(list2);
		
		
		
		
	}
	
	public void doPrint(Collection list)
	{
		System.out.println("------------ approach 1 -----------\n");
		// approach 1 
		System.out.println(list);
		
		System.out.println("------------ approach 2 -----------\n");
		// approach 2
		for (Object obj : list) {
			System.out.println(obj);
			
			// --------------------
			
			/*
			Employee e = (Employee)obj;
			e.loginLogoff();
			*/
			
		}
		
		
		System.out.println("------------ approach 3 -----------\n");
		// approach 3
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
		
	
		
	}

}
