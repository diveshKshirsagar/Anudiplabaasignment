package Exhanding;
import java.util.Scanner;
import java.io.File;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		File myObj = new File ("deno.txt");
		Scanner sc = new Scanner(myObj);
		while (sc.hasNextLine())
		{
			String data = sc.nextLine();
			System.out.println(data);
			sc.close();
		}
	}

}
