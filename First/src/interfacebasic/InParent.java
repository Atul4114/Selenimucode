package interfacebasic;

public class InParent {
	public void gear()
	{
		System.out.println("Gear");
	}
	public void engine()
	{
		System.out.println("electric engine");
	}
	public void color()
	{
		String s = "red";
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		InParent k = new InParent();
		k.color();
		int a=10;
		int c=a+a;
		System.out.println(c);
}
}	
