package task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import task.Computer;
import task.Device;

public class SortedDeviceOnReview{

	public static void main(String[] args) {
		
		
		Set<Device> devSet = new TreeSet<>();
		devSet.add(new Computer( 2100, 20,2,10000,"Asus"));
		devSet.add(new Computer( 4200, 39,5,20000,"Dell"));
		devSet.add(new Computer(3200,  50,3,30000,"HP"));
		devSet.add(new Computer( 1100, 25,4,5000,"Apple"));
		
		
		// default sorting approach 
		doPrint(devSet,"Default Data Rendering ");
		
		
		/* Objective:-  employee based on Salary   */ 
		
		// Step 1: Convert set to list
		List<Device> reviewBasedList = new ArrayList<>();
		reviewBasedList.addAll(devSet);
		
		//Step 2 :  call collection.sort(list);
		Collections.sort(reviewBasedList, new SortBasedOnReview());
		
		doPrint(reviewBasedList," Sort Data Based on Review ");
		
		
		
		
				
		
		
		
		
		
	}
	
	public static void doPrint(Collection<Device> collection,String tagLine)
	{
		System.out.println("\n\n ============"+tagLine+"=========================\n");
		//int x = 10;
		//System.out.println(x); // 10
		for (Device dev: collection) {
			System.out.println(dev);
		}
	}
}
