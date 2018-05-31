//p7.java
//david anderson
//spring 2013
//test program for OOP hierarchy

public class p7 {

	public static void main(String[] args) {
		
		//creating player using default constructor
		athlete jordan = new athlete();
		jordan.setName("Michael Jordan");
		jordan.setPosition("Shooting Guard");
		jordan.setSport("Basketball");
		jordan.setJerseyNum(23);
		System.out.println( jordan.toString() );
		System.out.println( jordan );
		
		//creating player using alternate constructor
		team tempTeam = new team("Chicago Bears");
		athlete payton = new athlete("Walter Payton", "Football", tempTeam, 34, "Running Back");
		System.out.println( payton.toString() );
		
		
		//setting team
		payton.mainTeam.setTeam("Chicago Beards");		
		System.out.printf("%s, %s\n", payton.getName(), payton.mainTeam.toString() );
		System.out.println();
		
		//creating coach using alternate constructor
		coach jackson = new coach("Phil Jackson", "Basketball", new team("L.A. Lakers"), "Head coach");
		
		//create an array of persons
		player a[] = new player[4];
		a[0] = jordan;
		a[1] = payton;
		a[2] = jackson;
		a[3] = new athlete("Reggie Miller", "Basketball", new team("Indiana Pacers"), 31, "Shooting Guard");
		for (int x=0; x<a.length; x++)
			System.out.println( a[x].toString() );	
		
		
	}//main
	
}//class
