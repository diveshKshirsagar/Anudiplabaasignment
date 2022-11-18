package ThreadRunnable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj = new Main();
          Runnable r1 = ()->
          {
        	  for(int i =0; i<100; i++)
        	  {
        		  System.out.println("Another Thread");
        	  }
          };
          Thread r = new Thread(r1);
          r.start();
          for (int i=0;i<50;i++)
        	  System.out.println("Main thread is running");
	}

}
