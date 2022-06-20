package activities;

public class MountainBike extends Bicycle{
	int seatHeight;
	
	
	public MountainBike()
	{
		seatHeight=10;	
		
	}
	
	public int setHeight(int newValue) {
	    return seatHeight = newValue;
	}
	
	@Override
	public void bicycleDesc()
	{
		System.out.println("No of gears = "+super.gears+" and Current speed = "+super.currentSpeed + " Seat height = " + seatHeight);
	}

}
