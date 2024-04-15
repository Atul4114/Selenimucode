package DemoPackage;



public class Experiment {
	int i =100; //default variable
	public int j =200; //publics 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
	}
void getData()//default method anywhere in package only not outside
{
	System.out.println("I am default in Demo pacakge ");
}

public void test() // access evrywhere in package also var
{
	System.out.println("test of public access modifier");
	
}
private void Add() // only within class 
{
	System.out.println("private access modifier");
}
}
