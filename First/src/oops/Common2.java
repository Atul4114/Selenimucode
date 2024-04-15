package oops;

public class Common2 {
	private int len;
	private int height;
	private int width;
	
	public void Setarea(int l, int h, int w)
	{
		System.out.println("area=" +l+" "+h+" "+w+"");

	}
	public int setlen(int l)
	{
	len =l;
	return len;
	}
	public int setheight(int h1)
	{
		height =h1;
		return height;
	}
	public int setwidth(int w)
	{
		width =w;
		return width;
	}
	public int getlen(int l)
	{
	
	return len;
	}
	public int getheight(int h1)
	{
	
		return height;
	}
	public int getwidth(int w)
	{
		
		return width;
	}
}
