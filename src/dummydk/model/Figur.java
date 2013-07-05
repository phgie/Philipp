package dummydk.model;

import java.awt.Point;

/**
 * Eine Figur auf dem Spielfeld, die sich bewegen kann.
 */
public class Figur extends Spielobjekt {

	/** Die Position dieser Figur in der xy-Ebene. */
	private Point position;

	/**
	 * Gibt die aktuelle Position dieser Figur zurück.
	 * 
	 * @return Die aktuelle Position der Figur.
	 */
	public Point getPosition() {

		return position;
	}

	/**
	 * Setzt die aktuelle Position dieser Figur.
	 * 
	 * @param neuePosition
	 *            Die neue Position der Figur.
	 */
	public void setPosition(Point neuePosition) {

		this.position = neuePosition;
	}
}
