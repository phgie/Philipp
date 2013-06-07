package dummydk;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Frame extends JFrame implements KeyListener {
	
	/**
	 * Erzeugt ein neues Objekt dieser Klasse. Der Aufruf kann nur aus dieser Klasse heraus erfolgen.
	 */
	private Frame() {
		
		/* Fenster erzeugen und Fenstereigenschaften definieren. */		
	}

	/**
	 * Surpresses eclipse warning
	 */
	private static final long serialVersionUID = 8830642345790496618L;

	/**
	 * Startet das Programm
	 * @param args wird nicht verwendet
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
