package vorlage;

public abstract class Person {
	public String name;


	public Person(String name) throws Exception {
		if (name.length() < 5){
			throw new Exception("Der Name der Person muss mindestens 5 Zeichen enthalten!");
		}
		else {
			this.name = name;
		}
	}
}