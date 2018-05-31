//p6.java
//David Anderson
//March 4, 2013
//class to test member object

public class p6 {
	
	public static void main(String[] args) {

		//create instance of member class using default constructor
		member Norm = new member();

		//call and use toString method
		System.out.println( Norm.toString() );
		System.out.println();

		//call set method
		Norm.setName("Norman");
		Norm.setCountry("Afghanistan");
		Norm.setFavFood("Spinach");
		
		//call and use toString method
		System.out.println( Norm.toString() );
		System.out.println();
		System.out.println( Norm.getFavFood() );
		System.out.println();
		
		//create instance of member class using alternate constructor
		member Norma = new member("Norma", 1992, 2, 15, true, "Canada", "Pizza");
		member Food = new member("Food", 2013, 3, 4, true, "USA", "Chicken");
		
		System.out.println( Food.toString() );
		System.out.println();
		
		//call set method
		Norma.setName("Norma");
		Food.setName("Not Food");
		Food.setCountry("Canada");
		Food.setFavFood("Hamburger");
		
		//call and use toString method
		System.out.println( Norma.toString() );
		System.out.println();
		System.out.println( Food.toString() );
		System.out.println();
		System.out.println( Food.getFavFood() );
		
	}//main

}//class