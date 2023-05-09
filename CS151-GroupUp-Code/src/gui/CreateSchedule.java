
package gui;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.JTableHeader;

import exceptions.NoDuplicateScheduleNamesException;
import exceptions.RequireScheduleNameException;
import groupup.MysqlConn;
import groupup.Schedule;
import groupup.User;

public class CreateSchedule extends javax.swing.JFrame {
    
	/** Creates new form CreateSchedule */
    public CreateSchedule() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        panelGradient1 = new gui.PanelGradient();
        panelGradientForNavigationPanel = new gui.PanelGradient();
        homeLabel = new javax.swing.JLabel();
        groupsLabel = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        schedulesLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        createYourScheduleJTable = new javax.swing.JTable();
        scheduleNameLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        createYourScheduleTitleLabel = new javax.swing.JLabel();
        scheduleNameTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        arrayForDisplayingScheduleTable = new Object [][] {
            {"12 AM", false, false, false, false, false, false, false},
            {"1 AM", false, false, false, false, false, false, false},
            {"2 AM", false, false, false, false, false, false, false},
            {"3 AM", false, false, false, false, false, false, false},
            {"4 AM", false, false, false, false, false, false, false},
            {"5 AM", false, false, false, false, false, false, false},
            {"6 AM", false, false, false, false, false, false, false},
            {"7 AM", false, false, false, false, false, false, false},
            {"8 AM", false, false, false, false, false, false, false},
            {"9 AM", false, false, false, false, false, false, false},
            {"10 AM", false, false, false, false, false, false, false},
            {"11 AM", false, false, false, false, false, false, false},
            {"12 PM", false, false, false, false, false, false, false},
            {"1 PM", false, false, false, false, false, false, false},
            {"2 PM", false, false, false, false, false, false, false},
            {"3 PM", false, false, false, false, false, false, false},
            {"4 PM", false, false, false, false, false, false, false},
            {"5 PM", false, false, false, false, false, false, false},
            {"6 PM", false, false, false, false, false, false, false},
            {"7 PM", false, false, false, false, false, false, false},
            {"8 PM", false, false, false, false, false, false, false},
            {"9 PM", false, false, false, false, false, false, false},
            {"10 PM", false, false, false, false, false, false, false},
            {"11 PM", false, false, false, false, false, false, false}
        };
        
