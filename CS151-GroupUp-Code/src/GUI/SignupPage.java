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

/**
*
* @author preethi
*/
public class SignupPage extends javax.swing.JFrame {

   /**
    * Creates new form SignupPage
    */
   public SignupPage() {
       initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

       panelGradient1 = new GUI.PanelGradient();
       goButton = new javax.swing.JButton();
       signupLabel = new javax.swing.JLabel();
       firstNameLabel = new javax.swing.JLabel();
       firstNameTextField = new javax.swing.JTextField();
       lastNameLabel = new javax.swing.JLabel();
       emailLabel = new javax.swing.JLabel();
       passwordLabel = new javax.swing.JLabel();
       exitButton = new javax.swing.JButton();
       emailTextField = new javax.swing.JTextField();
       passwordTextField = new javax.swing.JTextField();
       lastNameTextField = new javax.swing.JTextField();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       panelGradient1.setColorPrimario(new java.awt.Color(159, 234, 234));
       panelGradient1.setColorSecundario(new java.awt.Color(13, 165, 165));

       goButton.setBackground(new java.awt.Color(13, 165, 165));
       goButton.setFont(new java.awt.Font("Canela", 1, 60)); // NOI18N
       goButton.setForeground(new java.awt.Color(255, 255, 255));
       goButton.setText("Go");
       goButton.setBorder(null);
       goButton.setBorderPainted(false);
       goButton.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               goButtonActionPerformed(evt);
           }
       });

       signupLabel.setFont(new java.awt.Font("Canela", 1, 70)); // NOI18N
       signupLabel.setForeground(new java.awt.Color(255, 255, 255));
       signupLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       signupLabel.setText("Signup");

       firstNameLabel.setFont(new java.awt.Font("Canela", 1, 30)); // NOI18N
       firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
       firstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       firstNameLabel.setText("First Name");

       firstNameTextField.setFont(new java.awt.Font("Canela", 0, 20)); // NOI18N
       firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               firstNameTextFieldActionPerformed(evt);
           }
       });

       lastNameLabel.setFont(new java.awt.Font("Canela", 1, 30)); // NOI18N
       lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
       lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       lastNameLabel.setText("Last Name");

       emailLabel.setFont(new java.awt.Font("Canela", 1, 30)); // NOI18N
       emailLabel.setForeground(new java.awt.Color(255, 255, 255));
       emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       emailLabel.setText("Email");

       passwordLabel.setFont(new java.awt.Font("Canela", 1, 30)); // NOI18N
       passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
       passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       passwordLabel.setText("Password");

       exitButton.setBackground(new java.awt.Color(13, 165, 165));
       exitButton.setFont(new java.awt.Font("Canela", 1, 60)); // NOI18N
       exitButton.setForeground(new java.awt.Color(255, 255, 255));
       exitButton.setText("X");
       exitButton.setBorder(null);
       exitButton.setBorderPainted(false);
       exitButton.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               exitButtonActionPerformed(evt);
           }
       });

       emailTextField.setFont(new java.awt.Font("Canela", 0, 20)); // NOI18N
       emailTextField.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               emailTextFieldActionPerformed(evt);
           }
       });

       passwordTextField.setFont(new java.awt.Font("Canela", 0, 20)); // NOI18N
       passwordTextField.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               passwordTextFieldActionPerformed(evt);
           }
       });

       lastNameTextField.setFont(new java.awt.Font("Canela", 0, 20)); // NOI18N
       lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               lastNameTextFieldActionPerformed(evt);
           }
       });

       panelGradient1.setLayer(goButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
       panelGradient1.setLayer(signupLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
       panelGradient1.setLayer(firstNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
       panelGradient1.setLayer(firstNameTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
       panelGradient1.setLayer(lastNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
       panelGradient1.setLayer(emailLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
       panelGradient1.setLayer(passwordLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
       panelGradient1.setLayer(exitButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
       panelGradient1.setLayer(emailTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
       panelGradient1.setLayer(passwordTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
       panelGradient1.setLayer(lastNameTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

       //changed the size of the password label from 140 to 160 to display the full text
       javax.swing.GroupLayout panelGradient1Layout = new javax.swing.GroupLayout(panelGradient1);
       panelGradient1.setLayout(panelGradient1Layout);
       panelGradient1Layout.setHorizontalGroup(
           panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
           .addGroup(panelGradient1Layout.createSequentialGroup()
               .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(panelGradient1Layout.createSequentialGroup()
                       .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(panelGradient1Layout.createSequentialGroup()
                               .addGap(544, 544, 544)
                               .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient1Layout.createSequentialGroup()
                               .addContainerGap()
                               .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(firstNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                   .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                       .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                   .addGroup(panelGradient1Layout.createSequentialGroup()
                       .addGap(655, 655, 655)
                       .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
           .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient1Layout.createSequentialGroup()
                   .addContainerGap(379, Short.MAX_VALUE)
                   .addComponent(signupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGap(364, 364, 364)))
           .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient1Layout.createSequentialGroup()
                   .addContainerGap(1356, Short.MAX_VALUE)
                   .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGap(10, 10, 10)))
       );
       panelGradient1Layout.setVerticalGroup(
           panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(panelGradient1Layout.createSequentialGroup()
               .addGap(235, 235, 235)
               .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(37, 37, 37)
               .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(256, Short.MAX_VALUE))
           .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelGradient1Layout.createSequentialGroup()
                   .addGap(102, 102, 102)
                   .addComponent(signupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addContainerGap(611, Short.MAX_VALUE)))
           .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelGradient1Layout.createSequentialGroup()
                   .addGap(10, 10, 10)
                   .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addContainerGap(733, Short.MAX_VALUE)))
       );

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );

       pack();
   }// </editor-fold>                        

   private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
       if (evt.getSource() == goButton) 
       {
    	   //following added by Danilo
    	   String fnTest = firstNameTextField.getText();
    	   String lnTest = lastNameTextField.getText();
    	   String emailTest = emailTextField.getText();
    	   String pwTest = passwordTextField.getText();
    	   
    	   try
    	   {
    		   PasswordTester.isValid(pwTest);
    		   User person = new User(fnTest, lnTest, emailTest, pwTest);
   			   MysqlConn.insertUserIntoDB(person);			//insert the user's data into the database
   			   AccountPage.main(null);
    	   }
    	   catch (LowerCaseCharacterMissing lc)
    	   {
    		   lc.printStackTrace();
    	   } 
    	   catch (Minimum8CharactersRequired e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   } 
    	   catch (NumberCharacterMissing e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    	   } 
    	   catch (SpecialCharacterMissing e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    	   } 
    	   catch (UpperCaseCharacterMissing e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UserAlreadyExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
           
       }
   }                                        

   private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
       // TODO add your handling code here:
   }                                                  

   private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
      if (evt.getSource() == exitButton) 
       {
           InitialWelcomePage.main(null);
       }
   }                                          

   private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                               
       // TODO add your handling code here:
   }                                              

   private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
       // TODO add your handling code here:
   }                                                 

   private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
       // TODO add your handling code here:
   }                                                 

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
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
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
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

   // Variables declaration - do not modify                     
   private javax.swing.JLabel emailLabel;
   private javax.swing.JTextField emailTextField;
   private javax.swing.JButton exitButton;
   private javax.swing.JLabel firstNameLabel;
   private javax.swing.JTextField firstNameTextField;
   private javax.swing.JButton goButton;
   private javax.swing.JLabel lastNameLabel;
   private javax.swing.JTextField lastNameTextField;
   private GUI.PanelGradient panelGradient1;
   private javax.swing.JLabel passwordLabel;
   private javax.swing.JTextField passwordTextField;
   private javax.swing.JLabel signupLabel;
   // End of variables declaration                   
}
