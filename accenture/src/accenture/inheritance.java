package accenture;

class student{
	 static int stdid = 1;
	 static String name = "praveen kattimani";
	 static String usn = "1MJ20EC095";
}

class address extends student{
	static String vlg = "At post Mavanur";
	static String tq = "Hukkeri";
	static String dist = "Belagavi";
	static int pin = 591122;
}
class inheritance extends address {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("name    : "+stdid + ") " + name);
		System.out.println("USN     : " + usn );
		System.out.println("address : "+ vlg+",\n          "+tq+",\n          "+dist+",\n          "+pin);

	}

}
