package Tree_Map;

import java.util.TreeMap;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		TreeMap<Integer,String>employee = new TreeMap<>();
		employee.put(102,"Divesh");
		employee.put(103, "ohval");
		employee.put(120,"Mahesh");
		employee.put(106, "Deepali");
		
		 for (Integer P : employee.keySet())
        	 System.out.println("empolyeeID"+P+"EmpolyeeName"+ employee.get(P));
		 for (Integer p: employee.keySet())
			 System.out.println(employee.descendingMap());
		    
		 // for (Integer p : employee.key());
		// System.out.println(employee.subMap(120,106));
	}

}
