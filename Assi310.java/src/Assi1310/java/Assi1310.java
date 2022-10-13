package Assi1310.java;
import java.util.Scanner;
public class Assi1310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your roll no");
		int x=sc.nextInt();
		if (x%4==1)
		{
			System.out.println("Your are in Sapphire");
		}
		else if (x%4==2)
		{
			System.out.println("Your are in Perl");
		}
		else if (x%4==3)
		{
			System.out.println("Your are in Ruby");
		}
		else if (x%4==0)
		{
			System.out.println("Your are in Emerald");
		}


	}

}
