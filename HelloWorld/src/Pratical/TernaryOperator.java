package Pratical;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner (System.in);
		{System.out.println("enter your num1 marks");
		}
		int x = obj.nextInt();
		{System.out.println("enter your num2 marks");
		}
		int Y = obj.nextInt();
		int z= (x>Y)?x:Y;
		System.out.println(z);
	}

}
