package dummydk.controller;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;

import dummydk.model.Gegner;
import dummydk.model.Item;
import dummydk.model.Spieler;

/**
 * Repr�sentiert ein Spiel, welches aus mehreren Spielfeldern bestehen kann. Ein Spiel wird aus einer Datei erzeugt
 * und besteht solange, bis es entweder gewonnen oder verloren wurde.
 */
public class Spiel {
	
	/** Die Anzahl R�ume pro Level. Eleganter w�re es, diese Information direkt aus der Textdatei zu beziehen. 
	 * Aber so geht es auch. */
	private static final int ANZ_RAUM_PRO_LEVEL = 3;
	
	/** Alle Spielfelder f�r das aktuelle Spiel. */
	private Spielfeld[] spielfelder;
	
	/** Zeiger auf das aktuelle Spielfeld, welches gerade bespielt wird. */
	private int aktSpielfeld;
	
	/** Eine Liste aller Spieler, die an diesem Spiel teilnehmen. <Spieler> bedeutet, dass die ArrayList nur 
	 * Werte des Typs Spieler aufnehmen kann (und keine anderen Datentypen). */
	private ArrayList<Spieler> alleSpieler;
	
	/**
	 * Erzeugt ein neues Objekt dieser Klasse
	 * @param anz_level Die Anzahl der Level f�r dieses Spiel. Ein Level besteht aus ANZ_RAUM_PRO_LEVEL R�umen.
	 * @param textDatei Die Textdatei, die die R�ume enth�lt. Diese sollte die richtige Anzahl von R�umen enthalten.
	 */
	public Spiel(int anz_level, File textDatei) {
		
		/* Erzeugt ein Array, welches Spielfelder beinhaltet. Die jeweiligen Spielfelder werden hier NICHT erzeugt. */
		spielfelder = new Spielfeld[anz_level];
		this.erzeugeSpielfelder(textDatei);
		
		alleSpieler = new ArrayList();
	}

	/**
	 * Erzeugt alle Spielfelder auf Basis der eingegebenen Datei.
	 * @param textDatei Die Textdatei, die die R�ume enth�lt. Diese sollte die richtige Anzahl von R�umen enthalten.
	 */
	private void erzeugeSpielfelder(File textDatei) {
		
		/* Hier sollte nat�rlich das Einlesen der TextDatei passieren. ;-) */
		for (int i = 0; i < spielfelder.length; i++) {
			
			spielfelder[i] = new Spielfeld();
			
			/* Je nach gelesenem Wert in der Datei, werden hier Objekte erzeugt und auf das Spielfeld gesetzt. */
			/* Neuen Spieler erzeugen. */
			Spieler neuerSpieler = new Spieler();
			alleSpieler.add(neuerSpieler);
			spielfelder[i].setzeSpieler(neuerSpieler, new Point(0,0));
			
			/* Neues Item erzeugen, TODO: Eigenschaften setzen. */
			spielfelder[i].setzeItem(new Item(), new Point(0,0));
			
			/* Neuen Gegner erzeugen. TODO: Eigenschaften setzen. */
			spielfelder[i].setzeGegner(new Gegner(), new Point(0,0));
			
			/* TODO: Leerfeld oder andere Felder einf�gen. */
		}
	}
	
	/**
	 * F�hrt eine Aktion, die durch einen Tastendruck initiert wurde, auf dem Spiel aus.
	 * @param key Die gedr�ckte Taste
	 */
	public void aktion(int key) {
		
		/* Hier k�nnte man zwischen Tasten unterscheiden, die f�r das SPIEL sind (z.B. zum Beenden oder Neustarten)
		 * und Tasten, die f�r das SPIELFELD sind (z.B. Bewegung).
		 */
		if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT 
				|| key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
			
			/* TODO: F�r jeden Spieler in der Liste aller Spieler (und nicht nur f�r einen)... */
			spielfelder[aktSpielfeld].bewege(alleSpieler.get(0), key);
			
			/* Falls f�r jede Bewegung des Spielers auch noch die Gegner bewegt werden sollen... */
			spielfelder[aktSpielfeld].bewegeAlleGegner();
		}
		
		/* else if (...) */
		/* Genau so k�nnte man hier f�r andere Tasten verfahren. Wird z.B. Leertaste gedr�ckt,
		 * wei� das Spiel, dass das die Taste f�r die Waffe f�r den ersten Spieler ist und 
		 * teilt das dem Spielfeld mit. */
		{
			spielfelder[aktSpielfeld].aktion(alleSpieler.get(0), key);
		}
	}
	
	/**
	 * Gibt das aktuelle Spielfeld zur�ck.
	 * @return Das aktuelle Spielfeld
	 */
	public Spielfeld getAktuellesSpielfeld() {
		
		return spielfelder[aktSpielfeld];
	}

}
