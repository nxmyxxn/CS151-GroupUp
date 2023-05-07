package GUI;

import GroupUp.MysqlConn;
import GroupUp.User;
import exceptions.LowerCaseCharacterMissing;
import exceptions.Minimum8CharactersRequired;
import exceptions.NumberCharacterMissing;
import exceptions.PasswordTester;
import exceptions.SpecialCharacterMissing;
import exceptions.UpperCaseCharacterMissing;
import exceptions.UserAlreadyExistsException;

public class SignupPage extends javax.swing.JFrame {

    /**
     * Creates new form SignupPage
     */
    public SignupPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelGradient1 = new GUI.PanelGradient();
        SignupPageLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        goButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGradient1.setColorPrimario(new java.awt.Color(159, 234, 234));
        panelGradient1.setColorSecundario(new java.awt.Color(13, 165, 165));

        SignupPageLabel.setFont(new java.awt.Font("Canela", 1, 70)); // NOI18N
        SignupPageLabel.setText("Signup");
        panelGradient1.add(SignupPageLabel);
        SignupPageLabel.setBounds(560, 40, 230, 100);

        exitButton.setBackground(new java.awt.Color(13, 165, 165));
        exitButton.setFont(new java.awt.Font("Canela", 1, 60)); // NOI18N
        exitButton.setText("X");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(exitButton);
        exitButton.setBounds(1350, 10, 80, 80);

        firstNameLabel.setFont(new java.awt.Font("Canela", 1, 40)); // NOI18N
        firstNameLabel.setText("First Name:");
        panelGradient1.add(firstNameLabel);
        firstNameLabel.setBounds(450, 160, 230, 60);

        firstNameTextField.setFont(new java.awt.Font("Canela", 0, 18)); // NOI18N
        
        panelGradient1.add(firstNameTextField);
        firstNameTextField.setBounds(680, 170, 270, 50);

        lastNameLabel.setFont(new java.awt.Font("Canela", 1, 40)); // NOI18N
        lastNameLabel.setText("Last Name:");
        panelGradient1.add(lastNameLabel);
        lastNameLabel.setBounds(450, 260, 230, 60);

        lastNameTextField.setFont(new java.awt.Font("Canela", 0, 18)); // NOI18N
        
        panelGradient1.add(lastNameTextField);
        lastNameTextField.setBounds(680, 270, 270, 50);

        emailLabel.setFont(new java.awt.Font("Canela", 1, 40)); // NOI18N
        emailLabel.setText("Email:");
        panelGradient1.add(emailLabel);
        emailLabel.setBounds(450, 360, 230, 60);

        emailTextField.setFont(new java.awt.Font("Canela", 0, 18)); // NOI18N
       
        panelGradient1.add(emailTextField);
        emailTextField.setBounds(680, 370, 270, 50);

        usernameLabel.setFont(new java.awt.Font("Canela", 1, 40)); // NOI18N
        usernameLabel.setText("Username:");
        panelGradient1.add(usernameLabel);
        usernameLabel.setBounds(450, 460, 230, 60);

        usernameTextField.setFont(new java.awt.Font("Canela", 0, 18)); // NOI18N
       
        panelGradient1.add(usernameTextField);
        usernameTextField.setBounds(680, 470, 270, 50);

        passwordLabel.setFont(new java.awt.Font("Canela", 1, 40)); // NOI18N
        passwordLabel.setText("Password:");
        panelGradient1.add(passwordLabel);
        passwordLabel.setBounds(450, 560, 230, 60);

        passwordTextField.setFont(new java.awt.Font("Canela", 0, 18)); // NOI18N
       
        panelGradient1.add(passwordTextField);
        passwordTextField.setBounds(680, 570, 270, 50);

        goButton.setBackground(new java.awt.Color(13, 165, 165));
        goButton.setFont(new java.awt.Font("Canela", 1, 48)); // NOI18N
        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(goButton);
        goButton.setBounds(600, 660, 130, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, 1443, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                           
    	if (evt.getSource() == exitButton) 
        {
        	this.dispose();
        	InitialWelcomePage.main(null);
        }
    }                                          
    
    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	if (evt.getSource() == goButton) 
        {
     	   //following added by Danilo
     	   String fnTest = firstNameTextField.getText();
     	   String lnTest = lastNameTextField.getText();
     	   String unTest = usernameTextField.getText();
     	   String emailTest = emailTextField.getText();
     	   String pwTest = new String((passwordTextField).getPassword());
     	   
     	   try
     	   {
     		   PasswordTester.isValid(pwTest);
    		   MysqlConn.insertUserIntoDB(unTest, fnTest, lnTest, emailTest, pwTest);			//insert the user's data into the database
    		   User.getInstance(fnTest, lnTest, unTest, emailTest, pwTest);
    		   this.dispose();    		   
    		   HomePage.main(null);
    			   
     	   }
     	   catch (LowerCaseCharacterMissing | Minimum8CharactersRequired | NumberCharacterMissing | SpecialCharacterMissing | UpperCaseCharacterMissing | ClassNotFoundException | UserAlreadyExistsException e)
     	   {
     		   e.printStackTrace();
     		   ErrorPopup.makePopup(e.getMessage());

     	   } 
     	    
            
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
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }
                  
    private javax.swing.JLabel SignupPageLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField usernameTextField;
    private GUI.PanelGradient panelGradient1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField lastNameTextField;                
}
