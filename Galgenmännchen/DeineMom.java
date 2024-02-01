/*import java.util.Scanner;

public class DeineMom {

  private static String[] words = {"terminator", "banana", "computer", "cow", "rain", "water" };
  private static String word = words[(int) (Math.random() * words.length)];
  private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
  private static int count = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (count < 7 && asterisk.contains("*")) {
      System.out.println("Guess any letter in the word");
      System.out.println(asterisk);
      String guess = sc.next();
      hang(guess);
    }
    sc.close();
  }

  public static void hang(String guess) {
    String newasterisk = "";
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == guess.charAt(0)) {
        newasterisk += guess.charAt(0);
      } else if (asterisk.charAt(i) != '*') {
        newasterisk += word.charAt(i);
      } else {
        newasterisk += "*";
      }
    }

    if (asterisk.equals(newasterisk)) {
      count++;
      hangmanImage();
    } else {
      asterisk = newasterisk;
    }
    if (asterisk.equals(word)) {
      System.out.println("Correct! You win! The word was " + word);
    }
  }

  public static void hangmanImage() {
    if (count == 1) {
      System.out.println("Wrong guess, try again");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("___|___");
      System.out.println();
    }
    if (count == 2) {
      System.out.println("Wrong guess, try again");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("___|___");
    }
    if (count == 3) {
      System.out.println("Wrong guess, try again");
      System.out.println("   ____________");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   | ");
      System.out.println("___|___");
    }
    if (count == 4) {
      System.out.println("Wrong guess, try again");
      System.out.println("   ____________");
      System.out.println("   |          _|_");
      System.out.println("   |         /   \\");
      System.out.println("   |        |     |");
      System.out.println("   |         \\_ _/");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("___|___");
    }
    if (count == 5) {
      System.out.println("Wrong guess, try again");
      System.out.println("   ____________");
      System.out.println("   |          _|_");
      System.out.println("   |         /   \\");
      System.out.println("   |        |     |");
      System.out.println("   |         \\_ _/");
      System.out.println("   |           |");
      System.out.println("   |           |");
      System.out.println("   |");
      System.out.println("___|___");
    }
    if (count == 6) {
      System.out.println("Wrong guess, try again");
      System.out.println("   ____________");
      System.out.println("   |          _|_");
      System.out.println("   |         /   \\");
      System.out.println("   |        |     |");
      System.out.println("   |         \\_ _/");
      System.out.println("   |           |");
      System.out.println("   |           |");
      System.out.println("   |          / \\ ");
      System.out.println("___|___      /   \\");
    }
    if (count == 7) {
      System.out.println("GAME OVER!");
      System.out.println("   ____________");
      System.out.println("   |          _|_");
      System.out.println("   |         /   \\");
      System.out.println("   |        |     |");
      System.out.println("   |         \\_ _/");
      System.out.println("   |          _|_");
      System.out.println("   |         / | \\");
      System.out.println("   |          / \\ ");
      System.out.println("___|___      /   \\");
      System.out.println("GAME OVER! The word was " + word);
    }
  }
}

import java.util.Scanner;

public class Galgenmaennchen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretWord = "programmieren"; // Geheimes Wort
        char[] guessedLetters = new char[secretWord.length()]; // Array zum Speichern der geratenen Buchstaben
        int attempts = 0; // Versuche

        // Initialisiere guessedLetters mit Unterstrichen
        for (int i = 0; i < secretWord.length(); i++) {
            guessedLetters[i] = '_';
        }

        while (true) {
            // Anzeigen des aktuellen Spielstands
            System.out.println("Aktueller Spielstand: " + String.valueOf(guessedLetters));
            System.out.println("Versuche: " + attempts);

            // Benutzereingabe
            System.out.print("Raten Sie einen Buchstaben: ");
            char guess = scanner.next().charAt(0);

            // Überprüfen, ob der Buchstabe im geheimen Wort vorkommt
            boolean correctGuess = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    guessedLetters[i] = guess;
                    correctGuess = true;
                }
            }

            // Wenn der Buchstabe nicht im geheimen Wort vorkommt, inkrementiere die Versuche
            if (!correctGuess) {
                attempts++;
            }

            // Überprüfen auf Gewinn oder Verlust
            if (String.valueOf(guessedLetters).equals(secretWord)) {
                System.out.println("Herzlichen Glückwunsch! Sie haben das Wort erraten: " + secretWord);
                break;
            } else if (attempts == 6) {
                System.out.println("Leider verloren. Das geheime Wort war: " + secretWord);
                break;
            }
        }

        // Schließe den Scanner
        scanner.close();
    }
}
*/
/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HangmanGame extends JFrame {
    private String[] wordList = {"hangman", "java", "programming", "computer", "keyboard", "developer"};
    private String currentWord;
    private StringBuilder guessedWord;
    private int attemptsLeft;

    private JLabel wordLabel;
    private JLabel attemptsLabel;
    private JTextField letterTextField;

    public DeineMom() {
        setTitle("Hangman Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initializeGame();

        wordLabel = new JLabel(displayWord());
        wordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        add(wordLabel, BorderLayout.CENTER);

        attemptsLabel = new JLabel("Attempts left: " + attemptsLeft);
        add(attemptsLabel, BorderLayout.SOUTH);

        letterTextField = new JTextField(1);
        letterTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processGuess(letterTextField.getText());
                letterTextField.setText("");
            }
        });
        add(letterTextField, BorderLayout.NORTH);

        setVisible(true);
    }

    private void initializeGame() {
        Random random = new Random();
        currentWord = wordList[random.nextInt(wordList.length)].toLowerCase();
        guessedWord = new StringBuilder("_".repeat(currentWord.length()));
        attemptsLeft = 6;
    }

    private String displayWord() {
        return guessedWord.toString();
    }

    private void processGuess(String guess) {
        guess = guess.toLowerCase();
        if (guess.length() == 1 && Character.isLetter(guess.charAt(0))) {
            if (currentWord.contains(guess)) {
                for (int i = 0; i < currentWord.length(); i++) {
                    if (currentWord.charAt(i) == guess.charAt(0)) {
                        guessedWord.setCharAt(i, guess.charAt(0));
                    }
                }
            } else {
                attemptsLeft--;
            }

            wordLabel.setText(displayWord());
            attemptsLabel.setText("Attempts left: " + attemptsLeft);

            if (attemptsLeft == 0) {
                endGame("You lose! The word was: " + currentWord);
            } else if (!guessedWord.toString().contains("_")) {
                endGame("Congratulations! You guessed the word: " + currentWord);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid single letter.");
        }
    }

    private void endGame(String message) {
        JOptionPane.showMessageDialog(this, message);
        initializeGame();
        wordLabel.setText(displayWord());
        attemptsLabel.setText("Attempts left: " + attemptsLeft);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DeineMom();
            }
        });
    }
}*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DeineMom extends JFrame {
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

    public DeineMom() {
        super("GalgenJFrame");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(830, 583);
        setLocationRelativeTo(null);
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);

        tfstriche.setBounds(48, 304, 232, 24);
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

        setVisible(true);
    }

    public static void main(String[] args) {
        new DeineMom();
    }

    public void bRaten_ActionPerformed(ActionEvent evt) {
        System.out.println("Test");
        String word = tfLoesung.getText();
        String buchstabe = tfRaten.getText();

        if (word.indexOf(buchstabe) >= 0) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == buchstabe.charAt(0)) {
                    ratewort.setCharAt(i, buchstabe.charAt(0));
                    tfstriche.setText(ratewort.toString());
                }
            }
        } else {
            int i = 1;
            if (i >= 1) {
                l1huegel.setVisible(true);
            }
            if (i >= 2) {
                l2mast.setVisible(true);
            }
            if (i >= 3) {
                l3balken.setVisible(true);
            }
            if (i >= 4) {
                l4quer.setVisible(true);
            }
            if (i >= 5) {
                l5strick.setVisible(true);
            }
            if (i >= 6) {
                l6kopf1.setVisible(true);
            }
            if (i >= 7) {
                l7body.setVisible(true);
            }
            if (i >= 8) {
                l8arme.setVisible(true);
            }
            if (i >= 9) {
                l9beine.setVisible(true);
            }
        }
    }

    public void bWortfestlegen_ActionPerformed(ActionEvent evt) {
        System.out.println("ksdkdkdkdkdk");

        String word = tfLoesung.getText();

        tfLoesung.setVisible(false);

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

        System.out.println(word);
    }
}