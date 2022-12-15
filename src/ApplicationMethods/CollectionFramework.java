package ApplicationMethods;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFramework {

	public static void main(String[] args) {
		
		
		Set ObjCle = new HashSet();
		//Set will not remember the order of insertion
		//Set will automatically remove the duplicate insertions
		
	
		
		List<String> ObjCle = new LinkedList();
			//List will remember the order of insertion
			//List will allow duplicate values
		
		
		ObjCle.add("Mahesh");
		ObjCle.add("uma");
		ObjCle.add(44);
		ObjCle.add("suman");
		ObjCle.add(true);
		ObjCle.add('c');
		ObjCle.add("uma");
		
		
		
		
		//System.out.println(ObjCle);
		
		//System.out.println(ObjCle.get(3));

		
		
		
		
		
		Map<String, String> objMap= new HashMap(); 
		
		objMap.put("Bindu", "maths");
		objMap.put("Srujuna", "asdf");
		objMap.put("Nitin", "Computers");
		objMap.put("Rafi", "Social");
		objMap.put("Mahesh", "food");
		
		
		
	
		
		
		System.out.println(objMap.get("Nitin"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
