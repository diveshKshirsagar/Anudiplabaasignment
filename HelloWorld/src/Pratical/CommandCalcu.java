package Pratical;
import java.util.Scanner;

public class CommandCalcu {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
				int num1, num2;
					if(args[0].equals("+")) {
						
					
						num1 = Integer.parseInt(args[1]);// initialization
						num2 = Integer.parseInt(args[2]);
							System.out.println(num1+num2);
					}
					else if(args[0].equals("-")) {
						
						
						num1 = Integer.parseInt(args[1]);// initialization
						num2 = Integer.parseInt(args[2]);
							System.out.println(num1-num2);
					}
					else if(args[0].equals("*")) {
						
						
						num1 = Integer.parseInt(args[1]);// initialization
						num2 = Integer.parseInt(args[2]);
							System.out.println(num1*num2);
					}
					else if (args[0].equals("%")) {
						
						
						num1 = Integer.parseInt(args[1]);// initialization
						num2 = Integer.parseInt(args[2]);
							System.out.println(num1%num2);
					}
					else {
						System.out.println("invalid input");
					}
			
		}

	}