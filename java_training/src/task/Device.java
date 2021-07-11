package task;

public class Device  implements Comparable<Device> {

	int power;
	int time;
	int review;
	int cost;
	String Name;
	
	public Device(int power,int time,int review,int cost,String name) {
		super();
		this.power = power;
		this.time = time;
		this.review = review;
		this.cost = cost;
		Name =name;
	}
	
	
	
	public Device(int review, int cost, String name) {
		super();
		this.review = review;
		this.cost = cost;
		Name = name;
	}



	public int getPower() {
		return power;
		
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getttime() {
		return time;
	}
	public void settime(int time) {
		this.time=time;
		
	}
	public int getreview() {
		return review;
		
	}
	public void setreview(int review) {
		this.review = review;
	}
	
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public void TotalConsumption() {
		power=(power/1000);
		System.out.println("Power consumption is "+power+"KiloWatts");
	}
	public void TotalCost() {
		cost = cost*time*power;
		System.out.println("total cost is : " +cost);
	}
	@Override
	public int compareTo(Device d) {
		// TODO Auto-generated method stub
		return this.getCost() - d.getCost() ;
	}
	@Override
	public String toString() {
		return "=>" + cost + "-" + review + "-" + time + "-" + power ;
	}
	

}
