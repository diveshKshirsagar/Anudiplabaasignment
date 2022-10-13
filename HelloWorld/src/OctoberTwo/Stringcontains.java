package OctoberTwo;
import java.util.Scanner;
public class Stringcontains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strl = "java contain";
		boolean result = strl.contains("java");
		System.out.println(result);
		String str = "java porgraming";
		
		System.out.println(str.startsWith("java"));
		System.out.println(str.startsWith("j"));
		System.out.println(str.startsWith("java programing"));
		System.out.println(str.startsWith("program"));

	}

}
