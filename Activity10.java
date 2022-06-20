package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet <String> hs = new HashSet<String>();
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Mango");
		hs.add("Kiwi");
		hs.add("Grapes");

		System.out.println("Size of the hashset is "+hs.size());

		//print the hashset
		System.out.println(hs);

		System.out.println("Remove element Banana");
		hs.remove("Banana");
		//remove element which is not present
		if (hs.remove("Strawberry"))
		{
			System.out.println("Strawberry removed from set");
		}
		else
			System.out.println("Strawberry not removed from set");

		System.out.println("Element present in set: " + hs.contains("Mango"));

		System.out.println(hs);

	}

}
