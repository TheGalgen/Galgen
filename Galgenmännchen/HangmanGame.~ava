/*import java.util.Scanner;

public class HangmanGame {

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
import javax.swing.*;
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

    public HangmanGame() {
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
                new HangmanGame();
            }
        });
    }
}