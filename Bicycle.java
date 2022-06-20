package activities;

public class Bicycle implements BicycleParts,BicycleOperations{
	int gears;
	int currentSpeed;

	public Bicycle()
	{
		gears = 4;
		currentSpeed = 50;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void applyBrake(int decrement) {
		System.out.println("Current speed after applyBrake= " + (currentSpeed-decrement));


	}

	@Override
	public void speedUp(int increment) {
		System.out.println("Current speed after speedUp = " + (currentSpeed+increment));

	}

	public void bicycleDesc()
	{
		System.out.println("No of gears = "+gears+" and Current speed = "+currentSpeed);
	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int speed() {
		// TODO Auto-generated method stub
		return 0;
	}

}
