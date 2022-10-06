package Pratical;
import java.util.Scanner;
public class TerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number");
       
        System.out.println("A:");
        int a= sc.nextInt();
        System.out.println("B:");
        int b = sc.nextInt();
        System.out.println("C:");
        int c = sc.nextInt();
        
        int largeNumber = (a>b)?((a>c)? a:c):((b>c)? b:c);
        System.out.println("largeNumber");
        
	}

}
