package Pratical;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Marks");
       int marks = sc.nextInt();
       
       String result = (marks>=40)?"pass":"fail";
          System.out.println(result);
	}

}
