package Has_Map;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Capital_Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> capitalcities = new HashMap<>();
		capitalcities.put("India","Delhi");
		capitalcities.put("France","Delhi");
		capitalcities.put("uk","london");
		capitalcities.put("null","paris");
		capitalcities.put("null","Banglore");
	         for (String key:capitalcities.keySet())
	        	 System.out.println("key"+key+"value"+capitalcities.get(key));
	         for (String v:capitalcities.values())
	        	 System.out.println(v);
	        	 
	}

}
