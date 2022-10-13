package OctoberTwo;
import java.util.Scanner;

public class Multiplication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter the String");
	Scanner obj = new Scanner (System.in);
	String num = obj.nextLine();
	String [] numarr = num.split(",");
	int mul = 1;
	for (String i:numarr) {
		mul*= Integer.parseInt(i);
	}
	  System.out.println("multipication of 5 number is "+mul);
	
	}

}
