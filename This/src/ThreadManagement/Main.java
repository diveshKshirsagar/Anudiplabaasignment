package ThreadManagement;

public class Main extends Thread  {
       public static int count = 0;
       public void run()
       {
    	   Main t1 = new Main();
    	   
    	   for (int i=1;i<0;i++)
    	   {
    		   try
    		   {
    			   Thread.sleep(500);
    		   }
    		   catch (InterruptedException e) {
    			   
    			   e.printStackTrace();
    		   }
    		      System.out.println(i);
    	   }
       }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main obj1 = new Main();
		obj1.start();
		Main obj2 = new Main();
		obj2.start();
	}

}
