package Concitanation.java;
import java.util.Scanner;
public class HowToReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str2= "hello";
		str2.concat("World");
		StringBuffer sb= new StringBuffer("Techidvantutorial");
		sb.replace(10, 15, "java");
		System.out.println(sb);
	}

}
