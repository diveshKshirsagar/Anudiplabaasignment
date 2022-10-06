package Pratical;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num1");
		System.out.println("eneter the num2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum= num1+num2;
		System.out.println("sum of two number:" +sum);
		int sub = num1-num2;
		System.out.println("sub of two number:" +sub);
		int mul =num1*num2;
		System.out.println("mul of two number:" +mul);
		float div = num1/num2;
		System.out.println("div of two number:" +div);
		float mod = num1%num2;
		System.out.println("mod of two number:" +mod);
		int incr = ++num1;
		System.out.println("increment of  a number:" +incr);
		int decr = --num2;
		System.out.println("Decrement of a number:" +decr);
		
		
	}

}
