//java program to show owner name and its property(appartments).
package testArray.pll;

import testArray.bll.ApartmentOwner;

public class TestAppartmentOwner {

	public static void main(String[] args) {
		ApartmentOwner ap = new ApartmentOwner("Indrajeet enterprise ");
		System.out.println("***********************************");
		ap.setApartment("Indrapalace, 22", 0);
		ap.setApartment("Shahrapalace, 14 ", 1);
		ap.setApartment("rajbhawan , 10", 2);
		ap.setApartment("heavenpalace, 66", 5);
		ap.setApartment("groundpalace, 25", 8);
		
		System.out.println(ap);
		System.out.println();
		System.out.println("***********************************");
		System.out.println(ap.getOwner() + " has " +ap.countApartments() + " apartments");
		System.out.println("Apartment 2: " + ap.getApartment(2));
		System.out.println();
		System.out.println("***********************************");
		ap.reorganizeApartments();
		System.out.println(ap);
		System.out.println("***********************************");
	}

}
