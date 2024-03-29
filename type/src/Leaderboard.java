import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Leaderboard extends javax.swing.JFrame {
    private JPanel profileDetailsPanel;
    public Leaderboard() {
        Profiledesign.fetchEmails();
        initComponents();
        getDetails();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(512, 724));

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Gill Sans Nova Cond Ultra Bold", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("TYPHOON");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(207, 170, 100, 30);

        jButton12.setBackground(new java.awt.Color(51, 255, 255));
        jButton12.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(51, 51, 255));
        jButton12.setText("jButton1");
        jButton12.setBorder(null);
        jButton12.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                 jButton12.setBackground(new java.awt.Color(0, 255, 255).darker()); // Darken the background color on hover
            }
        
            public void mouseExited(MouseEvent e) {
                jButton12.setBackground(new java.awt.Color(0, 255, 255)); // Restore the original background color when the cursor leaves
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(120, 230, 310, 30);

        jButton13.setBackground(new java.awt.Color(0, 255, 255));
        jButton13.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 51, 255));
        jButton13.setText("jButton1");
        jButton13.setBorder(null);
        jButton13.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                 jButton13.setBackground(new java.awt.Color(0, 255, 255).darker()); // Darken the background color on hover
            }
        
            public void mouseExited(MouseEvent e) {
                jButton13.setBackground(new java.awt.Color(0, 255, 255)); // Restore the original background color when the cursor leaves
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(120, 276, 310, 30);

        jButton14.setBackground(new java.awt.Color(0, 255, 255));
        jButton14.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 51, 255));
        jButton14.setText("jButton1");
        jButton14.setBorder(null);
        jButton14.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                 jButton14.setBackground(new java.awt.Color(0, 255, 255).darker()); // Darken the background color on hover
            }
        
            public void mouseExited(MouseEvent e) {
                jButton14.setBackground(new java.awt.Color(0, 255, 255)); // Restore the original background color when the cursor leaves
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(120, 322, 310, 30);

        jButton15.setBackground(new java.awt.Color(0, 255, 255));
        jButton15.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 51, 255));
        jButton15.setText("jButton1");
        jButton15.setBorder(null);
        jButton15.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                 jButton15.setBackground(new java.awt.Color(0, 255, 255).darker()); // Darken the background color on hover
            }
        
            public void mouseExited(MouseEvent e) {
                jButton15.setBackground(new java.awt.Color(0, 255, 255)); // Restore the original background color when the cursor leaves
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(120, 365, 310, 30);

        jButton16.setBackground(new java.awt.Color(0, 255, 255));
        jButton16.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 51, 255));
        jButton16.setText("jButton1");
        jButton16.setBorder(null);
        jButton16.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                 jButton16.setBackground(new java.awt.Color(0, 255, 255).darker()); // Darken the background color on hover
            }
        
            public void mouseExited(MouseEvent e) {
                jButton16.setBackground(new java.awt.Color(0, 255, 255)); // Restore the original background color when the cursor leaves
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(120, 407, 310, 30);

        jButton17.setBackground(new java.awt.Color(0, 255, 255));
        jButton17.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 51, 255));
        jButton17.setText("jButton1");
        jButton17.setBorder(null);
        jButton17.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                 jButton17.setBackground(new java.awt.Color(0, 255, 255).darker()); // Darken the background color on hover
            }
        
            public void mouseExited(MouseEvent e) {
                jButton17.setBackground(new java.awt.Color(0, 255, 255)); // Restore the original background color when the cursor leaves
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(120, 450, 310, 30);

        jButton18.setBackground(new java.awt.Color(0, 255, 255));
        jButton18.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 51, 255));
        jButton18.setText("jButton1");
        jButton18.setBorder(null);
        jButton18.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                 jButton18.setBackground(new java.awt.Color(0, 255, 255).darker()); // Darken the background color on hover
            }
        
            public void mouseExited(MouseEvent e) {
                jButton18.setBackground(new java.awt.Color(0, 255, 255)); // Restore the original background color when the cursor leaves
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(120, 491, 310, 30);

        jButton19.setBackground(new java.awt.Color(0, 255, 255));
        jButton19.setFont(new java.awt.Font("Verdana Pro Black", 1, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 51, 255));
        jButton19.setText("jButton1");
        jButton19.setBorder(null);
        jButton19.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                 jButton19.setBackground(new java.awt.Color(0, 255, 255).darker()); // Darken the background color on hover
            }
        
            public void mouseExited(MouseEvent e) {
                jButton19.setBackground(new java.awt.Color(0, 255, 255)); // Restore the original background color when the cursor leaves
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(120, 533, 310, 30);

        jButton20.setBackground(new java.awt.Color(0, 255, 255));
        jButton20.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 51, 255));
        jButton20.setText("jButton1");
        jButton20.setBorder(null);
        jButton20.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                 jButton20.setBackground(new java.awt.Color(0, 255, 255).darker()); // Darken the background color on hover
            }
        
            public void mouseExited(MouseEvent e) {
                jButton20.setBackground(new java.awt.Color(0, 255, 255)); // Restore the original background color when the cursor leaves
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);
        jButton20.setBounds(120, 573, 310, 30);

        jButton21.setBackground(new java.awt.Color(0, 255, 255));
        jButton21.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 51, 255));
        jButton21.setText("jButton1");
        jButton21.setBorder(null);
        jButton21.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                 jButton21.setBackground(new java.awt.Color(0, 255, 255).darker()); // Darken the background color on hover
            }
        
            public void mouseExited(MouseEvent e) {
                jButton21.setBackground(new java.awt.Color(0, 255, 255)); // Restore the original background color when the cursor leaves
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);
        jButton21.setBounds(120, 616, 310, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EXIT");
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false); 
        jButton1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                jButton1.setBackground(Color.RED.darker()); // Darken the background color on hover
            }
        
            public void mouseExited(MouseEvent e) {
                jButton1.setBackground(Color.RED); // Restore the original background color when the cursor leaves
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 75, 30);


        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("Leaderboard.jpeg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(515, 730));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(515, 730));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 510, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        buttons =  new JButton[]{jButton12, jButton13, jButton14, jButton15, jButton16, jButton17, jButton18, jButton19, jButton20, jButton21};
        pack();
    }// </editor-fold>    
    
    public void getDetails(){
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Retrieve player data (excluding average WPM and accuracy)
            String query = "SELECT player_profiles.players_email " +
                    "FROM player_profiles " +
                    "INNER JOIN results ON player_profiles.players_ID = results.players_ID " +
                    "GROUP BY player_profiles.players_email " +
                    "ORDER BY AVG(results.wpm) DESC " +
                    "LIMIT 10";
    
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            int index = 0; // Counter for buttons array index
            while (resultSet.next() && index < buttons.length) {
            String email = resultSet.getString("players_email");
            buttons[index].setText(email); // Set email text to the button
            buttons[index].addMouseListener(new LeaderboardEntryClickListener(email));
            index++;
            } 
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }


    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }        
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {     
        this.dispose();                                    
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    } 

    private class LeaderboardEntryClickListener extends MouseAdapter {
        private String email;

        public LeaderboardEntryClickListener(String email) {
            this.email = email;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            // Display player profile when a leaderboard entry is clicked
            displayPlayerProfile(email);
        }
    
    }

    private void displayPlayerProfile(String email) {
    
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Check if records exist for the selected email
            String countQuery = "SELECT COUNT(*) AS record_count " +
                    "FROM results " +
                    "INNER JOIN player_profiles ON results.players_ID = player_profiles.players_ID " +
                    "WHERE player_profiles.players_email = ?";
            try (PreparedStatement countStatement = connection.prepareStatement(countQuery)) {
                countStatement.setString(1, email);
                try (ResultSet countResult = countStatement.executeQuery()) {
                    countResult.next();
                    int recordCount = countResult.getInt("record_count");
    
                    if (recordCount > 0) {
                        // Records exist, fetch average values for last 10 games and all-time
                        String last10AvgQuery = "SELECT AVG(accuracy) AS last_10_avg_accuracy, AVG(wpm) AS last_10_avg_wpm " +
                                "FROM (SELECT accuracy, wpm " +
                                "FROM results " +
                                "INNER JOIN player_profiles ON results.players_ID = player_profiles.players_ID " +
                                "WHERE player_profiles.players_email = ?" +
                                "ORDER BY timestamp DESC " +
                                "LIMIT 10) AS last_10_games ";
                        try (PreparedStatement last10AvgStatement = connection.prepareStatement(last10AvgQuery)) {
                            last10AvgStatement.setString(1, email);
                            try (ResultSet last10AvgResult = last10AvgStatement.executeQuery()) {
                                double last10AvgAccuracy = 0.0;
                                double last10AvgWPM = 0.0;
    
                                if (last10AvgResult.next()) {
                                    last10AvgAccuracy = last10AvgResult.getDouble("last_10_avg_accuracy");
                                    last10AvgWPM = last10AvgResult.getDouble("last_10_avg_wpm");
                                }
    
                                String allTimeAvgQuery = "SELECT AVG(accuracy) AS all_time_avg_accuracy, AVG(wpm) AS all_time_avg_wpm " +
                                        "FROM results " +
                                        "INNER JOIN player_profiles ON results.players_ID = player_profiles.players_ID " +
                                        "WHERE player_profiles.players_email = ?";
                                try (PreparedStatement allTimeAvgStatement = connection.prepareStatement(allTimeAvgQuery)) {
                                    allTimeAvgStatement.setString(1, email);
                                    try (ResultSet allTimeAvgResult = allTimeAvgStatement.executeQuery()) {
                                        double allTimeAvgAccuracy = 0.0;
                                        double allTimeAvgWPM = 0.0;
    
                                        if (allTimeAvgResult.next()) {
                                            allTimeAvgAccuracy = allTimeAvgResult.getDouble("all_time_avg_accuracy");
                                            allTimeAvgWPM = allTimeAvgResult.getDouble("all_time_avg_wpm");
                                        }
    
                                        // Display fetched data in the UI (labels, etc.)
                                        JDialog profileDialog = new JDialog((Frame) SwingUtilities.getWindowAncestor(this), "Player Profile", true);
                                        profileDialog.setLayout(new BorderLayout());
                                        profileDialog.setSize(400, 300); // Set the size as per your requirement
                                        JPanel profileDetailsPanel = new JPanel(new GridLayout(0, 1, 0, 10));
                                        profileDetailsPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
                                        
                                        JLabel usernameLabel = new JLabel("Username: " + email);
                                        usernameLabel.setFont(new Font("Arial", Font.BOLD, 18));
                                        usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
                                        profileDetailsPanel.add(usernameLabel);
    
                                        JPanel leftPanel = new JPanel(new GridLayout(0, 1, 0, 10));
                                        JLabel last10GamesLabel = new JLabel("Last 10 Games", SwingConstants.CENTER);
                                        last10GamesLabel.setFont(new Font("Arial", Font.BOLD, 16));
                                        last10GamesLabel.setHorizontalAlignment(SwingConstants.CENTER);
                                        leftPanel.add(last10GamesLabel);
    
                                        JLabel last10AccuracyLabel = new JLabel("Avg Accuracy: " + last10AvgAccuracy);
                                        JLabel last10WPMLabel = new JLabel("Avg WPM: " + last10AvgWPM);
                                        last10AccuracyLabel.setHorizontalAlignment(SwingConstants.CENTER);
                                        last10WPMLabel.setHorizontalAlignment(SwingConstants.CENTER);
    
                                        leftPanel.add(last10AccuracyLabel);
                                        leftPanel.add(last10WPMLabel);
    
                                        JPanel rightPanel = new JPanel(new GridLayout(0, 1, 0, 10));
                                        JLabel allTimeLabel = new JLabel("All Time", SwingConstants.CENTER);
                                        allTimeLabel.setFont(new Font("Arial", Font.BOLD, 16));
                                        allTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
                                        rightPanel.add(allTimeLabel);
    
                                        JLabel allTimeAccuracyLabel = new JLabel("Avg Accuracy: " + allTimeAvgAccuracy);
                                        JLabel allTimeWPMLabel = new JLabel("Avg WPM: " + allTimeAvgWPM);
                                        allTimeAccuracyLabel.setHorizontalAlignment(SwingConstants.CENTER);
                                        allTimeWPMLabel.setHorizontalAlignment(SwingConstants.CENTER);
    
                                        rightPanel.add(allTimeAccuracyLabel);
                                        rightPanel.add(allTimeWPMLabel);
    
                                        JPanel parentPanel = new JPanel(new GridLayout(1, 2, 10, 0));
                                        parentPanel.add(leftPanel);
                                        
                                        
                                        parentPanel.add(rightPanel);
                                        
                                        // Add the parent panel to the profileDetailsPanel
                                        profileDetailsPanel.add(parentPanel);
                                        JScrollPane scrollPane = new JScrollPane(profileDetailsPanel);
                                        profileDialog.add(scrollPane, BorderLayout.CENTER);
                                        profileDialog.setSize(500, 250);
                                        profileDialog.setVisible(true);
                                        

                                    }
                                }
                            }
                        }
                    } else {
                        // No records found for the player
                        JLabel noDataLabel = new JLabel("No data available for this player.");
                        noDataLabel.setHorizontalAlignment(SwingConstants.CENTER);
                        profileDetailsPanel.add(noDataLabel);
                    }
                }
            }
    
            revalidate(); // Refresh the panel to display new components
            repaint();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle potential exceptions properly in your application
        }

    }
    // Variables declaration - do not modify  
    private javax.swing.JButton jButton1;                   
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private JButton[] buttons;
    // End of variables declaration                   
}

