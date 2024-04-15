package practice;

public class ExceptionDemo {
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i =5;
		//3 lines of code
		//try catch mechanism
		int b=10;
		int f=0;
		try
		{
		   int k = b/f;
		   System.out.println(k);
		}
		catch (Exception e)
		{
			System.out.println("cath the error");
		}
	}

}


