package October;
import java.util.Scanner;

public class CheckClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner  sc = new Scanner (System.in);
      System.out.println("Enter the Number");
      int x = sc.nextInt();

      if (x%4==1) {
    	  System.out.println("Enerld");
      }
      else if (x%4==2)
      {
    	  System.out.println("ruby");
      }
      else if (x%4==3)
      {
    	  System.out.println("perl");
      }
      else if (x%4==0)
      {
    	  System.out.println("Saphire");
      }
      
	}

}
