package HelloPrint;
import java.util.Scanner;

public class TeampCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Value of C:");
		int c = obj.nextInt();
		double f = c*8+32;
		System.out.println("Temperature =" +f);
	}

}
