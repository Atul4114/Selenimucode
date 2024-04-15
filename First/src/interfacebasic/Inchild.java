package interfacebasic;

public class Inchild extends InParent{
	public void color()
	{
		String s = "black child class";
		System.out.println(s);
	}
	
	public void start()
	{
		System.out.println("start in child");
		int z=20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inchild a = new Inchild();
		a.color();
		a.engine();
		a.gear();
		
		
	}

}
