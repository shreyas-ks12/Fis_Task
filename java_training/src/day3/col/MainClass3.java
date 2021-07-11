package day3.col;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class MainClass3 {

	public static void main(String[] args) {
		
		MainClass3 obj = new MainClass3();
		
		List<Integer> list = new Vector<>();
		
		list.add(1);
		list.add(1);
		list.add(1);
		
		obj.doRender(list);
		System.out.println(list.get(2));
		
		System.out.println("-------------------------------------");
		
		//Set<Integer> set = new HashSet<>();
		//Set<Integer> set = new LinkedHashSet<>();
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(100);
		set.add(110);
		set.add(4);
		set.add(86);
		set.add(13);
		
		
		obj.doRender(set);
	//	System.out.println(set.get(4));
		
		
	}
	
	public void doRender(Collection<Integer> collection)
	{
		System.out.println(collection.size());
		System.out.println(collection);
	}
	
}
