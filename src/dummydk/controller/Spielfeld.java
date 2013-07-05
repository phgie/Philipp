package dummydk.controller;

import dummydk.model.Gegner;
import dummydk.model.Spieler;
import dummydk.model.Spielobjekt;

import java.awt.Point;
import java.util.ArrayList;

/**
 * Repraesentiert ein Spielfeld, welches die Spielfeld-Objekte enthaelt.
 */
public class Spielfeld {

	/**
	 * Das eigentliche Spielfeld. Enthaelt Objekte, die auf dem Spielfeld
	 * platziert werden koennen.
	 */
	private Spielobjekt[][] spielfeld;

	/** Eine Liste aller Gegner auf diesem Spielfeld */
	private ArrayList<Gegner> alleGegner;

	/** Dimensionen des Spielfelds. */
	private int spielfeldBreite;
	private int spielfeldHoehe;

	/**
	 * Erzeugt ein neues Objekt dieser Klasse.
	 * 
	 * @param hoehe
	 *            Die Hoehe des Spielfelds. Anzahl der Zeilen.
	 * @param breite
	 *            Die Breite des Spielfelds. Anzahl der Spalten.
	 */
	public Spielfeld(int hoehe, int breite) {

		this.spielfeldBreite = breite;
		this.spielfeldHoehe = hoehe;
		this.spielfeld = new Spielobjekt[hoehe][breite];
	}

	/**
	 * Gibt die Breite dieses Spielfelds zurueck.
	 * 
	 * @return Die Breite dieses Spielfelds.
	 */
	public int gibBreite() {

		return this.spielfeldBreite;
	}

	/**
	 * Gibt die Hoehe dieses Spielfelds zurueck.
	 * 
	 * @return Die Hoehe dieses Spielfelds.
	 */
	public int gibHoehe() {

		return this.spielfeldHoehe;
	}

	/**
	 * Fuehrt eine Aktion auf diesem Spielfeld aus.
	 * 
	 * @param spieler
	 *            Der Spieler, fuer den die Aktion ist.
	 * @param key
	 *            Die Taste, die die Aktion initiiert hat.
	 */
	public void aktion(Spieler spieler, int key) {

		spieler.getPosition();
	}

	/**
	 * Bewegt den uebergebenen Spieler auf diesem Spielfeld in eine bestimmte
	 * Richtung.
	 * 
	 * @param spieler
	 *            Der Spieler, der bewegt werden soll.
	 * @param key
	 *            Die Taste, die die Bewegung iniitiert hat (und damit die
	 *            Richtung, in die bewegt werden soll)
	 */
	public void bewege(Spieler spieler, int key) {

		/* TODO: Pruefen, ob das Feld, auf das bewegt werden soll frei ist. */
		/* Anschliessend kann die Bewegung erfolgen. */

		Point neuePosition = new Point();
		this.setzeObjektAnPos(spieler, neuePosition);
	}

	/**
	 * Bewegt alle Gegner auf dem Spielfeld in eine beliebige Richtung (falls
	 * die Bewegung moeglich ist).
	 */
	public void bewegeAlleGegner() {

		for (int i = 0; i < this.alleGegner.size(); i++) {

			/* Gegner bewegen. */
		}
	}

	/**
	 * Gibt das Spielobjekt zurueck, welches an der uebergebenen Position steht.
	 * 
	 * @param position
	 *            Die Position des gewuenschten Spielobjekts
	 * @return Das Spielobjekt welches an der Position steht.
	 */
	public Spielobjekt gibSpielobjekt(Point position) {

		return this.spielfeld[position.x][position.y];
	}

	/**
	 * Setzt das Objekt auf die angegebene Position.
	 * 
	 * @param objekt
	 *            Das Objekt, das zu setzen ist.
	 * @param position
	 *            Die neue Position des Objekts
	 */
	public void setzeObjektAnPos(Spielobjekt objekt, Point position) {

		this.spielfeld[position.x][position.y] = objekt;
	}
}
