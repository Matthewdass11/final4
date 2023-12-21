import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Menu extends JFrame implements ActionListener {
    private JFrame currentFrame;

    public Menu() {
        setLayout(null); // Set layout to null for absolute positioning

        // print something
        JLabel welcome = new JLabel("Welcome to");
        JLabel menu = new JLabel("TYP-A-THON");

        welcome.setBounds(540, 5, 500, 150); // x, y, width, height
        menu.setBounds(500, 40, 500, 150);

        // Set font and color for welcome label
        Font welcomeFont = new Font("Arial", Font.BOLD, 30);
        welcome.setFont(welcomeFont);
        welcome.setForeground(Color.BLUE);

        add(welcome);

        // Set font and color for menu label
        Font menuFont = new Font("SansSerif", Font.ITALIC, 40);
        menu.setFont(menuFont);
        menu.setForeground(Color.RED);

        add(menu);

        // add buttons with specified coordinates
        JButton default1 = new JButton("Default Mode");
        default1.setBounds(550, 160, 150, 30); // x, y, width, height

        JButton timed = new JButton("Timed Mode");
        timed.setBounds(550, 210, 150, 30);

        JButton word = new JButton("Words Mode");
        word.setBounds(550, 260, 150, 30);

        JButton quotes = new JButton("Quotes Mode");
        quotes.setBounds(550, 310, 150, 30);

        JButton sudden = new JButton("Sudden Death");
        sudden.setBounds(550, 360, 150, 30);

        JButton leaderboard = new JButton("Leaderboard");
        leaderboard.setBounds(550, 410, 150, 30);

        add(default1);
        add(timed);
        add(word);
        add(quotes);
        add(sudden);
        add(leaderboard);

        // add ActionListener to buttons
        default1.addActionListener(this);
        timed.addActionListener(this);
        word.addActionListener(this);
        quotes.addActionListener(this);
        sudden.addActionListener(this);
        leaderboard.addActionListener(this);

        // open the interface
        setLocation(150, 90);
        setSize(1250, 650);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (currentFrame != null) {
            currentFrame.dispose();
        }

        // Handle button clicks here
        if (ae.getActionCommand().equals("Default Mode")) {
            openNewDefault("Default Mode");
        } else if (ae.getActionCommand().equals("Timed Mode")) {
            openNewTimed("Timed Mode");
        } else if (ae.getActionCommand().equals("Words Mode")) {
            openNewWords("Words Mode");
        } else if (ae.getActionCommand().equals("Quotes Mode")) {
            openNewQuotes("Quotes Mode");
        } else if (ae.getActionCommand().equals("Sudden Death")) {
            openNewSuddendeath("Sudden Death");
        }else if (ae.getActionCommand().equals("Leaderboard")) {
            openNewLeaderboard("Leaderboard");
        }
    }

    private void openNewDefault(String mode) { //quickstart
        new MainGame(10, "dictionary.txt", 50).setVisible(true);
        this.dispose();
    }

    private void openNewTimed(String mode) { //can edit timer, choose yes or no punctuation
        new MainGame(30, "dictionary2.txt", 50).setVisible(true);
        this.dispose();
    }

    private void openNewWords(String mode) {
        new MainGame(0, "dictionary.txt", 10, true).setVisible(true);
        this.dispose();
    }

    private void openNewQuotes(String mode) {
        new MainGame(30, "quote.txt", 5).setVisible(true);
        this.dispose();
    }

    private void openNewSuddendeath(String mode) {
        this.dispose();
    }

    private void openNewLeaderboard(String mode) {
        this.dispose();
    }
}
