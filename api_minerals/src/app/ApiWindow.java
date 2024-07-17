package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import org.json.simple.JSONObject;
import app.ApiGET;

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
		frame.add(ApiWindow.mainPanel(arg));
		frame.add(ApiWindow.backgroundPanel(arg));
		
	 }
	
	public static JButton getButton(String[] arg) {
		JButton getButton = new JButton("Get Data JSON");  
	    getButton.setBounds(975,20,95,30);
	    getButton.setSize(135,20);
	    getButton.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            ApiGET.main();
	        }
	    });
		return getButton;  
	    
	}
	
	public static Component backgroundPanel(String[] arg) {
		RoundedPanel backgroundPanel = new RoundedPanel();
		Color color = new Color(224,224,224);
		
		backgroundPanel.setSize(850,600);
		backgroundPanel.setShady(false);
		backgroundPanel.setBackground(color);
		backgroundPanel.setLocation(100,55);
		backgroundPanel.setStrokeSize(0);
		
	
		return backgroundPanel;
	}
	
	public static Component mainPanel(String[] arg) {

		RoundedPanel mainPanel = new RoundedPanel();
		JLabel textBoxLabel = new JLabel("Text");
		Color color1 = new Color(55,55,88);
		Color color2 = new Color(0,0,0);
		
		mainPanel.setSize(700,500);
		mainPanel.setShady(false);
		mainPanel.setArcs(new Dimension(10, 10));
		mainPanel.setBackground(color1);
		mainPanel.setLocation(150,100);
		mainPanel.setStrokeSize(0);
		mainPanel.add(textBoxLabel);
		textBoxLabel.setBackground(color2);
		textBoxLabel.setVisible(true);

		return mainPanel;
	}

}
