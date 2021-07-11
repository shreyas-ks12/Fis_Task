package task;

import java.util.Comparator;

import task.Device;

public class SortBasedOnReview implements Comparator<Device>{

	@Override
	public int compare(Device device1, Device device2) {
		
		return device1.getreview() - device2.getreview();
	}
		


}
