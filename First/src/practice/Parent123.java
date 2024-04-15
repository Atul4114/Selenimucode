package practice;

public class Parent123 {  //if we mark the class as final it will not extended its properties 
	String name ="QA Parent";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=10;
		b=20;
		c=30;
		
		System.out.println("I am Parent");
	}

public void getData()
{
	System.out.println("I m mehtod in Parent");
}
public void getFax(int d, int e)
{
	int f= d+e;
	System.out.println(f);
}
public void NewChild()
{
	System.out.println("its child method in parent");
}
public Parent123()
{
	System.out.println("parent constirctor");
}
}
