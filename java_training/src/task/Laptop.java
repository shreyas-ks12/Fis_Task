package task;

public class Laptop extends Device {

public Laptop(int power,int time, int review, int cost,String name) {
	super(power , time , review , cost,name);
}

public void LPower() {
	System.out.println("Laptop  consumes: " +power);
}
public void LCost() {
	System.out.println("Power cost of Laptop" +cost);
}
}
