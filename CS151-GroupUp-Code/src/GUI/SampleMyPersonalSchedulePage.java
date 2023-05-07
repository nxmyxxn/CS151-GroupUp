package GUI;

import java.awt.Color; 
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.JTableHeader;

import GroupUp.MysqlConn;
import GroupUp.Schedule;
import GroupUp.User;

public class SampleMyPersonalSchedulePage extends javax.swing.JFrame {

    /**
     * Creates new form SampleMySchedulePage
     */
    public SampleMyPersonalSchedulePage() {
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
        saveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myScheduleJTable = new javax.swing.JTable();
        deleteScheduleButton = new javax.swing.JButton();
        arrayForDisplayingMyPersonalScheduleTable = new Object [][] {
            {"12 AM", Schedule.focusSchedule.getDayTimeBool(0, 0), Schedule.focusSchedule.getDayTimeBool(1, 0), Schedule.focusSchedule.getDayTimeBool(2, 0), Schedule.focusSchedule.getDayTimeBool(3, 0), Schedule.focusSchedule.getDayTimeBool(4, 0), Schedule.focusSchedule.getDayTimeBool(5, 0), Schedule.focusSchedule.getDayTimeBool(6, 0)},
            {"1 AM", Schedule.focusSchedule.getDayTimeBool(0, 1), Schedule.focusSchedule.getDayTimeBool(1, 1), Schedule.focusSchedule.getDayTimeBool(2, 1), Schedule.focusSchedule.getDayTimeBool(3, 1), Schedule.focusSchedule.getDayTimeBool(4, 1), Schedule.focusSchedule.getDayTimeBool(5, 1), Schedule.focusSchedule.getDayTimeBool(6, 1)},
            {"2 AM", Schedule.focusSchedule.getDayTimeBool(0, 2), Schedule.focusSchedule.getDayTimeBool(1, 2), Schedule.focusSchedule.getDayTimeBool(2, 2), Schedule.focusSchedule.getDayTimeBool(3, 2), Schedule.focusSchedule.getDayTimeBool(4, 2), Schedule.focusSchedule.getDayTimeBool(5, 2), Schedule.focusSchedule.getDayTimeBool(6, 2)},
            {"3 AM", Schedule.focusSchedule.getDayTimeBool(0, 3), Schedule.focusSchedule.getDayTimeBool(1, 3), Schedule.focusSchedule.getDayTimeBool(2, 3), Schedule.focusSchedule.getDayTimeBool(3, 3), Schedule.focusSchedule.getDayTimeBool(4, 3), Schedule.focusSchedule.getDayTimeBool(5, 3), Schedule.focusSchedule.getDayTimeBool(6, 3)},
            {"4 AM", Schedule.focusSchedule.getDayTimeBool(0, 4), Schedule.focusSchedule.getDayTimeBool(1, 4), Schedule.focusSchedule.getDayTimeBool(2, 4), Schedule.focusSchedule.getDayTimeBool(3, 4), Schedule.focusSchedule.getDayTimeBool(4, 4), Schedule.focusSchedule.getDayTimeBool(5, 4), Schedule.focusSchedule.getDayTimeBool(6, 4)},
            {"5 AM", Schedule.focusSchedule.getDayTimeBool(0, 5), Schedule.focusSchedule.getDayTimeBool(1, 5), Schedule.focusSchedule.getDayTimeBool(2, 5), Schedule.focusSchedule.getDayTimeBool(3, 5), Schedule.focusSchedule.getDayTimeBool(4, 5), Schedule.focusSchedule.getDayTimeBool(5, 5), Schedule.focusSchedule.getDayTimeBool(6, 5)},
            {"6 AM", Schedule.focusSchedule.getDayTimeBool(0, 6), Schedule.focusSchedule.getDayTimeBool(1, 6), Schedule.focusSchedule.getDayTimeBool(2, 6), Schedule.focusSchedule.getDayTimeBool(3, 6), Schedule.focusSchedule.getDayTimeBool(4, 6), Schedule.focusSchedule.getDayTimeBool(5, 6), Schedule.focusSchedule.getDayTimeBool(6, 6)},
            {"7 AM", Schedule.focusSchedule.getDayTimeBool(0, 7), Schedule.focusSchedule.getDayTimeBool(1, 7), Schedule.focusSchedule.getDayTimeBool(2, 7), Schedule.focusSchedule.getDayTimeBool(3, 7), Schedule.focusSchedule.getDayTimeBool(4, 7), Schedule.focusSchedule.getDayTimeBool(5, 7), Schedule.focusSchedule.getDayTimeBool(6, 7)},
            {"8 AM", Schedule.focusSchedule.getDayTimeBool(0, 8), Schedule.focusSchedule.getDayTimeBool(1, 8), Schedule.focusSchedule.getDayTimeBool(2, 8), Schedule.focusSchedule.getDayTimeBool(3, 8), Schedule.focusSchedule.getDayTimeBool(4, 8), Schedule.focusSchedule.getDayTimeBool(5, 8), Schedule.focusSchedule.getDayTimeBool(6, 8)},
            {"9 AM", Schedule.focusSchedule.getDayTimeBool(0, 9), Schedule.focusSchedule.getDayTimeBool(1, 9), Schedule.focusSchedule.getDayTimeBool(2, 9), Schedule.focusSchedule.getDayTimeBool(3, 9), Schedule.focusSchedule.getDayTimeBool(4, 9), Schedule.focusSchedule.getDayTimeBool(5, 9), Schedule.focusSchedule.getDayTimeBool(6, 9)},
            {"10 AM", Schedule.focusSchedule.getDayTimeBool(0, 10), Schedule.focusSchedule.getDayTimeBool(1, 10), Schedule.focusSchedule.getDayTimeBool(2, 10), Schedule.focusSchedule.getDayTimeBool(3, 10), Schedule.focusSchedule.getDayTimeBool(4, 10), Schedule.focusSchedule.getDayTimeBool(5, 10), Schedule.focusSchedule.getDayTimeBool(6, 10)},
            {"11 AM", Schedule.focusSchedule.getDayTimeBool(0, 11), Schedule.focusSchedule.getDayTimeBool(1, 11), Schedule.focusSchedule.getDayTimeBool(2, 11), Schedule.focusSchedule.getDayTimeBool(3, 11), Schedule.focusSchedule.getDayTimeBool(4, 11), Schedule.focusSchedule.getDayTimeBool(5, 11), Schedule.focusSchedule.getDayTimeBool(6, 11)},
            {"12 PM", Schedule.focusSchedule.getDayTimeBool(0, 12), Schedule.focusSchedule.getDayTimeBool(1, 12), Schedule.focusSchedule.getDayTimeBool(2, 12), Schedule.focusSchedule.getDayTimeBool(3, 12), Schedule.focusSchedule.getDayTimeBool(4, 12), Schedule.focusSchedule.getDayTimeBool(5, 12), Schedule.focusSchedule.getDayTimeBool(6, 12)},
            {"1 PM", Schedule.focusSchedule.getDayTimeBool(0, 13), Schedule.focusSchedule.getDayTimeBool(1, 13), Schedule.focusSchedule.getDayTimeBool(2, 13), Schedule.focusSchedule.getDayTimeBool(3, 13), Schedule.focusSchedule.getDayTimeBool(4, 13), Schedule.focusSchedule.getDayTimeBool(5, 13), Schedule.focusSchedule.getDayTimeBool(6, 13)},
            {"2 PM", Schedule.focusSchedule.getDayTimeBool(0, 14), Schedule.focusSchedule.getDayTimeBool(1, 14), Schedule.focusSchedule.getDayTimeBool(2, 14), Schedule.focusSchedule.getDayTimeBool(3, 14), Schedule.focusSchedule.getDayTimeBool(4, 14), Schedule.focusSchedule.getDayTimeBool(5, 14), Schedule.focusSchedule.getDayTimeBool(6, 14)},
            {"3 PM", Schedule.focusSchedule.getDayTimeBool(0, 15), Schedule.focusSchedule.getDayTimeBool(1, 15), Schedule.focusSchedule.getDayTimeBool(2, 15), Schedule.focusSchedule.getDayTimeBool(3, 15), Schedule.focusSchedule.getDayTimeBool(4, 15), Schedule.focusSchedule.getDayTimeBool(5, 15), Schedule.focusSchedule.getDayTimeBool(6, 15)},
            {"4 PM", Schedule.focusSchedule.getDayTimeBool(0, 16), Schedule.focusSchedule.getDayTimeBool(1, 16), Schedule.focusSchedule.getDayTimeBool(2, 16), Schedule.focusSchedule.getDayTimeBool(3, 16), Schedule.focusSchedule.getDayTimeBool(4, 16), Schedule.focusSchedule.getDayTimeBool(5, 16), Schedule.focusSchedule.getDayTimeBool(6, 16)},
            {"5 PM", Schedule.focusSchedule.getDayTimeBool(0, 17), Schedule.focusSchedule.getDayTimeBool(1, 17), Schedule.focusSchedule.getDayTimeBool(2, 17), Schedule.focusSchedule.getDayTimeBool(3, 17), Schedule.focusSchedule.getDayTimeBool(4, 17), Schedule.focusSchedule.getDayTimeBool(5, 17), Schedule.focusSchedule.getDayTimeBool(6, 17)},
            {"6 PM", Schedule.focusSchedule.getDayTimeBool(0, 18), Schedule.focusSchedule.getDayTimeBool(1, 18), Schedule.focusSchedule.getDayTimeBool(2, 18), Schedule.focusSchedule.getDayTimeBool(3, 18), Schedule.focusSchedule.getDayTimeBool(4, 18), Schedule.focusSchedule.getDayTimeBool(5, 18), Schedule.focusSchedule.getDayTimeBool(6, 18)},
            {"7 PM", Schedule.focusSchedule.getDayTimeBool(0, 19), Schedule.focusSchedule.getDayTimeBool(1, 19), Schedule.focusSchedule.getDayTimeBool(2, 19), Schedule.focusSchedule.getDayTimeBool(3, 19), Schedule.focusSchedule.getDayTimeBool(4, 19), Schedule.focusSchedule.getDayTimeBool(5, 19), Schedule.focusSchedule.getDayTimeBool(6, 19)},
            {"8 PM", Schedule.focusSchedule.getDayTimeBool(0, 20), Schedule.focusSchedule.getDayTimeBool(1, 20), Schedule.focusSchedule.getDayTimeBool(2, 20), Schedule.focusSchedule.getDayTimeBool(3, 20), Schedule.focusSchedule.getDayTimeBool(4, 20), Schedule.focusSchedule.getDayTimeBool(5, 20), Schedule.focusSchedule.getDayTimeBool(6, 20)},
            {"9 PM", Schedule.focusSchedule.getDayTimeBool(0, 21), Schedule.focusSchedule.getDayTimeBool(1, 21), Schedule.focusSchedule.getDayTimeBool(2, 21), Schedule.focusSchedule.getDayTimeBool(3, 21), Schedule.focusSchedule.getDayTimeBool(4, 21), Schedule.focusSchedule.getDayTimeBool(5, 21), Schedule.focusSchedule.getDayTimeBool(6, 21)},
            {"10 PM", Schedule.focusSchedule.getDayTimeBool(0, 22), Schedule.focusSchedule.getDayTimeBool(1, 22), Schedule.focusSchedule.getDayTimeBool(2, 22), Schedule.focusSchedule.getDayTimeBool(3, 22), Schedule.focusSchedule.getDayTimeBool(4, 22), Schedule.focusSchedule.getDayTimeBool(5, 22), Schedule.focusSchedule.getDayTimeBool(6, 22)},
            {"11 PM", Schedule.focusSchedule.getDayTimeBool(0, 23), Schedule.focusSchedule.getDayTimeBool(1, 23), Schedule.focusSchedule.getDayTimeBool(2, 23), Schedule.focusSchedule.getDayTimeBool(3, 23), Schedule.focusSchedule.getDayTimeBool(4, 23), Schedule.focusSchedule.getDayTimeBool(5, 23), Schedule.focusSchedule.getDayTimeBool(6, 23)}
        };
        
        arrayForMyPersonalScheduleTableColumnTitles = new String [] {
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
        GroupICreatedPageTitle.setText(Schedule.focusSchedule.getScheduleName());
        panelGradient1.add(GroupICreatedPageTitle);
        GroupICreatedPageTitle.setBounds(300, 30, 800, 100);

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

        myScheduleJTable.setFont(new java.awt.Font("Canela", 1, 17)); // NOI18N
        JTableHeader tableHeader = myScheduleJTable.getTableHeader();
        Font headerFont = new Font("Canela", 1, 17);
        tableHeader.setFont(headerFont);
        myScheduleJTable.setFont(new java.awt.Font("Canela", 1, 17));
        myScheduleJTable.setModel(new javax.swing.table.DefaultTableModel(
        		arrayForDisplayingMyPersonalScheduleTable, arrayForMyPersonalScheduleTableColumnTitles) 
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
        myScheduleJTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        myScheduleJTable.setRowHeight(40);
        myScheduleJTable.setSelectionBackground(new java.awt.Color(0, 204, 204));
        myScheduleJTable.setShowGrid(true);
        myScheduleJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(myScheduleJTable);

        panelGradient1.add(jScrollPane1);
        jScrollPane1.setBounds(300, 150, 1080, 540);
        
        deleteScheduleButton.setBackground(new java.awt.Color(13, 165, 165));
        deleteScheduleButton.setFont(new java.awt.Font("Canela", 1, 36)); // NOI18N
        deleteScheduleButton.setText("Delete Schedule");
        deleteScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteScheduleButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(deleteScheduleButton);
        deleteScheduleButton.setBounds(1100, 20, 320, 70);

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

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (evt.getSource() == saveButton)
        {
        	Schedule tempPersonal = new Schedule();
        	Integer[][] personalValues = new Integer[7][24];
            numOfTimesPressed++;
            System.out.println(numOfTimesPressed + " Time Pressed");
            for (int i = 0; myScheduleJTable.getRowCount() > i; i++) {
                for (int j = 1; myScheduleJTable.getColumnCount() > j; j++)
                {
                    Boolean col = (Boolean) myScheduleJTable.getValueAt(i, j);
                    System.out.println("Row " + i + ":  Col " + j + ": " + col);
                    if (col)
                    	personalValues[j - 1][i] = 1;
                    else
                    	personalValues[j - 1][i] = 0;
                }

            }
            tempPersonal.setDaysTimes(personalValues);
            MysqlConn.updatePersonalSchedule(tempPersonal);
            System.out.println();
        }
    }                                          

    private void deleteScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        JLabel cancelMessage = new JLabel("Are you sure you want to delete your schedule?", SwingConstants.CENTER);
        cancelMessage.setFont(new Font("Canela", 1, 20));
        cancelMessage.setOpaque(true);

        //source: https://stackoverflow.com/questions/11204878/joptionpane-showconfirmdialog-with-only-one-button
        int value = JOptionPane.showConfirmDialog(null,
            cancelMessage,
            null,
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);

        //if yes option is selected, the schedule will be discarded
        if (value == JOptionPane.YES_OPTION) {
            //personal schedule should be deleted from database
        	Schedule tempPersonal = new Schedule();
        	String theScheduleName = tempPersonal.getScheduleName();
        	String theUsername = User.getInstance().getUsername();
        	try {
				MysqlConn.deleteSchedule(theScheduleName, theUsername);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
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
            java.util.logging.Logger.getLogger(SampleMyPersonalSchedulePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SampleMyPersonalSchedulePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SampleMyPersonalSchedulePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SampleMyPersonalSchedulePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SampleMyPersonalSchedulePage().setVisible(true);
            }
        });
    }
               
    private javax.swing.JLabel GroupICreatedPageTitle;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JButton deleteScheduleButton;
    private javax.swing.JLabel groupsLabel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JTable myScheduleJTable;
    private GUI.PanelGradient panelGradient1;
    private GUI.PanelGradient panelGradientForNavigationPanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel schedulesLabel;
    private Object[][] arrayForDisplayingMyPersonalScheduleTable;
    private String[] arrayForMyPersonalScheduleTableColumnTitles;
             
    private int numOfTimesPressed = 0;
}
