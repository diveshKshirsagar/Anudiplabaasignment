package Imlements;

interface bank
{
	public double rateofInerest();
}

class SBI implements bank{
	public double rateofInerest()
	{
		return 9.5;
	}
}
 
class ICICI implements bank
{
	public double rateofInerest()
	{
		return 10.6;
	}
}

class AXIS implements bank
{
	public double rateofInerest()
	{
		return 11.9;
	}
}

public class Main3 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
        SBI Obj = new SBI();
        System.out.println("rate of interest of SBI is :"+Obj.rateofInerest());
        
        ICICI Obj1 = new ICICI();
        System.out.println("rate of interest of ICICI is :"+Obj1.rateofInerest());
	
        AXIS Obj2 = new AXIS();
        System.out.println("rate of interest of AXIS is :"+Obj2.rateofInerest());
	}

}
