package October;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<5;i++)
		{
			System.out.print(i);
			for (int j=1; j<5;j++)
			{
				if (j==3)
					break;
				System.out.println(j);
			}
			System.out.println(i);
		}

	}

}
