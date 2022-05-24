package testingchrome;

public class Person {
	private String  name;
	private String  lastName;
	public Person(String name, String lastName) {
		name = this.name;
		lastName = this.lastName;
	}
	
	public void Salute() {
		System.out.println("Hola "+this.name+" "+this.lastName);
	}
	

}
