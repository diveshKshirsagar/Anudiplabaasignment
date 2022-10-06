package Pratical;

import java.util.Scanner;

public class TerPostitionNegavtive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        
        int a =sc.nextInt();
        
        String Result = (a>0)?"Postitive":"negative";
        System.out.println(Result);
	}

}
