package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.*;

public class ApiWindow extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] arg) {
		
		JFrame frame = new JFrame("FrameDemo");
		
		frame.setTitle("Fenêtre d'affichage de données API");
		frame.setSize(1150,900);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.add(ApiWindow.getButton(arg));
		frame.add(ApiWindow.backgroundPanel(arg));
		
	 }
	
	public static Component getButton(String[] arg) {
		JButton getButton = new JButton("Get Data JSON");  
	    getButton.setBounds(975,20,95,30);
	    getButton.setSize(135,20);
		return getButton;  
	    
	}
	
	public static Component backgroundPanel(String[] arg) {
		RoundedPanel backgroundPanel = new RoundedPanel();
		Color color = new Color(224,224,224);
		JLabel bgLabel = new JLabel();
		
		backgroundPanel.setSize(850,600);
		backgroundPanel.setShady(false);
		backgroundPanel.setBackground(color);
		backgroundPanel.setLocation(100,55);
		backgroundPanel.setStrokeSize(0);
		
		bgLabel.setText("JSON Display Panel");
		bgLabel.setText("");
		
		backgroundPanel.add(ApiWindow.mainPanel(arg));
		backgroundPanel.add(bgLabel);
		
		return backgroundPanel;
	}
	
	public static Component mainPanel(String[] arg) {

		RoundedPanel mainPanel = new RoundedPanel();
		Color color = new Color(55,55,88);
		
		mainPanel.setSize(700,500);
		mainPanel.setShady(false);
		mainPanel.setArcs(new Dimension(10, 10));
		mainPanel.setBackground(color);
		mainPanel.setLocation(80,70);
		mainPanel.setStrokeSize(0);
		
		return mainPanel;
	}


}
