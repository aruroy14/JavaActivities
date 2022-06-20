package activities;

public class Activity7 {

	public static void main(String[] args) {
		MountainBike obj = new MountainBike();
		int newSeatHeight =  obj.setHeight(20);
		System.out.println("New seat height = " + newSeatHeight);
		obj.bicycleDesc();
		obj.speedUp(50);
		obj.applyBrake(20);

	}

}
