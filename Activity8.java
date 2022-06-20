package activities;

public class Activity8 {

	public void exceptionTest(String str) throws CustomException {

		if (str==null) {
			throw new CustomException("This is the exception message: String value is null");
		}		
		else {
			System.out.println("String = " + str);
		}	
	}

	public static void main(String[] args) {

		try {
			// Method call with correct input
			Activity8 obj = new Activity8();
			obj.exceptionTest("Will print to console");
			// Method call with incorrect input
			obj.exceptionTest(null); // Exception is thrown here

		} catch(CustomException e) {
			System.out.println("Inside catch block: " + e.getMessage());
		}

	}

}
