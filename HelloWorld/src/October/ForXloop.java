package October;
import java.util.Scanner;
public class ForXloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner (System.in);
		     System.out.println("Enter the of  x in eq.x^y");
		     int x = sc.nextInt();
		     
		     System.out.println("Enter the of y in eq.x^y");
		     int y = sc.nextInt();
		     
		     int r =1;
		     for (int i=1;i<=y;i++)
		     {
		    	 r*=x;
		    	 
		     }
		     System.out.println(r);
	}

}
