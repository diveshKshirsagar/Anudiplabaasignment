package Assi311.java;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

interface Addition  // 
{
	public int Adder(int x, int y);
}

public class LambdaExperction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name=new ArrayList<String>(); // array list
		name.add("DIVESH");
		
		name.forEach((m)->  // lambda expression
		{
			System.out.println(m.toUpperCase());  // use UpperCase method
			
		});
		
		Addition a=(n,m)->  // lambda expression
		{
			return n+m;
		};
		
		System.out.println(a.Adder(7,5));
		
	}

}
