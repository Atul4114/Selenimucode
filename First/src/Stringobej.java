
public class Stringobej {

	public static void main(String[] args) {
		
		// string is object which represnt sequence of character
		String s = "atul yadav";// only one same no any other memoery created 
			//not created new object 
		String s1 ="atul yadav";// literal string
		
		//new 
		//String s2 = new String ("welcome");// here two object created 
		String s3 = new String ("welcome to pune eclerx");
		//String[] spitted = s3.split("to");
		//System.out.println(spitted[0]);
		//System.out.println(spitted[1]);
		//System.out.println(spitted[2]);
		for (int i =0; i<s3.length(); i++)
		{
			System.out.println(s3.charAt(i));
		}
		String s4 = "Atul Yadav";
		for (int i=s4.length()-1; i>=0 ;i--)// reverse 
		{
			System.out.println(s4.charAt(i));
		}
		MethodsIntro y = new MethodsIntro();
		y.getdata();
	}

}
