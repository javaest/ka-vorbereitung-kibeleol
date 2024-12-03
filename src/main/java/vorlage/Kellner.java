package vorlage;

public class Kellner extends Person {
    private int mitarbeiterID;
	public Kellner(String name, int mitarbeiterID) {
		super();
		this.name = name;
		this.mitarbeiterID = mitarbeiterID;
	}


    // Konstruktor, Getter und Setter
	public int getMitarbeiterID() {
		return mitarbeiterID;
	}
	public void setMitarbeiterID(int mitarbeiterID) {
		this.mitarbeiterID = mitarbeiterID;
	}


	public Object getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
		
	}
}