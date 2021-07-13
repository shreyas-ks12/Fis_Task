package com.fis.app.test;

import java.util.List;

import com.fis.app.model.ElectronicDevice;
import com.fis.app.dao.ElectronicDeviceDAOImpl;
import com.fis.app.dao.IElectronicDeviceDAO;

public class TestRunner 
{
public static void main(String[] args) {
		
		try {
			
			
			/* FOR Inserting Devices
			 * */
			IElectronicDeviceDAO dao = new ElectronicDeviceDAOImpl();
			
			
			List<ElectronicDevice>list=dao.getAllDevices();
			List<ElectronicDevice>filterList=dao.getDevicesBasedOnPriceRangeandType(1000,3000, "Camera", list);
			for(ElectronicDevice filtered:filterList)
			{
				System.out.println(filtered);
			}
			
		} catch (Exception e) {
			System.out.println(" Problem "+e);
		}
	}
}