package dummydk.model;

import java.awt.Point;

import javax.swing.ImageIcon;

/**
 * Repräsentiert ein Spieler-Objekt auf dem Spielfeld.
 */
public class Spieler {
	
	private ImageIcon icon;
	
	/** Die Position dieses Spielers in der xy-Ebene. */
	private Point position;
	
	/**
	 * Gibt die aktuelle Position dieses Spielers zurück.
	 * @return Die aktuelle Position des Spielers.
	 */
	public Point getPosition() {
		
		return position;
	}
	
	/**
	 * Setzt die aktuelle Position des Spielers.
	 * @param position Die neue Position des Spielers.
	 */
	public void setPosition(Point position) {
		
		this.position = position;
	}

}
