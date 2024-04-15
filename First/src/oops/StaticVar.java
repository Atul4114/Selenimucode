package oops;

public class StaticVar {
	String name; // instance variable change with object to object 
	String age;
	static String address = "Devrukh"; // share the copy to all object and this var is part of class 
	// suppose address have the same as Devrukh so we dont want to waste the memoery for each obejct with add 
	// Make  address as static 
	static int i=0;// remove the static and observ the change its indicate instance 
	
	public StaticVar(String name, String age)// local varibale scope within block only
	{
		this.name = name; // this represent the instance varible present in global for class
		this.age =age;
	//	this.address=address;
		i++;
		System.out.println(i);
		
	}
	
	public void getAddress()//default access anywhere from the package 
	{
		System.out.println(name+" "+address);
	}
	public static void getName()//static method only accpet the static varibale 
	{
		System.out.println(address); // address is static so allowed 
		//System.out.println(age);// try with age not allowed show erroe becuase its not static var 
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar g = new StaticVar("atul", "24");// create object call the constuctor then constructor with this keyword assing to instanca
		StaticVar h = new StaticVar("Yadav", "24");
		StaticVar i = new StaticVar("radha", "22");// constructor automatically get call 
		g.getAddress();
		h.getAddress();
		StaticVar.getName();// static method/var can call without object call with classname because of static behaviour not get change 
		
	}
	

}
