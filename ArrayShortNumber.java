//<----java program to short numbers----->
package testArray.bll;

import java.util.Scanner;

public class ArrayShortNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		

		int nums[] = new int[5];
			
		System.out.println("***********************************");
		System.out.println("Enter " + nums.length + " values: ");
		System.out.println("***********************************");
		for(int i=0; i<nums.length; i++) 
			nums[i] = sc.nextInt();
		System.out.println("***********************************");
		System.out.println("Values before sorting: ");
		System.out.println("***********************************");
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
//sorting array elements in Ascending order.
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("***********************************");
		System.out.println("Values after sorting in ascending order:");
		System.out.println("***********************************");
		for(int i=0; i<nums.length; i++)
			System.out.println(nums[i]);
		
//sorting array elements in descending order.
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("***********************************");
		System.out.println("Values after sorting in descending order:");
		System.out.println("***********************************");
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		sc.close();
		System.out.println("***********************************");
	}

}
