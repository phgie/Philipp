package dummydk.controller;

import java.awt.Point;
import java.util.ArrayList;

import dummydk.model.Gegner;
import dummydk.model.Item;
import dummydk.model.Spieler;

/**
 * Repr�sentiert ein Spielfeld, welches die Spielfeld-Objekte enth�lt.
 */
public class Spielfeld {
	
	/** Das eigentliche Spielfeld. Enth�lt Objekte, die auf dem Spielfeld platziert werden k�nnen. */
	private Object[][] spielfeld;
	
	/** Eine Liste aller Gegner auf diesem Spielfeld */
	private ArrayList<Gegner> alleGegner;
	
	/**
	 * F�hrt eine Aktion auf diesem Spielfeld aus.
	 * @param spieler Der Spieler, f�r den die Aktion ist.
	 * @param key Die Taste, die die Aktion initiiert hat.
	 */
	public void aktion(Spieler spieler, int key) {
		
		spieler.getPosition();
	}
	
	/**
	 * Bewegt den �bergebenen Spieler auf diesem Spielfeld in eine bestimmte Richtung.
	 * @param spieler Der Spieler, der bewegt werden soll.
	 * @param key Die Taste, die die Bewegung iniitiert hat (und damit die Richtung, in die bewegt werden soll)
	 */
	public void bewege(Spieler spieler, int key) {
		
	}
	
	/**
	 * Bewegt alle Gegner auf dem Spielfeld in eine beliebige Richtung (falls die Bewegung m�glich ist).
	 */
	public void bewegeAlleGegner() {
		
	}
	
	/**
	 * Setzt den Spieler auf die angegebene Position.
	 * @param spieler Der Spieler, der zu setzen ist.
	 * @param position Die neue Position des Spielers
	 */
	public void setzeSpieler(Spieler spieler, Point position) {
		
		spieler.setPosition(position);
	}
	
	/**
	 * Setzt das Item auf die angegebene Position.
	 * @param gegner Das Item, der zu setzen ist.
	 * @param position Die neue Position des Items.
	 */
	public void setzeItem(Item item, Point position) {
		
		item.setPosition(position);
	}
	
	/**
	 * Setzt den Gegner auf die angegebene Position.
	 * @param gegner Der Gegner, der zu setzen ist.
	 * @param position Die neue Position des Gegner
	 */
	public void setzeGegner(Gegner gegner, Point position) {
		
		gegner.setPosition(position);
	}

}
