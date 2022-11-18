package Genericdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
	    List<Integer> number = new ArrayList();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		System.out.println(number.get(2));
	    for (Integer n:number) 
	    {
	    	System.out.println(n);
	    }
	    
	    
		List <String> Months = new ArrayList();
		Months.add("Januray");
		Months.add("feb");
		Months.add("March");
		for (String i:Months)
		{
			System.out.println(i);
		}
		
	}

}


