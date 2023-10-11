package human_clustering.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.Insets;
import java.net.URL;

import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Color;
import javax.swing.JLabel;

public class InterfaceMenu_View {
	private JFrame frame;
	private JTextField textFieldOfThePerson;
	
	private JLabel titleMainMenu;
	
	private JButton bottonRegisterPeople;
	private JButton bottonSeeAllPeopleRegister;
	private JButton bottonAmountOfGrups;
	private JButton bottonSeeAllGroups;
	private JButton bottonExit;
	
	private URL iconApplication = getClass().getResource("/images/Icon Mark 3.png");
	
	
	private URL iconForMenuSports = getClass().getResource("/images/SportsIcon.png");
	private URL iconForMenuMusic = getClass().getResource("/images/MusicIcon.png");
	private URL iconForMenuEntertainmentNews = getClass().getResource("/images/noticias del espectaculoIcon.png");
	private URL iconForMenuScience = getClass().getResource("/images/MusicIcon.png");
	
	
	private JPanel panel;
	

	private JButton buttonAddPerson;
	private JButton buttonBackToMenu;
	
	
	
	private JLabel labelPersonRegisteredApplication;
	
	private int peopleRegisterApplication;
	
	
	
	
	private JLabel labelImageSports;
	private JLabel labelImageMusic;
	private JLabel labelImageEntertainmentNews;
	private JLabel labelImageScience;

	
	public InterfaceMenu_View() {
		initialize();
	}


