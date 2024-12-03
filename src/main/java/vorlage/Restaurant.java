package vorlage;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Gericht> speisekarte;
    private List<Bestellung> bestellungen;
    
    // Konstruktor
    public Restaurant() {
        this.speisekarte = new ArrayList<>();
        this.bestellungen = new ArrayList<>();
    }

    // Methoden zur Verwaltung von Gerichten und Bestellungen
    public void bestellungAufnehmen(Bestellung bestellung) {
        this.bestellungen.add(bestellung);
    }

    public void bestellungEntfernen(Bestellung bestellung) {
        this.bestellungen.remove(bestellung);
    }
    
    public void gerichtHinzufuegen(Gericht gericht) {
        this.speisekarte.add(gericht);
    }

	public List<Gericht> getSpeisekarte() {
		return speisekarte;
	}

	public void setSpeisekarte(List<Gericht> speisekarte) {
		this.speisekarte = speisekarte;
	}

	public List<Bestellung> getBestellungen() {
		return bestellungen;
	}

	public void setBestellungen(List<Bestellung> bestellungen) {
		this.bestellungen = bestellungen;
	}
    
    
}