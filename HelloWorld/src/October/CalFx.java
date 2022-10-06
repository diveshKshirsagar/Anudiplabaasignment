package October;
import java.util.Scanner;
public class CalFx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		if(0<x && x<10)
		{
			int fx=x+2;
			System.out.println(fx);
		}
		else if (x>=10)
		{
			int fx=x*x+2;
			System.out.println(fx);
		}

	}

}
