package vorlage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bestellung {
    private int bestellnummer;
    private Date bestelldatum;
    private List<Gericht> gerichte;
    private Kunde kunde;
    private Kellner kellner;
    private double gesamtbetrag;

    // Konstruktor, Getter und Setter
    

    public double getGesamtbetrag() {
    	gesamtbetragBerechnen();
		return gesamtbetrag;
	}

	public int getBestellnummer() {
		return bestellnummer;
	}

	public void setBestellnummer(int bestellnummer) {
		this.bestellnummer = bestellnummer;
	}

	public Date getBestelldatum() {
		return bestelldatum;
	}

	public void setBestelldatum(Date bestelldatum) {
		this.bestelldatum = bestelldatum;
	}

	public List<Gericht> getGerichte() {
		return gerichte;
	}

	public void setGerichte(List<Gericht> gerichte) {
		this.gerichte = gerichte;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public Kellner getKellner() {
		return kellner;
	}

	public void setKellner(Kellner kellner) {
		this.kellner = kellner;
	}

	public void setGesamtbetrag(double gesamtbetrag) {
		
		this.gesamtbetrag = gesamtbetrag;
	}

	public void gerichtHinzufuegen(Gericht gericht) {
		this.gerichte.add(gericht);
    }

	public void gesamtbetragBerechnen() {
	    double summe = 0;
	    for (Gericht gericht : gerichte) {
	        summe = summe + gericht.getPreis();
	    }
	    this.gesamtbetrag = summe;
	}


	public Bestellung(int bestellnummer, Date bestelldatum, Kunde kunde, Kellner kellner) {
		super();
		this.bestellnummer = bestellnummer;
		this.bestelldatum = bestelldatum;
		this.gerichte = new ArrayList<Gericht>();
		this.kunde = kunde;
		this.kellner = kellner;
	}
}