package IambdaExpretion;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class LambdaExprection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num =new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        
        num.forEach((m)->System.out.println(m));
        
        num.forEach((m)->{
        	if (m%2==1)
        		System.out.println(m);
        });
        
        System.out.println(" ");
        
        List<Integer>num1 = new ArrayList<Integer>();
        num1.add(44);
        num1.add(33);
        num1.add(55);
        
        num1.forEach((m)->{
        	if(m>10)
        		System.out.println(m);
        });
	}

}
