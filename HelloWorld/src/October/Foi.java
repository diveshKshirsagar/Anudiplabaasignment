package October;

import java.util.Scanner;
public class Foi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a0=0 , a1=1 ,a2;
		
		for (int i=3;i<n;i++)
		{
			a2=a0+a1;
			System.out.println(a2+"");
			a0=1;
			a1=a2;
		}
	}

}
