package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap<Integer,String> colours = new HashMap<Integer,String>();
		colours.put(1, "Pink");
		colours.put(2, "Yellow");
		colours.put(3, "Black");
		colours.put(4, "Blue");
		colours.put(5, "Purple");
		System.out.println(colours);
		//remove a colour
		colours.remove(3);
		System.out.println("MAp after removing one colour "+colours);

		if (colours.containsValue("Green"))
			System.out.println("Green is present in Map");
		else
			System.out.println("Green is not present in Map");

		System.out.println("Size of Map = "+colours.size());

	}

}
