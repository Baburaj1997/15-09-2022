//<----java program to short Strings----->
package testArray.bll;

import java.util.Scanner;

public class ArrayShortString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		String name[] = new String[5];
	
		System.out.println("Enter " + name.length + " names : ");
		System.out.println("***********************************");
	
		for(int i=0; i<name.length; i++) {
			name[i] = sc.nextLine();
		}
		System.out.println("***********************************");
		System.out.println("Values before sorting: ");
		System.out.println("***********************************");
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
//shorting String in ascending order Alphabet.
		for(int i=0; i<name.length; i++) {
			for(int j=i+1; j<name.length; j++) {
				//using String.compareTo()
					if(name[i].compareTo(name[j])>0) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;}
			}
		
		}
		System.out.println("***********************************");
		System.out.println("Values after sorting in ascending order:");
		System.out.println("***********************************");
		
		for(int i=0; i<name.length; i++) {
		System.out.println(name[i]);
		}
//shorting String in descending order Alphabet.
		System.out.println("***********************************");
		
		for(int i=0; i<name.length; i++) {
				for(int j=i+1; j<name.length; j++) {
					if(name[i].compareTo(name[j])<0) {
						String temp = name[i];
						name[i] = name[j];
						name[j] = temp;
					}
				}
		}
		System.out.println("***********************************");
		System.out.println("Values after sorting in descending order:");
		System.out.println("***********************************");
	
		for(int i=0; i<name.length; i++)
				System.out.println(name[i]);
		
	
	sc.close();
	
	}
}
