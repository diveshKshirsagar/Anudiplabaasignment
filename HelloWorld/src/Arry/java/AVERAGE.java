package Arry.java;
import java.util.Scanner;
public class AVERAGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int num[] = {20,30,25,35,-16,60,100};
		int sum = 0;
		float avg= 0.0f;
		
		for (int i=0;i<num.length;i++)
		{
		     sum+=num[i];
		     avg = sum /num.length;
		     
		}
		
		System.out.println(avg);
	}

}
