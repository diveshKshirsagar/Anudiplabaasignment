package Exhanding;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class UsingTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myObj = new File("demo.text");
		Scanner myReader;
		
		try  
		{
			myReader =  new Scanner(myObj);
			while (myReader.hasNextLine());
			String data = myReader.nextLine();
			System.out.println(data);
			 myReader.close();
		}
		   catch (FileNotFoundException e) {
			   e.printStackTrace();
		}
		
		
	}
}
