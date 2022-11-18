package Exhanding;

public class ExhandingAddFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1 = "HEELO";
         try {
        	 for (int i=0; i<str1.length();i++)
        	 {
        		 System.out.println(str1.charAt(i));
        	 }
         }
         finally {
        	 System.out.println("Execute always");
         }
	}

}
