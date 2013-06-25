package dummydk.model;

import java.awt.Point;

public class Gegner {
	
	/** Die Position dieses Gegners in der xy-Ebene. */
	private Point position;
	
	/**
	 * Gibt die aktuelle Position dieses Gegners zurück.
	 * @return Die aktuelle Position des Gegners.
	 */
	public Point getPosition() {
		
		return position;
	}
	
	/**
	 * Setzt die aktuelle Position des Gegners.
	 * @param position Die neue Position des Gegners.
	 */
	public void setPosition(Point position) {
		
		this.position = position;
	}

}
