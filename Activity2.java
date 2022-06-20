package activities;

public class Activity2 {

	public static void main(String[] args) {
//		Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]
//				Find the 10's in the array and add them
//				Check if value is equal to 30.
		int []arr = {10, 77, 10, 54, -11, 10};
		int sum=0;
		for (int tens : arr)
		{
		if(tens==10)
		sum = sum+tens;	
		}
		if (sum==30)
		{
			System.out.println("The sum is 30");
		}
		else {
	System.out.println("The sum is not 30");
	}
	}}

