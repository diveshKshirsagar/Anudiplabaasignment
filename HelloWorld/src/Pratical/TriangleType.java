package Pratical;
import java.util.Scanner;
public class TriangleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the sides of Triangle");
        int side1=obj.nextInt();
        int side2= obj.nextInt();
        int side3= obj.nextInt();
        if (side1==side2 && side2 == side3 && side3==side1)
        {
        	System.out.println("equialateral");
        }
        else if (side1==side2 || side2 == side3 || side3==side1) {
        	System.out.println("iso");
        }
        else
        {
        	System.out.println("Scalen");
        }
	} 

}
