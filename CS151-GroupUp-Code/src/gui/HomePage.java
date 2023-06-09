
package gui;

import groupup.User;

public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelGradient1 = new gui.PanelGradient();
        HomePageLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        accountButton1 = new javax.swing.JButton();
        schedulesButton = new javax.swing.JButton();
        groupsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGradient1.setColorPrimario(new java.awt.Color(159, 234, 234));
        panelGradient1.setColorSecundario(new java.awt.Color(13, 165, 165));

        HomePageLabel.setFont(new java.awt.Font("Canela", 1, 70)); // NOI18N
        HomePageLabel.setText("Home");
        panelGradient1.add(HomePageLabel);
        HomePageLabel.setBounds(630, 40, 210, 100);

        logoutButton.setBackground(new java.awt.Color(13, 165, 165));
        logoutButton.setFont(new java.awt.Font("Canela", 1, 48)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(logoutButton);
        logoutButton.setBounds(750, 430, 280, 110);

        accountButton1.setBackground(new java.awt.Color(13, 165, 165));
        accountButton1.setFont(new java.awt.Font("Canela", 1, 48)); // NOI18N
        accountButton1.setText("Account");
        accountButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButton1ActionPerformed(evt);
            }
        });
        panelGradient1.add(accountButton1);
        accountButton1.setBounds(410, 260, 280, 110);

        schedulesButton.setBackground(new java.awt.Color(13, 165, 165));
        schedulesButton.setFont(new java.awt.Font("Canela", 1, 48)); // NOI18N
        schedulesButton.setText("Schedules");
        schedulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schedulesButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(schedulesButton);
        schedulesButton.setBounds(750, 260, 280, 110);

        groupsButton.setBackground(new java.awt.Color(13, 165, 165));
        groupsButton.setFont(new java.awt.Font("Canela", 1, 48)); // NOI18N
        groupsButton.setText("Groups");
        groupsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupsButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(groupsButton);
        groupsButton.setBounds(410, 430, 280, 110);

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

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	if (evt.getSource() == logoutButton) 
        {
    		this.dispose();
        	User.nullifyInstance();
        	InitialWelcomePage.main(null); //go back to welcome page on logout and set User instance to null.
        }
    			
    }                                            

    private void accountButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	if (evt.getSource() == accountButton1) 
        {
        	this.dispose();
        	AccountPage.main(null);
        }
    }                                              

    private void schedulesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	if (evt.getSource() == schedulesButton) 
        {
        	this.dispose();
        	SchedulesPage.main(null);
        }
    }                                               

    private void groupsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	if (evt.getSource() == groupsButton) 
        {
        	this.dispose();
        	GroupsPage.main(null);
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
         
    private javax.swing.JLabel HomePageLabel;
    private javax.swing.JButton accountButton1;
    private javax.swing.JButton groupsButton;
    private javax.swing.JButton logoutButton;
    private gui.PanelGradient panelGradient1;
    private javax.swing.JButton schedulesButton;                  
}
