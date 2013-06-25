package dummydk.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.JFrame;

import dummydk.controller.Spiel;
import dummydk.controller.Spielfeld;

/**
 * Repräsentiert ein Swing-Fenster, welches das Programm enthält.
 */
public class Frame extends JFrame implements KeyListener {
	
	private static final int ANZ_LEVEL = 3;
	
	private Spiel spiel;
	
	/**
	 * Erzeugt ein neues Objekt dieser Klasse. Der Aufruf kann nur aus dieser Klasse heraus erfolgen.
	 */
	private Frame() {
		
		/* TODO Fenster erzeugen und Fenstereigenschaften definieren. */
	}
	
	/**
	 * Wird aufgerufen, wenn ein Spiel gestartet wird, beispielsweise durch die Angabe einer Datei.
	 */
	public void starteSpiel(File textDatei) {
		
		/* Die Datei wird dem neuen Spiel übergeben. */
		this.spiel = new Spiel(ANZ_LEVEL, textDatei);
	}

	/**
	 * Startet das Programm
	 * @param args wird nicht verwendet
	 */
	public static void main(String[] args) {
		
		/* Programm starten */
		new Frame();
	}
	
	private void zeichnen(Spielfeld spielfeld) {
		
		
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent arg0) {}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {
		
		/* TODO Tastendruck an das Spielfeld weitergeben. */
		this.spiel.aktion(arg0.getKeyChar());
		
		/* Nach Durchführung der Aktion Spielfeld neu zeichnen. */
		this.zeichnen(spiel.getAktuellesSpielfeld());
	}

}
