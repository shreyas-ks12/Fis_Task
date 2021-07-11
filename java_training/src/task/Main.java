package task;

public class Main {

	public static void main(String[] args) {
		
		Main m1=new Main();
		Device camera = new Camera(10000, 100,5,6,"Sony");
		Device computer = new Computer(1000,300,2,7,"Asus");
		Device laptop = new Laptop(10000,20,7,9,"HP");
		
		m1.getPower(camera);
		m1.getCost(camera);
		m1.getCost(computer);
		m1.getPower(computer);
		m1.getPower(laptop);
		m1.getCost(laptop);
	}
	
	
	public void getPower(Device d) {
		d.TotalConsumption();
		if(d instanceof Camera) {
			Camera c = (Camera)d;
			c.CamPower();
			}
			if(d instanceof Computer)
			{
				Computer c = (Computer)d;
				c.ComPower();
			}
			if(d instanceof Laptop)
			{
				Laptop l  = (Laptop)d;
				l.LPower();
				
		}
	}
	
		public void getCost(Device d) {
			d.TotalCost();
			if(d instanceof Camera) {
				Camera c = (Camera)d;
				c.Camcost();
				
			}
			if(d instanceof Computer)
			{
				Computer c = (Computer)d;
				c.CompCost();
		}
			if(d instanceof Laptop)
			{
				Laptop l  = (Laptop)d;
				l.LCost();
				
		}
}
}
