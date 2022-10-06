package Pratical;

import java.util.Scanner;

public class Grade{
    public static void main(String[] args)
{
	
	Scanner obj = new Scanner (System.in);
	{System.out.println("enter your sub1 marks");
	}
	int sub1 = obj.nextInt();
	{System.out.println("enter your sub2 marks");
	}
	int sub2 = obj.nextInt();
	{System.out.println("enter your sub3 marks");
	}
	int sub3 = obj.nextInt();
	int Avg = (sub1 + sub2 + sub3)/3;
	if(Avg>=70)
	{System.out.println("you have A Grade");
	}

	else if (Avg>=60 && Avg<70)
	{System.out.println("you have B Grade");
	}
	else if (Avg<60)
	{System.out.println("you are Fail");
	}
	
}
}

