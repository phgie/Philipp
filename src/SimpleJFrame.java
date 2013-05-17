import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


  /**
   * JFrame-Beispiel
   * @author Philipp Giesen
   */
  public class SimpleJFrame extends JFrame implements KeyListener {
  
   /**
    * Erzeugt ein neues Objekt dieser Klasse
    */
   public SimpleJFrame()  {
  
	 /* Panel als Contentpane erzeugen. */
     JPanel panel = new JPanel();
     panel.setLayout(null);
     this.setContentPane(panel);
     
     JTextField textField = new JTextField(20);
     textField.setBounds(200, 400, 100, 30);
     panel.add(textField);
     
     panel.setFocusable(true);
     
     panel.requestFocusInWindow();
     
     
     panel.addKeyListener(this);
     
     /* Irgendwo muessen wir die Buttons referenzieren.. */
     JButton[] buttons = new JButton[5];
     
     for (int i = 0; i < buttons.length; i++) {
    	 
    	 /* Button mit dynamischer Position und fester Groesse erzeugen. */
    	 buttons[i] = new JButton(i + ". Button");
    	 buttons[i].setBounds(i * 110, i * 110, 100, 100);
    	 
    	 panel.add(buttons[i]);
     }

     /* Statische Fenster-Groesse. */
     this.setSize(800, 600);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setVisible(true);
   }
  
  
   /**
    * Start-Methode, Aufruf über
    * java de.dpunkt.swing.simpleapp.SimpleApp
    */
   public static void main(String[] argv) {
     new SimpleJFrame();
   }


@Override
public void keyPressed(KeyEvent arg0) {
	System.out.println("Pressed" + arg0);
	
}


@Override
public void keyReleased(KeyEvent arg0) {
	System.out.println("Released" + arg0);
	
}


@Override
public void keyTyped(KeyEvent arg0) {
	System.out.println("Typed" + arg0);
	
}
  }
