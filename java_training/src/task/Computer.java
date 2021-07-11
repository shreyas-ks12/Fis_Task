package task;

public class Computer extends Device {

public Computer(int power,int time, int review, int cost,String name) {
	super(power , time , review , cost,name);
}

public void ComPower() {
	System.out.println("Computer consumes: " +power);
}
public void CompCost() {
	System.out.println("power cost of Computer: " +cost);
}
}
