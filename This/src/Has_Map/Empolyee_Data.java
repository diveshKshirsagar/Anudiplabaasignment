package Has_Map;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public class Empolyee_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<Integer,String> empolyeeData =new HashMap();
         empolyeeData.put(11,"Divesh");
         empolyeeData.put(12, "is");
         empolyeeData.put(13,"the");
         empolyeeData.put(14,"one");
         empolyeeData.put(16,"Who own this town");
         
         for (Integer key : empolyeeData.keySet())
        	 System.out.println("empolyeeData"+key+"EmpolyeeName"+ empolyeeData.get(key));
	}

}
