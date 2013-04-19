package com.shumz.think.extwo;

public class ExTwo06 {

	public static void main(String[] args) {

		Dogz dog1 = new Dogz();
		Dogz dog2 = new Dogz();

		dog1.name = "spot";
		dog1.says = "Ruff!";

		dog2.name = "scruffy";
		dog2.says = "Wurf!";

		System.out.println(dog1.name + " says: " + dog1.says);
		System.out.println(dog2.name + " says: " + dog2.says);

		
		Dogz pit = dog1;
		Dogz mell = new Dogz();
		
		mell = dog1;
		
		Dogz zac = new Dogz();
		zac.name = "Zac";
		zac.says = "Fuck yeah!..";
				
		Dogz lee = new Dogz();
		lee.name = "Zac";
		lee.says = "Fuck yeah!..";
		
		System.out.println();
		System.out.println();
		System.out.println(pit.equals(dog1));
		System.out.println(pit == dog1);
	
		System.out.println();
		System.out.println();
		System.out.println(mell.equals(dog1));
		System.out.println(mell == dog1);
	
		System.out.println();
		System.out.println();
		System.out.println(mell.name + " says: " + mell.says);
		System.out.println(dog2.name + " says: " + dog2.says);


		System.out.println();
		System.out.println();
		System.out.println("'zac.equals(lee)' is: " + (zac.equals(lee)));
		System.out.println("'zac == lee' is: " + (zac == lee));

		
	}

}

class Dogz {
	String name;
	String says;
}