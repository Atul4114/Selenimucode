package practice;

public class Child123 extends Parent123 {

	String name ="QA child";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child123 chid = new Child123();
		chid.getData();
		chid.getFax(45, 50);
		chid.stringdata();
		chid.NewChild();
		
	// super keyword help to use the duplicate varibel and method present in the parent and child.
	// use super.variable and for method on first line super();
	//used with varaible, method and cosnstructor
	//by default if no use of super child call its own method or varibale.	
		
		
	}
public void NewChild()
{
	super.NewChild();
	System.out.println("its child method");
}
public Child123()
{
	super();// super constructor used in child so its always on first line
	System.out.println("I m constructor in child");
}
public void stringdata()
{
	System.out.println(name);
	System.out.println(super.name);//refer to parent class means inheritance class extendeds
	// if the same name not present in child meas variable so it takes from parent declare outside the main blcok 
}


}
