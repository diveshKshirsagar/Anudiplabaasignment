package Pratical;
import java.util.Scanner;
public class LeafYear {

	public static void main(String[] args) {
		//year  to be  checked
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the year");
		
		int year = sc.nextInt();
		if (year%400==0 || year%4==0 && year%100!=0) {
			System.out.println("this is a leafyear");
		}
		else {
			System.out.println("this is not a leaf year");
		}
		

	}

}