    private void initialize() {
    	frame = new JFrame();
    	frame.setBackground(new Color(255, 255, 255));
        frame.getContentPane().setBackground(new Color(116, 0, 255));
        frame.getContentPane().setLayout(null);
        frame.setBounds(100, 100, 1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Human Clustering");
      
        ImageIcon icon = new ImageIcon(iconApplication);
        frame.setIconImage(icon.getImage());
        
        
        Font font = new Font("Tahoma", Font.PLAIN, 15);
        bottonRegisterPeople = new JButton("Register People");
        bottonRegisterPeople.setFont(font);
        buttonColor(bottonRegisterPeople);
        bottonRegisterPeople.setBounds(10, 30, 200, 45);
		getFrame().getContentPane().add(bottonRegisterPeople);
		
		
		bottonSeeAllPeopleRegister = new JButton("See All People Register");
		bottonSeeAllPeopleRegister.setFont(font);
		buttonColor(bottonSeeAllPeopleRegister);
		bottonSeeAllPeopleRegister.setBounds(10, 141, 200, 45);
		getFrame().getContentPane().add(bottonSeeAllPeopleRegister);
		
		bottonAmountOfGrups = new JButton("Consult Groups");
		bottonAmountOfGrups.setFont(font);
		buttonColor(bottonAmountOfGrups);
		bottonAmountOfGrups.setBounds(10, 252, 200, 45);
		getFrame().getContentPane().add(bottonAmountOfGrups);
		
		bottonSeeAllGroups = new JButton("See All Group ");
		bottonSeeAllGroups.setFont(font);
		buttonColor(bottonSeeAllGroups);
		bottonSeeAllGroups.setBounds(10, 363, 200, 45);
		getFrame().getContentPane().add(bottonSeeAllGroups);
		
		bottonExit = new JButton("Exit");
		bottonExit.setFont(font);
		buttonColor(bottonExit);
		bottonExit.setBounds(10, 474, 200, 45);
		getFrame().getContentPane().add(bottonExit);
		
		labelPersonRegisteredApplication = new JLabel("Person Registered in this application: " + peopleRegisterApplication);
		labelPersonRegisteredApplication.setForeground(new Color(255, 255, 255));
		labelPersonRegisteredApplication.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelPersonRegisteredApplication.setBounds(265, 275, 576, 87);
		frame.getContentPane().add(labelPersonRegisteredApplication);
		
		
		
		titleMainMenu = new JLabel("Human Clustering");
		titleMainMenu.setForeground(new Color(255, 255, 255));
		
		
		
		Font fontTitle = new Font("Arial", Font.PLAIN, 40);
		titleMainMenu.setFont(fontTitle);
		titleMainMenu.setBounds(501, 46, 340, 58);
		frame.getContentPane().add(titleMainMenu);
		
		
		
		
		
		frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        
		panel = new JPanel();
		panel.setBackground(new Color(255, 170, 0));
		panel.setBounds(0, 0, 238, 761);
		frame.getContentPane().add(panel);
		
		labelImageSports= new JLabel();
		labelImageSports.setIcon(new ImageIcon(iconForMenuSports));
		labelImageSports.setBounds(275, 39, 223, 225);
		frame.getContentPane().add(labelImageSports);
		
		
		labelImageMusic= new JLabel();
		labelImageMusic.setIcon(new ImageIcon(iconForMenuMusic));
		labelImageMusic.setBounds(730, 141, 223, 225);
		frame.getContentPane().add(labelImageMusic);
		
		labelImageEntertainmentNews= new JLabel();
		labelImageEntertainmentNews.setIcon(new ImageIcon(iconForMenuEntertainmentNews));
		labelImageEntertainmentNews.setBounds(618, 491, 223, 225);
		frame.getContentPane().add(labelImageEntertainmentNews);
		
		labelImageScience= new JLabel();
		labelImageScience.setIcon(new ImageIcon(iconForMenuScience));
		labelImageScience.setBounds(265, 457, 223, 225);
		frame.getContentPane().add(labelImageScience);
		
		
		
        
        
    }
    
    public void setTextinMainMenu() {
    	addPersonTotheCounterMenu();
    	labelPersonRegisteredApplication.setText("Person Registered in this application: " + peopleRegisterApplication);
    }
    
    private void addPersonTotheCounterMenu() {
    	this.peopleRegisterApplication++;
    }
    
	public void changeStateVisibleOrNotAllMenu() {
		labelImageScience.setVisible(!labelImageScience.isVisible());
		labelImageEntertainmentNews.setVisible(!labelImageEntertainmentNews.isVisible());
		labelImageMusic.setVisible(!labelImageMusic.isVisible());
		labelImageSports.setVisible(!labelImageSports.isVisible());
		panel.setVisible(!panel.isVisible());
		bottonRegisterPeople.setVisible(!bottonRegisterPeople.isVisible());
		bottonSeeAllPeopleRegister.setVisible(!bottonSeeAllPeopleRegister.isVisible());
		bottonAmountOfGrups.setVisible(!bottonAmountOfGrups.isVisible());
		bottonSeeAllGroups.setVisible(!bottonSeeAllGroups.isVisible());
		bottonExit.setVisible(!bottonExit.isVisible());
		titleMainMenu.setVisible(!titleMainMenu.isVisible());
		labelPersonRegisteredApplication.setVisible(!labelPersonRegisteredApplication.isVisible());
	}
    
    public JButton buttonColor(JButton button) {
    	button.setBorderPainted(false);
    	button.setForeground(new Color(255, 255, 255));
    	button.setBackground(new Color(116, 0, 255));
    	return button;
    	
    }
    public JButton changeColorButtonBlack(JButton button) {
    	button.setBackground(new Color(255, 255, 255));
		return button;
    }
    
    public JButton changeColorButtonRestoreOriginalColor(JButton button) {
    	button.setBackground(new Color(140, 140, 140));
		return button;
    }
    
    
    public JTextField getTextFieldOfThePerson() {
		return textFieldOfThePerson;
	}


	public JButton getBottonRegisterPeople() {
		return bottonRegisterPeople;
	}

	public JButton getBottonSeeAllPeopleRegister() {
		return bottonSeeAllPeopleRegister;
	}

	public JButton getBottonAmountOfGrups() {
		return bottonAmountOfGrups;
	}


	public JButton getBottonSeeAllGroups() {
		return bottonSeeAllGroups;
	}

	public JButton getBottonExit() {
		return bottonExit;
	}
	
	public JButton getButtonAddPerson() {
		return buttonAddPerson;
	}

	public JButton getButtonBackToMenu() {
		return buttonBackToMenu;
	}

	
	
	public JLabel getLabelPersonRegisteredApplication() {
		return labelPersonRegisteredApplication;
	}

	public void setLabelPersonRegisteredApplication(JLabel labelPersonRegisteredApplication) {
		this.labelPersonRegisteredApplication = labelPersonRegisteredApplication;
	}


	public JFrame getFrame() {
		return frame;
	}
}
