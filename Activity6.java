package activities;

public class Activity6 {
	
	public static void main(String args[]) throws InterruptedException
	{
		Plane plane = new Plane(10);
		plane.onboard();
//		Print the take-off time using the takeOff() method.
		System.out.println("TakeOff time= " + plane.takeOff());
		
//		Print the list of passengers using the getPassengers() method.
		System.out.println("Passenger list = " + plane.getPassengers());
		
//		Add a Thread.sleep() method to pause execution for 5 seconds. This is to emulate plane in flight.
		Thread.sleep(5000);
		
		//Plane has landed
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
	}

}
