package com.fis.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fis.app.exce.NoDeviceFoundException;
import com.fis.app.model.ElectronicDevice;

public class ElectronicDeviceDAOImpl implements IElectronicDeviceDAO {

	Connection con = null;

	String insertElectronicDeviceQuery = "insert into eledevice.device values(?,?,?,?,?,?,?)";
	String selectAllDevices = "select * from eledevice.device";
	String updateCost="update eledevice.device set cost=? where deviceId=? ";
	String updateRating="update eledevice.device set starRatings=? where deviceId=?";
	String deleteDevice="delete from eledevice.device where deviceId=?";
	String displayBasedType="select * from eledevice.device group by brandName,deviceType";
	String count="select deviceType,count(deviceType)as Count from eledevice.device group by deviceType";
	String sumPrice="select deviceType,sum(cost)as Sum from eledevice.device group by deviceType";
	
	@Override
	public boolean addDevice(ElectronicDevice ed) throws Exception
	{
		con = DatabaseUtil.getConnection();
		boolean isInserted = false;
		if (con != null) {

			
			int id = ed.getDeviceId();
			String name = ed.getDeviceType();
			String brand=ed.getBrandName();
			int cost=ed.getCost();
			int power=ed.getPower();
			int rating=ed.getStarRatings();
			String color=ed.getColor();

			PreparedStatement ps = con.prepareStatement(insertElectronicDeviceQuery);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, brand);
			ps.setInt(4, cost);
			ps.setInt(5, power);
			ps.setInt(6, rating);
			ps.setString(7, color);
			// Step 3 : execute Query
			int i = ps.executeUpdate(); // only works with insert , update & delete

			if (i > 0)
				isInserted = true;

		}

		return isInserted;
	}

	@Override
	public List<ElectronicDevice> getAllDevices() throws Exception{
		
		con = DatabaseUtil.getConnection();
		List<ElectronicDevice> electronicsList = new ArrayList<>();
		if (con != null) {

			PreparedStatement ps = con.prepareStatement(selectAllDevices);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ElectronicDevice temp = new ElectronicDevice(); // default emp,

				temp.setDeviceId(rs.getInt(1));
				temp.setDeviceType(rs.getString(2));
				temp.setBrandName(rs.getString(3));
				temp.setCost(rs.getInt(4));
				temp.setPower(rs.getInt(5));
				temp.setStarRatings(rs.getInt(6));
				temp.setColor(rs.getString(7));
				electronicsList.add(temp);
			}

		}
		return electronicsList;
	}

	
	@Override
	public boolean changeDevicePrice(int deviceId, int newPrice)throws NoDeviceFoundException, SQLException 
		{
		//String updateCost="update Electronics.electronics set cost=? where deviceId=? ";
		con = DatabaseUtil.getConnection();
		boolean isUpdated = false;
		if (con != null) {

			PreparedStatement ps = con.prepareStatement(updateCost);
			ps.setInt(1,newPrice);
			ps.setInt(2,deviceId);
			int i = ps.executeUpdate();
			// only works with insert , update & delete
			System.out.println("i="+i);
			if (i > 0)
				isUpdated = true;
		}
		
		return isUpdated;
		}		

	@Override
	public boolean changeDeviceRating(int deviceId, int newRating) throws NoDeviceFoundException, SQLException
	{
		con = DatabaseUtil.getConnection();
		boolean isUpdated = false;
		if (con != null) {

			PreparedStatement ps = con.prepareStatement(updateRating);
			ps.setInt(1,newRating);
			ps.setInt(2,deviceId);
			int i = ps.executeUpdate();
			// only works with insert , update & delete
			System.out.println("i="+i);
			if (i > 0)
				isUpdated = true;
		}
		
		return isUpdated;
		
	}
//	@Override
//	public ElectronicDevice getDeviceBasedId(int id) throws Exception {
//		con = DatabaseUtil.getConnection();
//		ElectronicDevice ed = null;
//		if (con != null) {
//
//			PreparedStatement ps = con.prepareStatement(selectDeviceBasedOnID);
//			ps.setInt(2, id);
//
//			ResultSet rs = ps.executeQuery();
//			boolean isFound = false;
//			while (rs.next()) {
//				isFound = true;
//				ElectronicDevice temp = new ElectronicDevice(); // default emp,
//
//				temp.setDeviceType(rs.getString(1));
//				temp.setDeviceId(rs.getInt(2));
//				temp.setBrandName(rs.getString(3));
//				temp.setCost(rs.getInt(4));
//				temp.setPower(rs.getInt(5));
//				temp.setStarRatings(rs.getInt(6));
//				temp.setColor(rs.getString(7));
//			ed=temp;
//				 
//			}
//
//			if (!isFound)
//				throw new NoDeviceFoundException(id);
//
//		}
//		return ed;
//	}

	@Override
	public boolean deleteDevice(int deviceId) throws NoDeviceFoundException, SQLException {
		
		con = DatabaseUtil.getConnection();
		boolean isUpdated = false;
		if (con != null) {

			PreparedStatement ps = con.prepareStatement(deleteDevice);
			ps.setInt(1,deviceId);
			
			int i = ps.executeUpdate();
			// only works with insert , update & delete
			System.out.println("i="+i);
			if (i > 0)
				isUpdated = true;
		}
		
		return isUpdated;
	}

	@Override
	public List<ElectronicDevice> geDevicesBasedOnBrandNameAndType(
			String brandName, String type) throws SQLException
			{
				
		con = DatabaseUtil.getConnection();
		List<ElectronicDevice> electronicsList = new ArrayList<>();
		if (con != null) {

			PreparedStatement ps = con.prepareStatement(displayBasedType);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ElectronicDevice temp = new ElectronicDevice(); 

				temp.setDeviceId(rs.getInt(1));
				temp.setDeviceType(rs.getString(2));
				temp.setBrandName(rs.getString(3));
				temp.setCost(rs.getInt(4));
				temp.setPower(rs.getInt(5));
				temp.setStarRatings(rs.getInt(6));
				temp.setColor(rs.getString(7));
				electronicsList.add(temp);
			}

		}
		return electronicsList;
			}

	@Override
	public int countDeviceType(String type) throws SQLException 
	{
		//String countType="select deviceType,count(deviceType)as Count from Electronics.electronics group by deviceType";
		con = DatabaseUtil.getConnection();
		int count=0;
		if (con != null) {

			PreparedStatement ps = con.prepareStatement(countType);
			
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				count=rs.getInt("Count");
				String dtype=rs.getString("deviceType");
				System.out.println(dtype+"-"+count);
			}
		
		}
		return count;
	}

	@Override
	public int getSumofPriceBasedOnType(String type) throws SQLException
	{
		con = DatabaseUtil.getConnection();
		int total=0;
		if (con != null) {

			PreparedStatement ps = con.prepareStatement(sumPrice);
			
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				total=rs.getInt("Sum");
				String dtype=rs.getString("deviceType");
				System.out.println(dtype+"-"+total);
			}
		
		}
		return total;
	}

	@Override
	public List<ElectronicDevice> getDevicesBasedOnPriceRangeandType(int range1,int range2, String type, List<ElectronicDevice> ls) throws SQLException {
		ls=ls.stream().filter(ed1->{return ed1.getDeviceType().equals(type)&& ed1.getCost()>=range1&&((ElectronicDevice)ed1).getCost()<=range2;}).collect(Collectors.toList());
		return ls;
	}
}