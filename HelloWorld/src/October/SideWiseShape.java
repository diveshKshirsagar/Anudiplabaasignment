package October;
import java.util.Scanner;

public class SideWiseShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enetr is Number sides");
        int sides = Sc.nextInt();
        
        if(sides==3) {
        	System.out.println("Triangle");
        }
        else if(sides==4) {
        	System.out.println("Sqauer");
        }
        else if(sides==5) {
        	System.out.println("Pentagon");
        }
        else if(sides==6) {
            	System.out.println("Hexagon");
        }
        else if(sides==7) {
        	System.out.println("Octagon");
        }
        else if(sides==8) {
        	System.out.println("nanagon");
        }
        else if(sides==9) {
        	System.out.println("Heptagon");
        }
        else if(sides==10) {
        	System.out.println("Decagon");
        }
        else {
        	System.out.println("invalid input");
        }    
	}
}
