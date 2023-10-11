package human_clustering.view;


import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Insets;
import javax.swing.JTextField;

public class InterfaceRegisterPeople_View {
	
	private JFrame frame;
	
	private JLabel labelNameOfPerson;

	private JLabel labelInterestSports;
	private JLabel labelMusicInterest;
	private JLabel labelEntertainmentNewsInterests;
	private JLabel labelScienceInterests;

	private JButton[] buttonsInterestSports;
	private JButton[] buttonsMusicInterest;
	private JButton[] buttonsEntertainmentNewsInterests;
	private JButton[] buttonsScienceInterests;
	
	private JButton test;
	private JTextField textField;

	private JButton buttonAddPerson;
	private JButton buttonBackToMenu;

	private JPanel panel;
	
	private InterfaceMenu_View view;

	private JTextField textFieldOfThePerson;
	
	public InterfaceRegisterPeople_View( ){
	}
	
	public void InterfaceRegisterPeople(JFrame view){
		
		frame = view;
		labelNameOfPerson = new JLabel("Name:");
        labelNameOfPerson.setForeground(new Color(255, 255, 255));
        labelNameOfPerson.setBounds(529, 11, 63, 22);
        labelNameOfPerson.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(labelNameOfPerson);
		
        
		textFieldOfThePerson = new JTextField();
		textFieldOfThePerson.setBounds(602, 14, 223, 20);
		frame.getContentPane().add(textFieldOfThePerson);
		textFieldOfThePerson.setColumns(10);
        
        labelInterestSports = new JLabel("Interest in Sports:");
        labelInterestSports.setForeground(new Color(255, 255, 255));
		labelInterestSports.setBounds(450, 70, 142, 22);
		labelInterestSports.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(labelInterestSports);
		
		buttonsInterestSports = new JButton[6];
		buttonSetProperties(600, 65, buttonsInterestSports);
		
		labelMusicInterest = new JLabel("Music Interest:");
		labelMusicInterest.setForeground(new Color(255, 255, 255));
		labelMusicInterest.setBounds(472, 200, 120, 22);
		labelMusicInterest.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(labelMusicInterest);
		
		buttonsMusicInterest = new JButton[6];
		buttonSetProperties(600, 200, buttonsMusicInterest);
		
		labelEntertainmentNewsInterests = new JLabel("Entertainment News Interests:");
		labelEntertainmentNewsInterests.setForeground(new Color(255, 255, 255));
		labelEntertainmentNewsInterests.setBounds(358, 329, 234, 22);
		labelEntertainmentNewsInterests.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(labelEntertainmentNewsInterests);
		
		buttonsEntertainmentNewsInterests = new JButton[6];
		buttonSetProperties(600, 330, buttonsEntertainmentNewsInterests);
		
		labelScienceInterests = new JLabel("Science Interests:");
		labelScienceInterests.setForeground(new Color(255, 255, 255));
		labelScienceInterests.setBounds(449, 459, 143, 22);
		labelScienceInterests.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(labelScienceInterests);
		
		buttonsScienceInterests = new JButton[6];
		buttonSetProperties(600, 460, buttonsScienceInterests);
		
		buttonAddPerson = new JButton("Add Person");
		buttonAddPerson.setBounds(10, 30, 200, 45);
		buttonColor(buttonAddPerson);
		frame.getContentPane().add(buttonAddPerson);
		
		buttonBackToMenu = new JButton("Back to Menu");
		buttonBackToMenu.setBounds(10, 141, 200, 45);
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
	
	private JButton[] buttonSetProperties (int positionX, int positionY, JButton[] button ) {
		Font font = new Font("Arial", Font.PLAIN, 11);
		for (int i = 1; i<6; i++) {
			button[i] = new JButton(""+i);
			button[i].setBackground(new Color(255, 255, 255));
			button[i].setForeground(new Color(0, 0, 0));
			button[i].setFont(font);
			button[i].setMargin(new Insets(1, 10, 2, 10));
			button[i].setBounds(positionX+i*50, positionY, 41, 36);
			frame.getContentPane().add(button[i]);
		}
		return button;
	}
	
	private JButton[] changeStateOfVisibleJbutton (JButton[] button) {
		for(int i = 1; i < button.length; i++) {
			button[i].setVisible(!button[i].isVisible());
		}
		return button;
	}
	
	public void changeStateVisibleOrNotAllRegistyerPeople() {
		labelNameOfPerson.setVisible(!labelNameOfPerson.isVisible());
		labelInterestSports.setVisible(!labelInterestSports.isVisible());
		labelMusicInterest.setVisible(!labelMusicInterest.isVisible());
		labelEntertainmentNewsInterests.setVisible(!labelEntertainmentNewsInterests.isVisible());
		labelScienceInterests.setVisible(!labelScienceInterests.isVisible());
		
		changeStateOfVisibleJbutton(buttonsInterestSports);
		changeStateOfVisibleJbutton(buttonsMusicInterest);
		changeStateOfVisibleJbutton(buttonsEntertainmentNewsInterests);
		changeStateOfVisibleJbutton(buttonsScienceInterests);
			
		textFieldOfThePerson.setVisible(!textFieldOfThePerson.isVisible());

		buttonAddPerson.setVisible(!buttonAddPerson.isVisible());
		buttonBackToMenu.setVisible(!buttonBackToMenu.isVisible());

		panel.setVisible(!panel.isVisible());
	}
	
	public JButton changeColorButtonBlack(JButton button) {
    	button.setBackground(new Color(255, 255, 255));
		return button;
    }
    
    public JButton changeColorButtonRestoreOriginalColor(JButton button) {
    	button.setBackground(new Color(140, 140, 140));
		return button;
    }

	public JLabel getLabelNameOfPerson() {
		return labelNameOfPerson;
	}

	public JLabel getLabelInterestSports() {
		return labelInterestSports;
	}

	public JLabel getLabelMusicInterest() {
		return labelMusicInterest;
	}

	public JLabel getLabelEntertainmentNewsInterests() {
		return labelEntertainmentNewsInterests;
	}

	public JLabel getLabelScienceInterests() {
		return labelScienceInterests;
	}

	public JButton[] getButtonsInterestSports() {
		return buttonsInterestSports;
	}

	public JButton[] getButtonsMusicInterest() {
		return buttonsMusicInterest;
	}

	public JButton[] getButtonsEntertainmentNewsInterests() {
		return buttonsEntertainmentNewsInterests;
	}

	public JButton[] getButtonsScienceInterests() {
		return buttonsScienceInterests;
	}

	public JButton getTest() {
		return test;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JButton getButtonAddPerson() {
		return buttonAddPerson;
	}

	public JButton getButtonBackToMenu() {
		return buttonBackToMenu;
	}

	public JPanel getPanel() {
		return panel;
	}

	public InterfaceMenu_View getView() {
		return view;
	}

	public JTextField getTextFieldOfThePerson() {
		return textFieldOfThePerson;
	}
	
	

}
