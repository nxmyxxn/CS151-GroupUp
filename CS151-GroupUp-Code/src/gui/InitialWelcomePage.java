package gui;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import groupup.MysqlConn;

public class InitialWelcomePage extends javax.swing.JFrame {

	/**
     * Creates new form TestJFrame1
     */
    public InitialWelcomePage() {
        initComponents();
        //setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelGradient1 = new gui.PanelGradient();
        welcomeLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        signupButton1 = new javax.swing.JButton();
        loginButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        panelGradient1.setColorPrimario(new java.awt.Color(159, 234, 234));
        panelGradient1.setColorSecundario(new java.awt.Color(13, 165, 165));

        welcomeLabel.setFont(new java.awt.Font("Canela", 1, 70)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome to GroupUp");

        exitButton.setBackground(new java.awt.Color(13, 165, 165));
        exitButton.setFont(new java.awt.Font("Canela", 1, 60)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
        exitButton.setText("X");
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        signupButton1.setBackground(new java.awt.Color(13, 165, 165));
        signupButton1.setFont(new java.awt.Font("Canela", 1, 30)); // NOI18N
        signupButton1.setForeground(new java.awt.Color(0, 0, 0));
        signupButton1.setText("Signup");
        signupButton1.setBorder(null);
        signupButton1.setBorderPainted(false);
        signupButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButton1ActionPerformed(evt);
            }
        });

        loginButton1.setBackground(new java.awt.Color(13, 165, 165));
        loginButton1.setFont(new java.awt.Font("Canela", 1, 30)); // NOI18N
        loginButton1.setForeground(new java.awt.Color(0, 0, 0));
        loginButton1.setText("Login");
        loginButton1.setBorder(null);
        loginButton1.setBorderPainted(false);
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	loginButton1ActionPerformed(evt);
            }
        });
        //changed welcomeLabel addComponent from 700 to 730 to display full text
        panelGradient1.setLayer(welcomeLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradient1.setLayer(exitButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradient1.setLayer(signupButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradient1.setLayer(loginButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
 

        javax.swing.GroupLayout panelGradient1Layout = new javax.swing.GroupLayout(panelGradient1);
        panelGradient1.setLayout(panelGradient1Layout);
        panelGradient1Layout.setHorizontalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradient1Layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelGradient1Layout.createSequentialGroup()
                        .addComponent(signupButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(372, 372, 372))
            .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelGradient1Layout.setVerticalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradient1Layout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(318, Short.MAX_VALUE))
        );

        exitButton.getAccessibleContext().setAccessibleName("Exit");
        exitButton.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	this.dispose();			//will close and dispose of the initial welcome page when pressing the exit button
    }                                          

    private void signupButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (evt.getSource() == signupButton1) 
        {
        	this.dispose();
        	SignupPage.main(null);
        }
    }                                             

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (evt.getSource() == loginButton1) 
        {
        	this.dispose();
        	LoginPage.main(null);
        }
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitialWelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InitialWelcomePage().setVisible(true);
                MysqlConn.initializeDatabaseTables();
                
            }
        });
    }
                   
    private javax.swing.JButton exitButton;
    private javax.swing.JButton loginButton1;
    private gui.PanelGradient panelGradient1;
    private javax.swing.JButton signupButton1;
    private javax.swing.JLabel welcomeLabel;          
}

