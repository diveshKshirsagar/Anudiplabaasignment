package Pratical;
import java.util.Scanner;
public class LogicalOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("enetr the number");
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      if (a>b && a>c) {
    	  System.out.println("A is greater number");
      } else if (b>a && b>c) {
    	  System.out.println("B is greater number");
      }else if (c>a && c>b) {
    	  System.out.println("C is greater number");
      }else{
    	  System.out.println("Default");
      }
      
     
      
	}

}
