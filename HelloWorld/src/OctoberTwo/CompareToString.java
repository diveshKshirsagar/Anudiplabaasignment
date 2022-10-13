package OctoberTwo;
import java.util.Scanner;

public class CompareToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Hd = new Scanner(System.in);
		

     System.out.println("Enter First String:");
     String a= Hd.next();
     System.out.println("Enetr Second String:");
     String b= Hd.next();
     boolean result = a.equals(b);
     System.out.println(result);
     
     System.out.println("Enter First String:");
     String a1= new String(Hd.next());
     System.out.println("Enter Second String:");
     String b2= new String(Hd.next());
     a1= a1.intern();
     b2 = b2.intern();
     boolean result2 =a.equals(b);
     System.out.println(result);
     
}

}
