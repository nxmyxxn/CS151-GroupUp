package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.JTableHeader;

import GroupUp.User;

public class SampleGroupICreatedPage extends javax.swing.JFrame {

    /**
     * Creates new form SampleGroupICreatedPage
     */
    public SampleGroupICreatedPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelGradient1 = new GUI.PanelGradient();
        panelGradientForNavigationPanel = new GUI.PanelGradient();
        homeLabel = new javax.swing.JLabel();
        groupsLabel = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        schedulesLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        GroupICreatedPageTitle = new javax.swing.JLabel();
        GroupICreatedPageTitle1 = new javax.swing.JLabel();
        deleteUserLabel = new javax.swing.JLabel();
        deleteUserTextField = new javax.swing.JTextField();
        addUserScheduleLabel = new javax.swing.JLabel();
        addUserScheduleTextField = new javax.swing.JTextField();
        deleteUserButton = new javax.swing.JButton();
        addUserButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scheduleForGroupICreatedJTable = new javax.swing.JTable();
        addUserLabel = new javax.swing.JLabel();
        addUserTextField = new javax.swing.JTextField();
        deleteGroupButton = new javax.swing.JButton();
        arrayForDisplayingGroupScheduleTable = new Object [][] {
            {"12 AM", null, null, null, null, null, null, null},
            {"1 AM", null, null, null, null, null, null, null},
            {"2 AM", null, null, null, null, null, null, null},
            {"3 AM", null, null, null, null, null, null, null},
            {"4 AM", null, null, null, null, null, null, null},
            {"5 AM", null, null, null, null, null, null, null},
            {"6 AM", null, null, null, null, null, null, null},
            {"7 AM", null, null, null, null, null, null, null},
            {"8 AM", null, null, null, null, null, null, null},
            {"9 AM", null, null, null, null, null, null, null},
            {"10 AM", null, null, null, null, null, null, null},
            {"11 AM", null, null, null, null, null, null, null},
            {"12 PM", null, null, null, null, null, null, null},
            {"1 PM", null, null, null, null, null, null, null},
            {"2 PM", null, null, null, null, null, null, null},
            {"3 PM", null, null, null, null, null, null, null},
            {"4 PM", null, null, null, null, null, null, null},
            {"5 PM", null, null, null, null, null, null, null},
            {"6 PM", null, null, null, null, null, null, null},
            {"7 PM", null, null, null, null, null, null, null},
            {"8 PM", null, null, null, null, null, null, null},
            {"9 PM", null, null, null, null, null, null, null},
            {"10 PM", null, null, null, null, null, null, null},
            {"11 PM", null, null, null, null, null, null, null}
        };
        
        arrayForGroupScheduleTableColumnTitles = new String [] {
                "", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
            };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGradient1.setColorPrimario(new java.awt.Color(159, 234, 234));
        panelGradient1.setColorSecundario(new java.awt.Color(13, 165, 165));

        panelGradientForNavigationPanel.setColorPrimario(new java.awt.Color(159, 204, 229));
        panelGradientForNavigationPanel.setColorSecundario(new java.awt.Color(13, 145, 171));

