package task;

import java.util.Comparator;

import task.Device;

public class SortBasedOnCost implements Comparator<Device>{

	@Override
	public int compare(Device dev1, Device dev2) {
		
		return dev1.getCost() - dev2.getCost();
	}
		


}
