package dummydk.model;

import java.awt.Point;

import javax.swing.ImageIcon;

/**
 * Repräsentiert ein Item-Objekt, welches auf dem Spielfeld abgelegt wird.
 */
public class Item {
	
	private ImageIcon icon;
	
	/** Die Position dieses Items in der xy-Ebene. */
	private Point position;
	
	/**
	 * Gibt die aktuelle Position dieses Items zurück.
	 * @return Die aktuelle Position des Items.
	 */
	public Point getPosition() {
		
		return position;
	}
	
	/**
	 * Setzt die aktuelle Position des Items.
	 * @param position Die neue Position des Items.
	 */
	public void setPosition(Point position) {
		
		this.position = position;
	}

}
