package October;
import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int x= sc.nextInt();
		
		if (x>=0 && x<10) {
			System.out.println("Singal digit");
		}
		else if (x>=10 && x<100)
		{
			System.out.println("two digit");
		}
		else if (x>=100 && x<1000)
		{
			System.out.println("three digit");
		}
		else if (x>=1000 && x<10000)
		{
			System.out.println("Four digit");
		}
	}

}
