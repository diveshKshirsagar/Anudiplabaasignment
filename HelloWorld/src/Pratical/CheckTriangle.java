package Pratical;
import java.util.Scanner;
public class CheckTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a+b+c==180) {
		if (a>90 && b>90 && c>90) {
			System.out.println("this is Acure angle");
		}else if (a==90 && b==90 && c==90) {
			System.out.println("this is Right angle");
		}else if (a<90 && b<90 &&c<90) {
			System.out.println("this is not a angle");
		}
		else {
			System.out.println("This is not a angle");
		}
		
		
		

	}

} }
