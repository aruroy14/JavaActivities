package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {


	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		ArrayList <Integer>list = new ArrayList<Integer>();
		Random indexGen = new Random();

		System.out.println("Enter integer numbers");
		System.out.println("Enter non-integer number to terminate ");
		
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		System.out.println(list);

		Integer nums[] = list.toArray(new Integer[0]);
		int index = indexGen.nextInt(nums.length);
		System.out.println("Index value generated: " + index);
		System.out.println("Value in arary at generated index: " + nums[index]);

		scan.close();

	}

}
