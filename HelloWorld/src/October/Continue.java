package October;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<10; i++)
		{
			if (i==5)
			{
				continue;
			}
			else 
				System.out.println(i);
		}
		System.out.println("Loop is terminated Break");
		

	}

}
