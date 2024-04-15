import java.util.ArrayList;
import java.util.Arrays;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;

public class Coreif {

	public static void main(String[] args) {
		int[] arr = {1,4,5,6,7,8,9,109,567};// dont get chance to change initialize
		
		for (int m = 0; m<arr.length; m++)
		{
			if (arr[m] % 2==0)
			{
				
				System.out.println(arr[m] +"multiple of 2");
				break;// if to check array cosnist of multiple of 2 
			}
			else
				
			System.out.println(arr[m] + "odd numebr");
		}
		
		ArrayList<String> f = new ArrayList<String>();
		// create object for the calls -> obect.method 
		//f. you get methods in the call of arraylist
		f.add("atul");
		f.add("yadav");
		f.add("radha");
		f.add("mayara");
		f.add("vahini");
		f.add("chetan");
		System.out.println(f.get(1));// to print perticular index
		
		for (int i=0; i< f.size();i++)
		{
			System.out.println(f.get(i));
		}
		//item list present or not for example atul present or not
		System.out.println(f.contains("atul"));
		System.out.println(f);
		List<int> n = Arrays.asList(arr);
		
		
	}

}
