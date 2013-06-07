package dummydk;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Frame extends JFrame implements KeyListener {
	
	/**
	 * Erzeugt ein neues Objekt dieser Klasse. Der Aufruf kann nur aus dieser Klasse heraus erfolgen.
	 */
	private Frame() {
		
		/* TODO Fenster erzeugen und Fenstereigenschaften definieren. */		
	}

	/**
	 * Startet das Programm
	 * @param args wird nicht verwendet
	 */
	public static void main(String[] args) {
		
		/* Programm starten */
		new Frame();
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
		
	}

}
