package ApplicationTests;

import ApplicationMethods.UImethods;

public class AllTests {


	public static void main(String[] args) {
		
		String myName = "Mahesh";

		UImethods ObjUI = new UImethods(myName);
		
		
		ObjUI.fnApplogin();
		ObjUI.ValidateOrderNumber();
		

		
		
		
		
		
	}

	
	

}
