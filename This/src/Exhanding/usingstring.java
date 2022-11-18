package Exhanding;

public class usingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str1 = "hello";
		try {
		for (int i =0;i<str1.length();i++)
		{
			System.out.println(str1.charAt(i));
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
