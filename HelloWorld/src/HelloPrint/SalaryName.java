package HelloPrint;

import java.util.Scanner;

public class SalaryName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter name :");
		String name = myObj.nextLine();
		System.out.println("enter age :");
		int age = myObj.nextInt();
		System.out.println("enter Salary :");
		double Salary = myObj.nextDouble();
		System.out.println("Name :"+name);
		System.out.println("age:"+age);
		System.out.println("Salary:"+Salary);
	
	}

}
