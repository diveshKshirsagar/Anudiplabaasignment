package October;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner obj = new Scanner(System.in);
          System.out.println("enter the number");
          
          int num=obj.nextInt();
          boolean flag = true;
          
          for (int i=2;i<=num;i++)
          {
        	  if (num%i==0) {
        		  System.out.println("this is compostite num" +num);
        		  flag = false;
        		  break;
        	  }
          }
          if (flag)
          {
        	  System.out.println("this is prime no");
          }
	}

}
