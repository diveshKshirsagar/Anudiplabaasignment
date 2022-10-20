package Arry.java;
import java.util.Scanner;
public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int my_array1[] ={1789,2035,1899,1456,1458,2013,2458,1254,1472,2365};
		
	    for(int x:my_array1)
		{
			if(x==a)
			{
				System.out.println("this is an array");
			}
			else
			{
				System.out.println("this is not pressent in array");
			}
			
		}
		
	}
}