        homeLabel.setFont(new java.awt.Font("Canela", 1, 30)); // NOI18N
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setText("Home");
        homeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
        });

        groupsLabel.setFont(new java.awt.Font("Canela", 1, 30)); // NOI18N
        groupsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        groupsLabel.setText("Groups");
        groupsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        groupsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                groupsLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                groupsLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                groupsLabelMouseEntered(evt);
            }
        });

        accountLabel.setFont(new java.awt.Font("Canela", 1, 30)); // NOI18N
        accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountLabel.setText("Account");
        accountLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        accountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountLabelMouseEntered(evt);
            }
        });

        schedulesLabel.setFont(new java.awt.Font("Canela", 1, 30)); // NOI18N
        schedulesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schedulesLabel.setText("Schedules");
        schedulesLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        schedulesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schedulesLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                schedulesLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                schedulesLabelMouseEntered(evt);
            }
        });

        logoutLabel.setFont(new java.awt.Font("Canela", 1, 30)); // NOI18N
        logoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutLabel.setText("Logout");
        logoutLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutLabelMouseEntered(evt);
            }
        });

        panelGradientForNavigationPanel.setLayer(homeLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradientForNavigationPanel.setLayer(groupsLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradientForNavigationPanel.setLayer(accountLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradientForNavigationPanel.setLayer(schedulesLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradientForNavigationPanel.setLayer(logoutLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradientForNavigationPanelLayout = new javax.swing.GroupLayout(panelGradientForNavigationPanel);
        panelGradientForNavigationPanel.setLayout(panelGradientForNavigationPanelLayout);
        panelGradientForNavigationPanelLayout.setHorizontalGroup(
            panelGradientForNavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(schedulesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(groupsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelGradientForNavigationPanelLayout.setVerticalGroup(
            panelGradientForNavigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradientForNavigationPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(schedulesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelGradient1.add(panelGradientForNavigationPanel);
        panelGradientForNavigationPanel.setBounds(0, 0, 250, 830);

        GroupICreatedPageTitle.setFont(new java.awt.Font("Canela", 1, 70)); // NOI18N
        GroupICreatedPageTitle.setText("Group Name");
        panelGradient1.add(GroupICreatedPageTitle);
        GroupICreatedPageTitle.setBounds(290, 30, 800, 100);

        GroupICreatedPageTitle1.setFont(new java.awt.Font("Canela", 1, 70)); // NOI18N
        GroupICreatedPageTitle1.setText("Group Name");
        panelGradient1.add(GroupICreatedPageTitle1);
        GroupICreatedPageTitle1.setBounds(290, 30, 800, 100);

        deleteUserLabel.setFont(new java.awt.Font("Canela", 1, 40)); // NOI18N
        deleteUserLabel.setText("Delete user:");
        panelGradient1.add(deleteUserLabel);
        deleteUserLabel.setBounds(470, 290, 230, 60);

        deleteUserTextField.setFont(new java.awt.Font("Canela", 0, 18)); // NOI18N
        deleteUserTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserTextFieldActionPerformed(evt);
            }
        });
        panelGradient1.add(deleteUserTextField);
        deleteUserTextField.setBounds(700, 300, 270, 50);

        addUserScheduleLabel.setFont(new java.awt.Font("Canela", 1, 40)); // NOI18N
        addUserScheduleLabel.setText("Add user's schedule:");
        panelGradient1.add(addUserScheduleLabel);
        addUserScheduleLabel.setBounds(320, 220, 380, 60);

        addUserScheduleTextField.setFont(new java.awt.Font("Canela", 0, 18)); // NOI18N
        addUserScheduleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserScheduleTextFieldActionPerformed(evt);
            }
        });
        panelGradient1.add(addUserScheduleTextField);
        addUserScheduleTextField.setBounds(700, 230, 270, 50);

        deleteUserButton.setBackground(new java.awt.Color(13, 165, 165));
        deleteUserButton.setFont(new java.awt.Font("Canela", 1, 24)); // NOI18N
        deleteUserButton.setText("Delete");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(deleteUserButton);
        deleteUserButton.setBounds(1000, 300, 110, 50);

        addUserButton.setBackground(new java.awt.Color(13, 165, 165));
        addUserButton.setFont(new java.awt.Font("Canela", 1, 24)); // NOI18N
        addUserButton.setText("Add");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(addUserButton);
        addUserButton.setBounds(1000, 200, 110, 50);

        scheduleForGroupICreatedJTable.setFont(new java.awt.Font("Canela", 1, 17)); // NOI18N
        JTableHeader tableHeader = scheduleForGroupICreatedJTable.getTableHeader();
        Font headerFont = new Font("Canela", 1, 17);
        tableHeader.setFont(headerFont);
        scheduleForGroupICreatedJTable.setFont(new java.awt.Font("Canela", 1, 17));
        scheduleForGroupICreatedJTable.setModel(new javax.swing.table.DefaultTableModel(
        		arrayForDisplayingGroupScheduleTable, arrayForGroupScheduleTableColumnTitles
            
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scheduleForGroupICreatedJTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scheduleForGroupICreatedJTable.setRowHeight(40);
        scheduleForGroupICreatedJTable.setSelectionBackground(new java.awt.Color(0, 204, 204));
        scheduleForGroupICreatedJTable.setShowGrid(true);
        scheduleForGroupICreatedJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(scheduleForGroupICreatedJTable);

        panelGradient1.add(jScrollPane1);
        jScrollPane1.setBounds(300, 400, 1090, 370);

        addUserLabel.setFont(new java.awt.Font("Canela", 1, 40)); // NOI18N
        addUserLabel.setText("Add user:");
        panelGradient1.add(addUserLabel);
        addUserLabel.setBounds(510, 150, 190, 60);

        addUserTextField.setFont(new java.awt.Font("Canela", 0, 18)); // NOI18N
        addUserTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserTextFieldActionPerformed(evt);
            }
        });
        panelGradient1.add(addUserTextField);
        addUserTextField.setBounds(700, 160, 270, 50);
        
        deleteGroupButton.setBackground(new java.awt.Color(13, 165, 165));
        deleteGroupButton.setFont(new java.awt.Font("Canela", 1, 36)); // NOI18N
        deleteGroupButton.setText("Delete Group");
        deleteGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGroupButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(deleteGroupButton);
        deleteGroupButton.setBounds(1100, 20, 320, 70);

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

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {                                       
    	this.dispose();
    	HomePage.main(null);
    }                                      

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {                                      
        homeLabel = (JLabel) evt.getComponent();
        homeLabel.setOpaque(false);
        homeLabel.setForeground( new Color(0, 0, 0) );
        homeLabel.setBorder(BorderFactory.createEmptyBorder());
    }                                     

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {                                       
        //mouse hovering feature source: https://gist.github.com/TabsPH/4057899
        homeLabel = (JLabel) evt.getComponent();
        homeLabel.setOpaque(true);
        homeLabel.setBackground(new Color(220,232,238));

        //creating border source: https://docs.oracle.com/javase/tutorial/uiswing/components/border.html
        homeLabel.setBorder(BorderFactory.createLineBorder(new Color(220,232,238)));
    }                                      

    private void groupsLabelMouseClicked(java.awt.event.MouseEvent evt) {                                         
    	this.dispose();
    	GroupsPage.main(null);
    }                                        

    private void groupsLabelMouseExited(java.awt.event.MouseEvent evt) {                                        
        groupsLabel = (JLabel) evt.getComponent();
        groupsLabel.setOpaque(false);
        groupsLabel.setForeground( new Color(0, 0, 0) );
        groupsLabel.setBorder(BorderFactory.createEmptyBorder());
    }                                       

    private void groupsLabelMouseEntered(java.awt.event.MouseEvent evt) {                                         
        //mouse hovering feature source: https://gist.github.com/TabsPH/4057899
        groupsLabel = (JLabel) evt.getComponent();
        groupsLabel.setOpaque(true);
        groupsLabel.setBackground(new Color(220,232,238));

        //creating border source: https://docs.oracle.com/javase/tutorial/uiswing/components/border.html
        groupsLabel.setBorder(BorderFactory.createLineBorder(new Color(220,232,238)));
    }                                        

    private void accountLabelMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	this.dispose();
    	AccountPage.main(null);
    }                                         

    private void accountLabelMouseExited(java.awt.event.MouseEvent evt) {                                         
        accountLabel = (JLabel) evt.getComponent();
        accountLabel.setOpaque(false);
        accountLabel.setForeground( new Color(0, 0, 0) );
        accountLabel.setBorder(BorderFactory.createEmptyBorder());
    }                                        

    private void accountLabelMouseEntered(java.awt.event.MouseEvent evt) {                                          
        //mouse hovering feature source: https://gist.github.com/TabsPH/4057899
        accountLabel = (JLabel) evt.getComponent();
        accountLabel.setOpaque(true);
        accountLabel.setBackground(new Color(220,232,238));

        //creating border source: https://docs.oracle.com/javase/tutorial/uiswing/components/border.html
        accountLabel.setBorder(BorderFactory.createLineBorder(new Color(220,232,238)));
    }                                         

    private void schedulesLabelMouseClicked(java.awt.event.MouseEvent evt) {                                            
    	this.dispose();
    	SchedulesPage.main(null);
    }                                           

    private void schedulesLabelMouseExited(java.awt.event.MouseEvent evt) {                                           
        schedulesLabel = (JLabel) evt.getComponent();
        schedulesLabel.setOpaque(false);
        schedulesLabel.setForeground( new Color(0, 0, 0) );
        schedulesLabel.setBorder(BorderFactory.createEmptyBorder());
    }                                          

    private void schedulesLabelMouseEntered(java.awt.event.MouseEvent evt) {                                            
        //mouse hovering feature source: https://gist.github.com/TabsPH/4057899
        schedulesLabel = (JLabel) evt.getComponent();
        schedulesLabel.setOpaque(true);
        schedulesLabel.setBackground(new Color(220,232,238));

        //creating border source: https://docs.oracle.com/javase/tutorial/uiswing/components/border.html
        schedulesLabel.setBorder(BorderFactory.createLineBorder(new Color(220,232,238)));
    }                                           

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {                                    
    	this.dispose();
    	User.nullifyInstance();
    	InitialWelcomePage.main(null);			//go back to welcome page on logout and set User instance to null.
    }                                        

    private void logoutLabelMouseExited(java.awt.event.MouseEvent evt) {                                        
        logoutLabel = (JLabel) evt.getComponent();
        logoutLabel.setOpaque(false);
        logoutLabel.setForeground( new Color(0, 0, 0) );
        logoutLabel.setBorder(BorderFactory.createEmptyBorder());
    }                                       

    private void logoutLabelMouseEntered(java.awt.event.MouseEvent evt) {                                         
        //mouse hovering feature source: https://gist.github.com/TabsPH/4057899
        logoutLabel = (JLabel) evt.getComponent();
        logoutLabel.setOpaque(true);
        logoutLabel.setBackground(new Color(220,232,238));

        //creating border source: https://docs.oracle.com/javase/tutorial/uiswing/components/border.html
        logoutLabel.setBorder(BorderFactory.createLineBorder(new Color(220,232,238)));
    }                                        

    private void deleteUserTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void addUserScheduleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    	System.out.println("yo");
    }                                             

    private void addUserTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void deleteGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        JLabel cancelMessage = new JLabel("Are you sure you want to delete this group and its schedule?", SwingConstants.CENTER);
        cancelMessage.setFont(new Font("Canela", 1, 20));
        cancelMessage.setOpaque(true);

        //source: https://stackoverflow.com/questions/11204878/joptionpane-showconfirmdialog-with-only-one-button
        int value = JOptionPane.showConfirmDialog(null,
            cancelMessage,
            null,
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);

        //if yes option is selected, the group will be discarded
        if (value == JOptionPane.YES_OPTION) {
            //group schedule should be deleted from database
            
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
            java.util.logging.Logger.getLogger(SampleGroupICreatedPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SampleGroupICreatedPage().setVisible(true);
            }
        });
    }
                 
    private javax.swing.JLabel GroupICreatedPageTitle;
    private javax.swing.JLabel GroupICreatedPageTitle1;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JButton addUserButton;
    private javax.swing.JLabel addUserLabel;
    private javax.swing.JLabel addUserScheduleLabel;
    private javax.swing.JTextField addUserScheduleTextField;
    private javax.swing.JTextField addUserTextField;
    private javax.swing.JButton deleteGroupButton;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JLabel deleteUserLabel;
    private javax.swing.JTextField deleteUserTextField;
    private javax.swing.JLabel groupsLabel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private GUI.PanelGradient panelGradient1;
    private GUI.PanelGradient panelGradientForNavigationPanel;
    private javax.swing.JTable scheduleForGroupICreatedJTable;
    private javax.swing.JLabel schedulesLabel;
    private Object[][] arrayForDisplayingGroupScheduleTable;
    private String[] arrayForGroupScheduleTableColumnTitles;                  
}
