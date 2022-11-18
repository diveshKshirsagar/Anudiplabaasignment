package ThreeManagement;

public class Main extends Thread {
	
	public void run()
	{
		for (int i=1; i<=100;i++)
		{
			System.out.println("TRD 1" +i);
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj = new Main();
		obj.start();
		for (int i=1;i<50;i++)
		{
			System.out.println("main TRD" +i);
		}

	}

}
