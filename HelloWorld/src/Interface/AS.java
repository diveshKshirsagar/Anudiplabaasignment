package Interface;

interface Drawable
{
        void draw();
public static int cube(int x) 
  {
	return (x*x*x);
  }
}

class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
}


public class AS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Rectangle obj = new Rectangle();
     obj.draw();
     System.out.println(Drawable.cube(5));
     
	}

}
