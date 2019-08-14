package studentdemo;

public class Main {

	public static void main(String[] args) {
		Student s = new Student(); //Erzeugung eines Objektes ueber new Student()
		s.firstName = "Chris";
		s.name = "Gadekk";
		s.stNr = 123456;
		s.adress = new Adress(); //adress ist ein Objekt vom Typ Adress
		s.adress.street = "Hochschulstraße 1";
		s.adress.city = "Rosenheim";
		
		s.sayHello();
		s.sayName();
	
	}

}
