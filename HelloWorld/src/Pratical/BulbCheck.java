package Pratical;

import java.util.Scanner;

public class BulbCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		
		int a = sc.nextInt();
		
		if (a<=100) {
			System.out.println("Display Green");
		}else if (a>100 && a<=200) {
			System.out.println("Dispaly yellow");
		}else if (a>200) {
			System.out.println("Dispaly red");
		}
		else {
			System.out.println("Defuse");
		}
		
		
		

	}

} 


