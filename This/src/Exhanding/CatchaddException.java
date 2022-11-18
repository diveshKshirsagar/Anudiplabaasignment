package Exhanding;

public class CatchaddException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch (Exception e)
		// catch (nullpointerException e)
		{
			System.out.println("catch code");
		}
	}

}
