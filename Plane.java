package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	
	 private List<String> passengers;
	    private int maxPassengers;
	    private Date lastTimeTookOf;
	    private Date lastTimeLanded;
	    

	public Plane(int maxPassengers) {
		this.maxPassengers=10;
		this.passengers = new ArrayList<>();
	}

	public void onboard() //add passengers to the array using the add() method
	{
		passengers.add("Alice");
	passengers.add("John");
	passengers.add("Jacob");
	}
	
	public Date takeOff()//returns the current date and time
	{
		Date date = new Date();
		return date;
	}
	
	public void land() //sets the value of lastTimeLanded to the current date and time. Also clear() the array.
	{
		this.lastTimeLanded = new Date();
    this.passengers.clear();
    }
	
	public Date getLastTimeLanded()// returns the value of lastTimeLanded.
	{
		return lastTimeLanded;
	}
	
	public List<String> getPassengers() //returns the array of passengers.
	{
		return passengers;
	}


}
