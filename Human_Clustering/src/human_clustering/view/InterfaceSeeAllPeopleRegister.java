package human_clustering.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import java.util.LinkedList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;



public class InterfaceSeeAllPeopleRegister {
	private JFrame frame;
	private JPanel panel;
	
	
	private int limit;
	private JPanel[] panelInformation;
	private JLabel[] labelTextPeople;
	
	LinkedList<String> seeDataOfAllPeople;
	
	
	private JButton btnNewButton;
	private JButton buttonBackToMenu;
	
	
	
	private JPanel contentPanel;
	private JScrollPane scrollPane;
	
	public InterfaceSeeAllPeopleRegister() {
      
	}
	
	public void InterfaceSeeAllPeopleRegisterVisual(JFrame view, LinkedList<String> listPeople) {
		
		frame= view;
		
		seeDataOfAllPeople = listPeople;
        
        limit = listPeople.size();
        
        panelInformation = new JPanel[limit];
        labelTextPeople = new JLabel[limit]; 
        
        
        contentPanel = new JPanel();
        contentPanel.setBackground(new Color(166, 0, 255));
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBackground(new Color(166, 0, 255));
        scrollPane.setBounds(238, 0, 745, 760);
        
        
        
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        frame.getContentPane().add(scrollPane);

        
        for(int i = 0; i < limit; i++) {
        	panelInformation[i] = new JPanel();
        	panelInformation[i].setBounds(300, (25+(i*65)), 600, 25);
//    		frame.getContentPane().add(panelInformation[i]);
        	
        	contentPanel.add(Box.createVerticalStrut(50));
        	contentPanel.add(panelInformation[i]);
        	contentPanel.add(Box.createVerticalStrut(200));
    		
    		
    			
    		labelTextPeople[i] = new JLabel(listPeople.get(i));
    		panelInformation[i].add(labelTextPeople[i]);
        	
        }
        buttonBackToMenu = new JButton("Back to Menu");
		buttonBackToMenu.setBounds(10, 30, 200, 45);
		buttonColor(buttonBackToMenu);
		frame.getContentPane().add(buttonBackToMenu);
		
        
        panel = new JPanel();
		panel.setBackground(new Color(255, 170, 0));
		panel.setBounds(0, 0, 238, 761);
		frame.getContentPane().add(panel);
		
	
		
		frame.repaint();	
	}
	
	public JButton buttonColor(JButton button) {
    	button.setBorderPainted(false);
    	button.setForeground(new Color(255, 255, 255));
    	button.setBackground(new Color(116, 0, 255));
    	return button;
    	
    }
	
	
	public void changeStateVisibleOrNotAllSeeAllPeopleRegisterVisual() {
		
		panel.setVisible(!panel.isVisible());
		buttonBackToMenu.setVisible(!buttonBackToMenu.isVisible());;
		
		contentPanel.setVisible(!contentPanel.isVisible());
		scrollPane.setVisible(!scrollPane.isVisible());
		
		for(int i = 0; i < limit; i++) {
			panelInformation[i].setVisible(!panelInformation[i].isVisible());
			labelTextPeople[i].setVisible(!labelTextPeople[i].isVisible());
		}
	}

	public JButton getButtonBackToMenu() {
		return buttonBackToMenu;
	}
	
	
	
	
}
