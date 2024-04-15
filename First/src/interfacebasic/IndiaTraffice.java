package interfacebasic;

public class IndiaTraffice implements TrafficLight,WalkRule 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TrafficLight b = new IndiaTraffice();//method in traffic light body in class 
		b.greengo();
		b.redstop();
		IndiaTraffice a = new IndiaTraffice();
		a.walk();
		WalkRule c = new IndiaTraffice();
		c.walkmate();

	}

	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("welcome to green yo go");
		
	}

	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("STOP");
		
	}
	public void walk()
	{
		System.out.println("walk on Red");
	}

	public void walkmate() {
		// TODO Auto-generated method stub
	System.out.println("welcome to walk");	
	}
}
