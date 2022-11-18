package Exhanding;
import java.util.Scanner;

public class ExhandingUsingIfAndElse {
	
     public static void checkAge(int age)
     {
    	 if(age>=18)
    	 {
    		 System.out.println("Access is allowed");
    	 }
    	 else 
    	 {
    		 throw new ArithmeticException("Access denied");
    	 }
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner obj = new Scanner (System.in);
		int age1 = obj.nextInt();
		checkAge(age1);
	}

}
