package HelloPrint;

public class DataTypes { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum =9;
		double myFloatNum =8.99f;
		char myLetter = 'a';
		boolean myBool = false;
        String myText = "Hello World";
        System.out.println(myNum);
        System.out.println(myText);
        
        // Concanate String+
        
       /* String fname ="Divesh";
        String lname ="Kshirsgar";
        String Fullname = fname+""+lname;
        System.out.println(Fullname);
        
       */ 
        
        String fname = "5";
        String lname = "7";
        int fullname = Integer.parseInt(fname)+ Integer.parseInt(lname);
        System.out.println(fullname);
        
        
		
	}

}
