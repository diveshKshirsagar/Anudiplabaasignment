package OctoberTwo;
import java.util.Scanner;
public class MonthEum {
	enum Level{JAN,FEB,MARCH,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level var = Level.MAY;
		
		switch (var)
		{
		case JAN->System.out.println("1st Month");
		case FEB->System.out.println("2st Month");
		case MARCH->System.out.println("3st Month");
		case APR->System.out.println("4st Month");
		case MAY->System.out.println("5st Month");
		case JUN->System.out.println("6st Month");
		case JUL->System.out.println("7st Month");
		case AUG->System.out.println("8st Month");
		case SEP->System.out.println("9st Month");
		case OCT->System.out.println("10st Month");
		case NOV->System.out.println("11st Month");
		case DEC->System.out.println("12st Month");
		
		}
      
	}

}
