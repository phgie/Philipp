package dummydk.gui;

import dummydk.controller.Spiel;
import dummydk.controller.Spielfeld;
import dummydk.model.Spielobjekt;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Repraesentiert ein Swing-Fenster, welches das Programm enthaelt.
 */
public class Frame extends JFrame implements KeyListener {

	/** Wieviele Level soll jedes Spiel haben? */
	private static final int ANZ_LEVEL = 3;

	/** Speichert das Spiel, welches in diesem Frame gespielt wird. */
	private Spiel spiel;

	/**
	 * Erzeugt ein neues Objekt dieser Klasse. Der Aufruf kann nur aus dieser
	 * Klasse heraus erfolgen.
	 */
	private Frame() {

		/* TODO Fenster erzeugen und Fenstereigenschaften definieren. */
	}

	/**
	 * Wird aufgerufen, wenn ein Spiel gestartet wird, beispielsweise durch die
	 * Angabe einer Datei.
	 * 
	 * @param textDatei
	 *            Die Textdatei, die die Spielfelder beinhaltet.
	 */
	public void starteSpiel(File textDatei) {

		/* Die Datei wird dem neuen Spiel uebergeben. */
		this.spiel = new Spiel(this, ANZ_LEVEL, textDatei);
	}

	/**
	 * Startet das Programm
	 * 
	 * @param args
	 *            wird nicht verwendet
	 */
	public static void main(String[] args) {

		/* Programm starten */
		new Frame();
	}

	/**
	 * Zeichnet das Spielfeld, welches uebergeben wird.
	 * 
	 * @param spielfeld
	 *            Das zu zeichnende Spielfeld.
	 */
	private void zeichnen(Spielfeld spielfeld) {

		for (int i = 0; i < spielfeld.gibBreite(); i++) {

			for (int j = 0; j < spielfeld.gibHoehe(); j++) {

				Spielobjekt obj = spielfeld.gibSpielobjekt(new java.awt.Point(
						i, j));

				/* TODO: Richtig positionieren. */
				StdDraw.picture(i * 0, j * 0, obj.getIcon());
			}
		}
	}

	/**
	 * Zeigt eine Fehlermeldung auf diesem Fenster an.
	 * 
	 * @param titel
	 *            Der Titel der Fehlermeldung
	 * @param fehler
	 *            Die eigentliche Fehlermeldung
	 */
	public void zeigeFehler(String titel, String fehler) {

		JOptionPane.showMessageDialog(this, fehler, titel, ERROR);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {

		/* TODO Tastendruck an das Spielfeld weitergeben. */
		this.spiel.aktion(arg0.getKeyChar());

		/* Nach Durchfuehrung der Aktion Spielfeld neu zeichnen. */
		this.zeichnen(spiel.getAktuellesSpielfeld());
	}

}
