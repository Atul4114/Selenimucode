package encapsulationdemo;

public class Common {

	private int lenght,height,width,d,e;
	
	private void setBoxdimension (int l, int h, int w)
	{
		System.out.println("box dimension" +l+" "+h+" "+w+" ");
		
	}
private void setParam(int h, int g)
{
	System.out.println("numbers are"  +h+" "+g );
}

public static void main(String[] args) {
	// TODO Auto-generated method stub"
	Common j = new Common();
	j.setBoxdimension(10,20,30);
	

}
}