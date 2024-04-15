package interfacebasic;

public class OverloadFun {
	
	public void getdata(int a)
	{
		System.out.println(a);
	}
	public void getdata(int b, int c)
	{
		System.out.println(b + c);
	}
	public void getdata (String f)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadFun h = new OverloadFun();
		h.getdata(20);
		h.getdata(10, 30);
	}

}
