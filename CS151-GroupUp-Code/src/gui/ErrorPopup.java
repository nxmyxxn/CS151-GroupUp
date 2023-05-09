package gui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class ErrorPopup {
	
	String error;
	
	public ErrorPopup()
	{
		
	}
	
	public static void makePopup(String message)
	{
		JLabel passwordMessage = new JLabel(message, SwingConstants.CENTER);
        passwordMessage.setFont(new Font("Canela", 1, 30));
        passwordMessage.setOpaque(true);
        //passwordMessage.setBackground(new Color(159, 204, 229);
        //UIManager UI=new UIManager();
        //UI.put("OptionPane.background",new ColorUIResource(159, 204, 229));
        //UI.put("Panel.background",new ColorUIResource(159, 204, 229));
        
        //source: https://stackoverflow.com/questions/11204878/joptionpane-showconfirmdialog-with-only-one-button
         JOptionPane.showConfirmDialog(null,
                passwordMessage,
                null, 
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.ERROR_MESSAGE);
	}

}
