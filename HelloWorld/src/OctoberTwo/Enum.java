package OctoberTwo;
import java.util.Scanner;

public class Enum {
   enum Level {LOW,MEDIUM,HIGHT};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Level var = Level.HIGHT;
    
   // Scanner obj= new Scanner (System.in);
    //String ch = obj.next();
    
    switch(var)
    {
    case HIGHT:
    	System.out.println("Hight Valume");
    	break;
    	
    case MEDIUM:
    	System.out.println("Medium Valume");
    	break;
    	
    case LOW:
    	System.out.println("Low valume");
    	break;
    }
	}

}
