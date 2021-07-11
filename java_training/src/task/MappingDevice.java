package task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import task.Computer;
import task.Mobile;
import task.Camera;

public class MappingDevice {

	public static void main(String[] args) 
	{
		Map<String, List<Device>>  devMap = new HashMap<>();
		Device dev1=new Mobile(4,5000,"Samsung");
		Device dev2=new Mobile(3,10000,"MI");
		Device dev3=new Mobile(5,20000,"Apple");
		List<Device> mobList = new ArrayList<>();
		mobList.add(dev1);
		mobList.add(dev2);
		mobList.add(dev3);
		devMap.put("Mobile", mobList);
		Device lap1=new Laptop(25,3,4,25000,"Asus");
		Device lap2=new Laptop(30,4,5,45000,"HP");
		Device lap3=new Laptop(10,2,3,50000,"Dell");
		List<Device> lapList = new ArrayList<>();
		lapList.add(lap1);
		lapList.add(lap2);
		lapList.add(lap3);
		devMap.put("Laptop", lapList);
		Device cam1=new Camera(35,4,3,30000,"Sony");
		Device cam2=new Camera(20,10,5,2000,"Canon");
		Device cam3=new Camera(25,15,2,4000,"Nikon");
		List<Device> camList = new ArrayList<>();
		camList.add(cam1);
		camList.add(cam2);
		camList.add(cam3);
		devMap.put("Camera",camList);
		
		Iterator<String> iterator = devMap.keySet().iterator();
		
		while(iterator.hasNext())
		{
			
			String deviceName = iterator.next();
			
			
			if(deviceName.equals("Mobile"))
			{
				List<Device> Devices = devMap.get(deviceName);
				System.out.println("==================================");
				for (Device device : Devices) {
					
					if(device.getCost()>=4000 && device.getCost()<=30000)
					{
						
						System.out.println(device.Name);
					}
				}
			}
		}
		System.out.println("=================================");
		Collections.sort(lapList,new SortBasedOnReview());
		doPrint(lapList," Sort Based on Ratings ");
		Collections.sort(lapList,new SortBasedOnCost());
		doPrint(lapList," Sort Based on Cost ");
	}
	public static void doPrint(Collection<Device> collection,String tagLine)
	{
		System.out.println("\n\n ============"+tagLine+"=========================\n");
		
		for (Device device : collection) {
			System.out.println(device.Name);
		}
	}

}