        arrayForScheduleTableColumnTitles = new String [] {
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
        createYourScheduleJTable.setFont(new java.awt.Font("Canela", 1, 17)); // NOI18N
        JTableHeader tableHeader = createYourScheduleJTable.getTableHeader();
        Font headerFont = new Font("Canela", 1, 17);
        tableHeader.setFont(headerFont);
        createYourScheduleJTable.setFont(new java.awt.Font("Canela", 1, 17));
        
        createYourScheduleJTable.setModel(new javax.swing.table.DefaultTableModel(
        		arrayForDisplayingScheduleTable, arrayForScheduleTableColumnTitles) 
        {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        createYourScheduleJTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        createYourScheduleJTable.setRowHeight(40);
        createYourScheduleJTable.setSelectionBackground(new java.awt.Color(0, 204, 204));
        createYourScheduleJTable.setShowGrid(true);
        createYourScheduleJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(createYourScheduleJTable);
        panelGradient1.add(jScrollPane1);
        jScrollPane1.setBounds(300, 230, 1060, 460);
        scheduleNameLabel.setFont(new java.awt.Font("Canela", 1, 40)); // NOI18N
        scheduleNameLabel.setText("Schedule Name:");
        panelGradient1.add(scheduleNameLabel);
        scheduleNameLabel.setBounds(300, 150, 310, 60);
        saveButton.setBackground(new java.awt.Color(13, 165, 165));
        saveButton.setFont(new java.awt.Font("Canela", 0, 40)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(saveButton);
        saveButton.setBounds(760, 710, 130, 70);
        createYourScheduleTitleLabel.setFont(new java.awt.Font("Canela", 1, 70)); // NOI18N
        createYourScheduleTitleLabel.setText("Create Your Schedule");
        panelGradient1.add(createYourScheduleTitleLabel);
        createYourScheduleTitleLabel.setBounds(490, 50, 740, 70);
        scheduleNameTextField.setFont(new java.awt.Font("Canela", 0, 18)); // NOI18N
        scheduleNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleNameTextFieldActionPerformed(evt);
            }
        });
        panelGradient1.add(scheduleNameTextField);
        scheduleNameTextField.setBounds(600, 160, 270, 50);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        
        cancelButton.setBackground(new java.awt.Color(13, 165, 165));
        cancelButton.setFont(new java.awt.Font("Canela", 1, 36)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(cancelButton);
        cancelButton.setBounds(1270, 20, 150, 70);
        
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
    	InitialWelcomePage.main(null);
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
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	if (evt.getSource() == saveButton)
        {
    		try
    		{
    			if (scheduleNameTextField.getText().isEmpty())
    				throw new RequireScheduleNameException();
    			ArrayList<Schedule> allPersonalSchedules = new ArrayList<>();
    			allPersonalSchedules.addAll(MysqlConn.getPersonalSchedules());
    	        for (int i = 0; i < allPersonalSchedules.size(); i++)
    	        {
    	        	if (scheduleNameTextField.getText().equals(allPersonalSchedules.get(i).getScheduleName()))
    	        		throw new NoDuplicateScheduleNamesException();
    	        }
    		}
    		catch (RequireScheduleNameException | NoDuplicateScheduleNamesException e)
    		{
    			ErrorPopup.makePopup(e.getMessage());
    			return;
    		}
    		
        	Schedule.focusSchedule = MysqlConn.initializePersonalSchedule(scheduleNameTextField.getText());
        	
        	Integer[][] personalValues = new Integer[7][24];
            numOfTimesPressed++;
            
            for (int i = 0; createYourScheduleJTable.getRowCount() > i; i++) {
                for (int j = 1; createYourScheduleJTable.getColumnCount() > j; j++)
                {
                    Boolean col = (Boolean) createYourScheduleJTable.getValueAt(i, j);
                    
                    if (col)
                    	personalValues[j - 1][i] = 1;
                    else
                    	personalValues[j - 1][i] = 0;
                }

            }
            Schedule.focusSchedule.setDaysTimes(personalValues);
            MysqlConn.updatePersonalSchedule(Schedule.focusSchedule);
            
            this.dispose();
            SampleMyPersonalSchedulePage.main(null);
       }
    }                                          
    private void scheduleNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }  
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        JLabel cancelMessage = new JLabel("Are you sure you want to cancel?", SwingConstants.CENTER);
        cancelMessage.setFont(new Font("Canela", 1, 30));
        cancelMessage.setOpaque(true);
        
        //source: https://stackoverflow.com/questions/11204878/joptionpane-showconfirmdialog-with-only-one-button
         int value = JOptionPane.showConfirmDialog(null,
                cancelMessage,
                null, 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
         
         //if yes option is selected, the new schedule will be discarded
         if (value == JOptionPane.YES_OPTION) {
            this.dispose();
            SchedulesPage.main(null);
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateSchedule().setVisible(true);
            }
        });
    }
                   
    private javax.swing.JLabel accountLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTable createYourScheduleJTable;
    private javax.swing.JLabel createYourScheduleTitleLabel;
    private javax.swing.JLabel groupsLabel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private gui.PanelGradient panelGradient1;
    private gui.PanelGradient panelGradientForNavigationPanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel scheduleNameLabel;
    private javax.swing.JTextField scheduleNameTextField;
    private javax.swing.JLabel schedulesLabel;
    private Object[][] arrayForDisplayingScheduleTable;
    private String[] arrayForScheduleTableColumnTitles;
                  
    private int numOfTimesPressed = 0;
}
