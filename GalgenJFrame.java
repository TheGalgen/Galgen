import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.01.2024
 * @author 
 */

public class GalgenJFrame extends JFrame {
  // Anfang Attribute
  private String[] wordList = {"Datentyp", "Objekt", "Funktion", "Datenbank", "Klasse", "Array"};
  private StringBuilder ratewort;
  private JButton bRaten = new JButton();
  private JButton bWortfestlegen = new JButton();
  private JTextField tfLoesung = new JTextField();
  private JTextField tfRaten = new JTextField();
  // Ende Attribute
  
  public GalgenJFrame() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 528; 
    int frameHeight = 564;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GalgenJFrame");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    tfRaten.setBounds(304, 144, 80, 24);
    cp.add(tfRaten);
    tfLoesung.setBounds(304, 200, 80, 24);
    cp.add(tfLoesung);
    bWortfestlegen.setBounds(72, 200, 192, 24);
    bWortfestlegen.setText("Wort festlegen");
    bWortfestlegen.setMargin(new Insets(2, 2, 2, 2));
    bWortfestlegen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWortfestlegen_ActionPerformed(evt);
      }
    });
    cp.add(bWortfestlegen);
    bRaten.setBounds(72, 144, 80, 24);
    bRaten.setText("Raten");
    bRaten.setMargin(new Insets(2, 2, 2, 2));
    bRaten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bRaten_ActionPerformed(evt);
      }
    });
    cp.add(bRaten);
    
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GalgenJFrame
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GalgenJFrame();
  } // end of main
  
  public void bRaten_ActionPerformed(ActionEvent evt) 
  {
    String word = new String();
    word = tfLoesung.getText();
    /*String zwischenwert = new String();
    zwischenwert = tfRaten.getText();
    char buchstabe = zwischenwert.charAt(0); */
    String  buchstabe = new String();
    buchstabe = tfRaten.getText();
    if (word.indexOf(buchstabe)>=0)
    {
      for (int i = 0; i < word.length(); i++) 
      {
        if (word.charAt(i) == buchstabe.charAt(0)) 
        {
          
        } 
      }
    }                                                                        
  } 

  public void bWortfestlegen_ActionPerformed(ActionEvent evt) 
  {
    tfLoesung.setVisible (false);
    
    
    String word = new String();
    
    //word = tfLoesung.getText();
    //int felderzahl = word.length();
    
    Random random = new Random();
    int randomint = random.nextInt(7);
    word = wordList[randomint];
    
    tfLoesung.setText(word);
    
    ratewort = new StringBuilder("_".repeat(word.length()));
  } // end of bWortfestlegen_ActionPerformed

  // Ende Methoden
} // end of class GalgenJFrame
