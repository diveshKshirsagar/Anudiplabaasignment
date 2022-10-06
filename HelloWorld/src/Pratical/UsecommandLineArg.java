package Pratical;
import java.util.Scanner;

public class UsecommandLineArg {

	public static void main(String[] args) {
	int num1 ,num2;
	 if(args.length!=0) {
		// try {
			 num1= Integer.parseInt(args[0]);
			 num2 = Integer.parseInt(args[1]);
			 System.out.println("Sum of inputted numbers -");
			 System.out.println(num1+num2);
			 
		 } 
         

	}	

}
