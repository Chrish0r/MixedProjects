package studentdemo;

public class Student {
	
		// Attribute
		String name;
		String firstName;
		int stNr;
		Adress adress; // hier 'Adress' als ~DT, da Klasse und adress ist Attibut (~Variablenname)
		
		// Methoden
		void sayHello() {
			System.out.println("Hello!");
		}
		void sayName() {
			System.out.println("My name is " + firstName + " " + name);
		
	}

}
