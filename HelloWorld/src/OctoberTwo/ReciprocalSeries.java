package OctoberTwo;
import java.util.Scanner;
public class ReciprocalSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter the number");
      Scanner obj = new Scanner (System.in);
      int num = obj.nextInt();
      double result = 0.0 , reciprocal = 0.0;
      for (double i=1;i<=num;i++)
      {
    	  reciprocal = (1/i);
    	  result = result + reciprocal;
      }
      System.out.println("Sum of series ="+ result );
	}

}
