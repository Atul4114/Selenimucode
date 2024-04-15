package practice;

public class ThisDemo {

	int a=2; // values used in entire class Global variable
	public void getData()
	{
		int a=3;// only specific method Loacal variable
		System.out.println("in method" +a);
		// this keyword point to current object means class level keyword refer to global variable 
		System.out.println(this.a);
		//Suppose one is local and one is global please add and display the result
		int d = a+this.a;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo hi = new ThisDemo();
		hi.getData();
	}

}
