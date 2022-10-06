package October;
import java.util.Scanner;

public class muitiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner (System.in);
      System.out.println("enter the no for which you want multiplication table");
       int a = sc.nextInt();
       for (int i=1;i<=10;i++)
       {
    	   int n=a*i; 
    	   System.out.println(a+"*"+i+"="+n);
       }
       
      
	}

}
