package Has_Map;
import java.util.HashMap;
import java.util.Map;

public class Out_put_Absent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map fav = new HashMap<>();
		    fav.put("Jeeny", "Bus Tour");
		    fav.put("tom", null);
		    fav.putIfAbsent("jeeny","tram");
		    fav.putIfAbsent("tom","tram");
		    fav.putIfAbsent("Bunny","Coke");
		    System.out.println(fav);
		    
		    
	}

}
