
import java.util.*;
public class Basicjava {

	public static void main(String[] args) {

		//Data types
		
		int a,b,c;
		//a=5;
		String s;
		float d;
		d =3.457888f;
		//s="atul";
		char letter = 'r';
		Scanner sc = new Scanner(System.in);
		a =sc.nextInt();
		System.out.println(a);
		s=sc.nextLine();
		System.out.println(s);
		System.out.println(d);
		System.out.println(letter);
		
		//Arrays in java
		int[] arr = new int[5]; // declare varibale and allocate the memory
		arr [0]=1; // array start with zero index
		arr [1]=3;
		arr [2]=4;
		arr [3]=5;
		arr [4]=6;
		System.out.println(arr);
		int[] arr2 = {1,2,3,4,5};// another way
		System.out.println(arr2[0]);
		String[] arr3 = {"atul", "yadav", "chetan", "mayara"};
		//for llop
		for (int i=0; i<arr.length;i++)
		{
System.out.println(arr[i]);
	}
		for (int j=0; j<arr2.length;j++)
		{
			System.out.println(arr2[j]);
		}
		for (int j=0;j<arr3.length; j++)
		{
			System.out.println(arr3[j]);
		}
	}
	// enhanced for loop
//		for (int m:arr)
//	{
//		System.out.println(m);
//	}
	
		
}

