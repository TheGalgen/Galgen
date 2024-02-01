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
  //private String[] wordList = {"Datentyp", "Objekt", "Funktion", "Datenbank", "Klasse", "Array"};
  private int i = 1;
  private StringBuilder ratewort;
  private JButton bRaten = new JButton();
  private JButton bWortfestlegen = new JButton();
  private JTextField tfLoesung = new JTextField();
  private JTextField tfRaten = new JTextField();
  private JLabel l3balken = new JLabel();
  private ImageIcon l3balkenIcon = new ImageIcon(getClass().getResource("images/3_Balken.png"));
  private JLabel l4quer = new JLabel();
  private ImageIcon l4querIcon = new ImageIcon(getClass().getResource("images/4_Quer.png"));
  private JLabel l5strick = new JLabel();
  private ImageIcon l5strickIcon = new ImageIcon(getClass().getResource("images/5_Strick.png"));
  private JLabel l6kopf1 = new JLabel();
  private ImageIcon l6kopf1Icon = new ImageIcon(getClass().getResource("images/6_Kopf.png"));
  private JLabel l7body = new JLabel();
  private ImageIcon l7bodyIcon = new ImageIcon(getClass().getResource("images/7_Body.png"));
  private JLabel l9beine = new JLabel();
  private ImageIcon l9beineIcon = new ImageIcon(getClass().getResource("images/9_Beine.png"));
  private JLabel l8arme = new JLabel();
  private ImageIcon l8armeIcon = new ImageIcon(getClass().getResource("images/8_Arme.png"));
  private JLabel l1huegel = new JLabel();
  private ImageIcon l1huegelIcon = new ImageIcon(getClass().getResource("images/1_Huegel.png"));
  private JLabel l2mast = new JLabel();
  private ImageIcon l2mastIcon = new ImageIcon(getClass().getResource("images/2_Mast.png"));
  private JTextField tfstriche = new JTextField();
  private JTextField jTextField1 = new JTextField();
  private JLabel lGalgenmaennchen = new JLabel();
  // Ende Attribute
  
  public GalgenJFrame() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 830; 
    int frameHeight = 555;
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
    lGalgenmaennchen.setBounds(352, 24, 103, 24);
    lGalgenmaennchen.setText("Galgenmännchen");
    lGalgenmaennchen.setBackground(Color.RED);
    lGalgenmaennchen.setOpaque(true);
    cp.add(lGalgenmaennchen);
    jTextField1.setBounds(48, 360, 248, 144);
    cp.add(jTextField1);
    tfstriche.setBounds(48, 304, 248, 24);
    cp.add(tfstriche);
    l2mast.setBounds(512, 152, 8, 232);
    l2mast.setText("2 mast");
    l2mast.setIcon(l2mastIcon);
    cp.add(l2mast);
    l1huegel.setBounds(400, 384, 232, 120);
    l1huegel.setText("1 huegel");
    l1huegel.setIcon(l1huegelIcon);
    cp.add(l1huegel);
    l7body.setBounds(704, 272, 8, 88);
    l7body.setText("7 body");
    l7body.setToolTipText("");
    l7body.setIcon(l7bodyIcon);
    cp.add(l7body);
    tfRaten.setBounds(216, 144, 80, 24);
    cp.add(tfRaten);
    tfLoesung.setBounds(216, 200, 80, 24);
    cp.add(tfLoesung);
    bWortfestlegen.setBounds(8, 200, 192, 24);
    bWortfestlegen.setText("Wort festlegen");
    bWortfestlegen.setMargin(new Insets(2, 2, 2, 2));
    bWortfestlegen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWortfestlegen_ActionPerformed(evt);
      }
    });
    cp.add(bWortfestlegen);
    bRaten.setBounds(8, 144, 80, 24);
    bRaten.setText("Raten");
    bRaten.setMargin(new Insets(2, 2, 2, 2));
    bRaten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bRaten_ActionPerformed(evt);
      }
    });
    cp.add(bRaten);
    
    cp.setBackground(Color.WHITE);
    l3balken.setBounds(512, 144, 200, 8);
    l3balken.setText("3 balken");
    l3balken.setIcon(l3balkenIcon);
    cp.add(l3balken);
    l4quer.setBounds(520, 144, 56, 72);
    l4quer.setText("4 quer");
    l4quer.setIcon(l4querIcon);
    cp.add(l4quer);
    l5strick.setBounds(704, 152, 8, 80);
    l5strick.setText("5 strick");
    l5strick.setIcon(l5strickIcon);
    cp.add(l5strick);
    l6kopf1.setBounds(685, 229, 48, 48);
    l6kopf1.setText("6 kopf");
    l6kopf1.setIcon(l6kopf1Icon);
    cp.add(l6kopf1);
    l8arme.setBounds(646, 280, 128, 24);
    l8arme.setText("8 arme");
    l8arme.setIcon(l8armeIcon);
    cp.add(l8arme);
    l9beine.setBounds(672, 352, 72, 88);
    l9beine.setText("9 beine");
    l9beine.setIcon(l9beineIcon);
    cp.add(l9beine);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GalgenJFrame
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GalgenJFrame();
  } // end of main
  
  public void bRaten_ActionPerformed(ActionEvent evt) 
  {
    System.out.println("Test");
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
          ratewort.setCharAt(i, buchstabe.charAt(0)); 
          tfstriche.setText(ratewort.toString());
          if (tfLoesung.getText()==tfstriche.getText()) 
          {
            System.out.println("Sie haben gewonnen!");
          }  
        }
      }
      
    }
      else if (word.indexOf(buchstabe)<0)
      {
        
        
        if (i >= 1) 
        {
          l1huegel.setVisible(true);
        }
        if (i >= 2) 
        {
          l2mast.setVisible(true);
        }
        if (i >= 3) 
        {
          l3balken.setVisible(true);
        } 
        if (i >= 4) 
        {
          l4quer.setVisible(true);
        } 
        if (i >= 5) 
        {
          l5strick.setVisible(true);
        } 
        if (i >= 6) 
        {
          l6kopf1.setVisible(true); 
        }
        if (i >= 7) 
        {
          l7body.setVisible(true); 
        }
        if (i >= 8) 
        {
          l8arme.setVisible(true); 
        }
        if (i >=9) 
        {
          l9beine.setVisible(true);
          System.out.println("Du hast verloren! Liesz ma du denn Duden"); 
        }
        i = i+1;
      }
    
    
    // end of if  
  }
      
  public void bWortfestlegen_ActionPerformed(ActionEvent evt) 
  {                                  
    System.out.println("ksdkdkdkdkdk");
    
    String word = new String();
    word = tfLoesung.getText();
    word = word.toLowerCase();
    
    tfLoesung.setVisible (false);
    
    //word = tfLoesung.getText();
    //int felderzahl = word.length();
    
    //Random random = new Random();
    //int randomint = random.nextInt(7);
    //word = wordList[randomint];
    
    tfLoesung.setText(word);
    
    ratewort = new StringBuilder("_".repeat(word.length()));
    
    l1huegel.setVisible(false); 
    l2mast.setVisible(false);
    l3balken.setVisible(false);
    l4quer.setVisible(false);
    l5strick.setVisible(false);
    l6kopf1.setVisible(false);
    l7body.setVisible(false);
    l8arme.setVisible(false);
    l9beine.setVisible(false);
    
    tfstriche.setText(ratewort.toString());
    
    
  } // end of bWortfestlegen_ActionPerformed
      
      // Ende Methoden
} // end of class GalgenJFrame
    