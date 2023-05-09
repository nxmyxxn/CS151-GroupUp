
package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

import groupup.MysqlConn;
import groupup.Schedule;
import groupup.User;


public class GroupsPage extends javax.swing.JFrame {

	
	public ArrayList<Schedule> allCreatedGroups = new ArrayList<>();
	public ArrayList<Schedule> allJoinedGroups = new ArrayList<>();
    /**
     * Creates new form GroupsPage
     */
    public GroupsPage() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelGradient1 = new gui.PanelGradient();
        navigationPanel = new javax.swing.JPanel();
        panelGradientForNavigationPanel = new gui.PanelGradient();
        homeLabel = new javax.swing.JLabel();
        groupsLabel = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        schedulesLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        GroupsPageTitle = new javax.swing.JLabel();
        groupsIDidNotCreateComboBox = new javax.swing.JComboBox<>();
        groupsIDidNotCreateLabel = new javax.swing.JLabel();
        groupsICreatedLabel = new javax.swing.JLabel();
        groupsICreatedComboBox = new javax.swing.JComboBox<>();
        createGroupButton = new javax.swing.JButton();

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
                .addContainerGap(230, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navigationPanelLayout = new javax.swing.GroupLayout(navigationPanel);
        navigationPanel.setLayout(navigationPanelLayout);
        navigationPanelLayout.setHorizontalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradientForNavigationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navigationPanelLayout.setVerticalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationPanelLayout.createSequentialGroup()
                .addComponent(panelGradientForNavigationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelGradient1.add(navigationPanel);
        navigationPanel.setBounds(0, 0, 250, 830);

        GroupsPageTitle.setFont(new java.awt.Font("Canela", 1, 70)); // NOI18N
        GroupsPageTitle.setText("Groups");
        panelGradient1.add(GroupsPageTitle);
        GroupsPageTitle.setBounds(700, 40, 270, 100);
        
        //source: http://www.java2s.com/Tutorials/Java/Swing_How_to/JComboBox/Change_the_colour_of_JComboBox_s_selected_Item.htm
        class TwoDecimalRenderer extends DefaultListCellRenderer {
      	  private ListCellRenderer defaultRenderer;
      	  public TwoDecimalRenderer(ListCellRenderer defaultRenderer) {
      	    this.defaultRenderer = defaultRenderer;
      	  }
      	  @Override
      	  public Component getListCellRendererComponent(JList list, Object value,
      	      int index, boolean isSelected, boolean cellHasFocus) {
      	    Component c = defaultRenderer.getListCellRendererComponent(list, value,
      	        index, isSelected, cellHasFocus);
      	    if (c instanceof JLabel) {
      	      if (isSelected) {
      	        c.setBackground(new Color(159,234,234));
      	        c.setForeground(Color.black);
      	      } else {
      	        c.setBackground(Color.white);
      	      }
      	    } else {
      	      c.setBackground(Color.white);
      	      c = super.getListCellRendererComponent(list, value, index, isSelected,
      	          cellHasFocus);
      	    }
      	    return c;
      	  }
      	}

        groupsIDidNotCreateComboBox.setBackground(new java.awt.Color(159, 234, 234));
        groupsIDidNotCreateComboBox.setFont(new java.awt.Font("Canela", 1, 24)); // NOI18N
        groupsIDidNotCreateComboBox.setBorder(null);
        groupsIDidNotCreateComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        allJoinedGroups.addAll(MysqlConn.findJoinedSchedules());
        for (int i = 0; i < allJoinedGroups.size(); i++)
        {
        	groupsIDidNotCreateComboBox.addItem(allJoinedGroups.get(i).getScheduleName());
        }
        
        groupsIDidNotCreateComboBox.setRenderer(new TwoDecimalRenderer(groupsIDidNotCreateComboBox.getRenderer()));
        
        groupsIDidNotCreateComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                groupsIDidNotCreateComboBoxItemStateChanged(evt);
            }
        });
        groupsIDidNotCreateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupsIDidNotCreateComboBoxActionPerformed(evt);
            }
        });
        panelGradient1.add(groupsIDidNotCreateComboBox);
        groupsIDidNotCreateComboBox.setBounds(860, 450, 300, 50);

        groupsIDidNotCreateLabel.setFont(new java.awt.Font("Canela", 1, 40)); // NOI18N
        groupsIDidNotCreateLabel.setText("Groups I Did Not Create:");
        panelGradient1.add(groupsIDidNotCreateLabel);
        groupsIDidNotCreateLabel.setBounds(390, 440, 465, 60);

        groupsICreatedLabel.setFont(new java.awt.Font("Canela", 1, 40)); // NOI18N
        groupsICreatedLabel.setText("Groups  I Created:");
        panelGradient1.add(groupsICreatedLabel);
        groupsICreatedLabel.setBounds(510, 350, 350, 60);

        groupsICreatedComboBox.setBackground(new java.awt.Color(159, 234, 234));
        groupsICreatedComboBox.setFont(new java.awt.Font("Canela", 1, 24)); // NOI18N
        groupsICreatedComboBox.setBorder(null);
        groupsICreatedComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        allCreatedGroups.addAll(MysqlConn.findCreatedSchedules());
        for (int i = 0; i < allCreatedGroups.size(); i++)
        {
        	groupsICreatedComboBox.addItem(allCreatedGroups.get(i).getScheduleName());
        }
        
        groupsICreatedComboBox.setRenderer(new TwoDecimalRenderer(groupsICreatedComboBox.getRenderer()));
        
        groupsICreatedComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                groupsICreatedComboBoxItemStateChanged(evt);
            }
        });
        groupsICreatedComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupsICreatedComboBoxActionPerformed(evt);
            }
        });
        panelGradient1.add(groupsICreatedComboBox);
        groupsICreatedComboBox.setBounds(860, 360, 300, 50);

        createGroupButton.setBackground(new java.awt.Color(13, 165, 165));
        createGroupButton.setFont(new java.awt.Font("Canela", 1, 48)); // NOI18N
        createGroupButton.setText("Create Group");
        createGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGroupButtonActionPerformed(evt);
            }
        });
        panelGradient1.add(createGroupButton);
        createGroupButton.setBounds(600, 210, 460, 110);

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

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) 
    {                                       
    	this.dispose();
    	HomePage.main(null);
    }                                      

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {                                       
        
        //mouse hovering feature source: https://gist.github.com/TabsPH/4057899
        homeLabel = (JLabel) evt.getComponent();
        homeLabel.setOpaque(true);
        homeLabel.setBackground(new Color(220,232,238));
        
        //creating border source: https://docs.oracle.com/javase/tutorial/uiswing/components/border.html
        homeLabel.setBorder(BorderFactory.createLineBorder(new Color(220,232,238)));
    }                                      

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {                                      
        homeLabel = (JLabel) evt.getComponent();
        homeLabel.setOpaque(false);
        homeLabel.setForeground( new Color(0, 0, 0) );
        homeLabel.setBorder(BorderFactory.createEmptyBorder());
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

    private void groupsIDidNotCreateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                            
    	String groupSelected = String.valueOf(groupsIDidNotCreateComboBox.getSelectedItem());

    	for (int i = 0; i < allJoinedGroups.size(); i++)
    	{
    		if (allJoinedGroups.get(i).getScheduleName().equals(groupSelected))
    		{
    			Schedule.focusSchedule = allJoinedGroups.get(i);
    			this.dispose();
    			SampleGroupIDidNotCreatePage.main(null);
    		}
    	}
    }                                                           

    private void groupsIDidNotCreateComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {                                                             
        if(evt.getStateChange()==java.awt.event.ItemEvent.SELECTED)
        {
            CreateSchedule.main(null);
        }
    }                                                            

    private void groupsICreatedComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void groupsICreatedComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                       
    	String groupSelected = String.valueOf(groupsICreatedComboBox.getSelectedItem());

    	for (int i = 0; i < allCreatedGroups.size(); i++)
    	{
    		if (allCreatedGroups.get(i).getScheduleName().equals(groupSelected))
    		{
    			Schedule.focusSchedule = allCreatedGroups.get(i);
    			this.dispose();
    			SampleGroupICreatedPage.main(null);
    		}
    	}
    }                                                      

    private void createGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        this.dispose();
        CreateGroup.main(null);
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
            java.util.logging.Logger.getLogger(GroupsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroupsPage().setVisible(true);
            }
        });
    }
                  
    private javax.swing.JLabel GroupsPageTitle;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JButton createGroupButton;
    private javax.swing.JComboBox<String> groupsICreatedComboBox;
    private javax.swing.JLabel groupsICreatedLabel;
    private javax.swing.JComboBox<String> groupsIDidNotCreateComboBox;
    private javax.swing.JLabel groupsIDidNotCreateLabel;
    private javax.swing.JLabel groupsLabel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel navigationPanel;
    private gui.PanelGradient panelGradient1;
    private gui.PanelGradient panelGradientForNavigationPanel;
    private javax.swing.JLabel schedulesLabel;
    private ArrayList<String> theStringList;
                  
}
