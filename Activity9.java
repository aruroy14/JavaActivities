package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		
		ArrayList <String> myList = new ArrayList<String>();
		myList.add("John");
		myList.add("Jacob");
		myList.add("Jenny");
		myList.add("Mary");
		myList.add("Lily");
		
		//Print all the names
		for(String str:myList)
		{
			System.out.println(str);
		}
		
		//Print third name from the list
	System.out.println("This name in the list is : "+ myList.get(2));
	
	//Check if a name is present in the list
	if (myList.contains("Mary"))
		System.out.println("Name is present in the arraylist");
	else
		System.out.println("Name is not present in arraylist");
	
	//Print the number of names in the ArrayList
	System.out.println("Number of names in the ArrayList= "+myList.size());
	
	//number of names in the ArrayList again
	
	System.out.println("Removing " + myList.get(1)+" from the list");
	myList.remove(1);
	System.out.println("New list:");
	for (String str:myList)
	{
		System.out.println(str);
	}
	
	//Re-add the removed name
	
	myList.add(1, "Jacob");
	
	
	}
}
