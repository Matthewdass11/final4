package game.version2;

import game.version1.GenerateRandomText;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class GameLogic extends JPanel {
    private JTextField textField;
    private Timer timer;
    private boolean gameRunning = false;
    private int correctCharCnt;
    private int gameDuration;
    private String textfile;
    private int numOfWord;
    private Score score;
    private MyPanel panel;


    public GameLogic (int gameDuration, String textfile, int numOfWord){
        this.gameDuration = gameDuration;
        this.textfile = textfile;
        this.numOfWord = numOfWord;
    }
    public GameLogic(){}


    public JTextField getTextField() {
        return textField;
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public void startGame(JLabel label, JTextField textField) {
        gameRunning = true;
        correctCharCnt = 0;

        setRandomWord(label);
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (textField.getText().length() == 1){
                    System.out.println("Timer started");
                    timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            endGame(label, textField);
                        }
                    }, gameDuration * 1000);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

    }
    public void setRandomWord(JLabel label) {
        game.version1.GenerateRandomText generateRandomText = new GenerateRandomText(textfile);
        String[] word = generateRandomText.generateWord(numOfWord);
        label.setText("<html><div style='text-align: center;'>" + String.join(" ", word) + "</div></html>");
    }

    public void endGame(JLabel label, JTextField textField) {
        gameRunning = false;
        timer.cancel();

        //read user's input
        String typedWord = textField.getText();
        textField.setText("");
        JOptionPane.showMessageDialog(this,"Timer stopped");
        score = new Score();
        score.checkWord(label, typedWord, gameDuration);
        JOptionPane.showMessageDialog(this,
                "Press the button to get a new random text or you may just start");
    }
}
