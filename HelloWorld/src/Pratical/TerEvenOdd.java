package Pratical;

import java.util.Scanner;

public class TerEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Number");
         int Number = sc.nextInt();
     
         String result = (Number%2==0)?"even":"odd";
         System.out.println(result);
	}

}
