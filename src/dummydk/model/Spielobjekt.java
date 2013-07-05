package dummydk.model;

import java.awt.Image;

/**
 * Ein Spielobjekt auf dem Spielfeld. Jedes Spielobjekt besitzt ein Bild.
 */
public abstract class Spielobjekt {

	/** Anzeige-Bild des Items */
	private Image icon;

	/**
	 * Gibt das Anzeige-Bild des Items zurueck.
	 * 
	 * @return Das Anzeige-Bild. Jedes Item muss ein entsprechendes Icon
	 *         besitzen.
	 */
	public Image getIcon() {

		return icon;
	}

}
