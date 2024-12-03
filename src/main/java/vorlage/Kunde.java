package vorlage;

public class Kunde extends Person{
    private int kundennummer;
	public Kunde(String name, int kundennummer) {
		super();
		this.name = name;
		this.kundennummer = kundennummer;
	}


    // Konstruktor, Getter und Setter
	public int getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}
}