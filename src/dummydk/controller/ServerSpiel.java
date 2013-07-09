package dummydk.controller;

import java.io.File;

import dummydk.gui.Frame;

/**
 * Erstellt ein neues Spiel mit einem Server, der auf das Verbinden eines Clients wartet..
 * Die Klasse ist von Spiel abgeleitet, da das grundsätzliche Verhalten eines Spiels weiter benutzt wird.
 * Ein ServerSpiel entspricht einem normalen Spiel, solange kein zusätzliche Client verbunden ist.
 */
public class ServerSpiel extends Spiel {

	/*
	 * (non-Javadoc)
	 * 
	 * @see dummydk.controller.Spiel#Spiel(dummydk.gui.Frame, int, java.io.File)
	 */
	public ServerSpiel(Frame frame, int anzLevel, File textDatei) {
		/* Spielaufbau, wie bei einem normalen Spiel.. */
		super(frame, anzLevel, textDatei);
		
		/* TODO: Zusaetzlich Server-Kram initialisieren.. */
	}
}
