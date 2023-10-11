package human_clustering.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import human_clustering.view.InterfaceMenu_View;
import human_clustering.view.InterfaceRegisterPeople_View;
import human_clustering.view.InterfaceSeeAllPeopleRegister;

import human_clustering.model.PeopleData_Model;

public class Interfaz_Controller {
	
	private InterfaceMenu_View viewMenu;
	private InterfaceRegisterPeople_View viewInterfaceRegister;
	private InterfaceSeeAllPeopleRegister viewInterfaceSeeAllPeopleRegister;
	
	
	private PeopleData_Model peopleData;
	
	
	//Menu
	private JButton bottonRegisterPeople;
	private JButton bottonSeeAllPeopleRegister;
	private JButton bottonAmountOfGrups;
	private JButton bottonSeeAllGroups;
	private JButton bottonExit;
	
	
	//Register People
	
	private JButton buttonAddPerson;
	private JButton buttonBackToMenu;

	private int[] personFillfillDataRegister;
	
	
	
	private JButton[] buttonsInterestSports;
	private JButton[] buttonsMusicInterest;
	private JButton[] buttonsEntertainmentNewsInterests;
	private JButton[] buttonsScienceInterests;
	
	
	private JLabel labelNameOfPerson;
	
	private JTextField textFieldOfThePerson;
	
	
	private JButton buttonBackToMenuSeeAllPeopleRegister;
	
	
	public Interfaz_Controller(InterfaceMenu_View viewMenu, InterfaceRegisterPeople_View viewInterfaceRegister, InterfaceSeeAllPeopleRegister viewInterfaceSeeAllPeopleRegister, PeopleData_Model peopleData) {
		this.viewMenu=viewMenu;
		this.viewInterfaceRegister = viewInterfaceRegister;
		this.viewInterfaceSeeAllPeopleRegister = viewInterfaceSeeAllPeopleRegister;
		this.peopleData = peopleData;
		attachListenersMenu();
	}
	

	
	private void attachListenersMenu() {
		bottonRegisterPeople = viewMenu.getBottonRegisterPeople();
		bottonSeeAllPeopleRegister = viewMenu.getBottonSeeAllPeopleRegister();
		bottonAmountOfGrups= viewMenu.getBottonAmountOfGrups();
		bottonSeeAllGroups = viewMenu.getBottonSeeAllGroups();
		bottonExit =viewMenu.getBottonExit();
		
		bottonRegisterPeople.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewInterfaceRegister.InterfaceRegisterPeople(viewMenu.getFrame());
				viewMenu.changeStateVisibleOrNotAllMenu();
				attachListenersRegisterPeople();
				
			}
		});
		
		
		bottonSeeAllPeopleRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(peopleData.checkIfTheListisEmpty() ) {
					viewMenu.changeStateVisibleOrNotAllMenu();
					viewInterfaceSeeAllPeopleRegister.InterfaceSeeAllPeopleRegisterVisual(viewMenu.getFrame(), peopleData.toSeeDataOfAllPeople());
					attachListenersSeeAllPeopleRegister();
				}
			}
		});
		
		bottonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
	}
	
	private void attachListenersRegisterPeople() {
		buttonBackToMenu = viewInterfaceRegister.getButtonBackToMenu();
		buttonAddPerson = viewInterfaceRegister.getButtonAddPerson();
		
		buttonsInterestSports = viewInterfaceRegister.getButtonsInterestSports();
		buttonsMusicInterest = viewInterfaceRegister.getButtonsMusicInterest();
		buttonsEntertainmentNewsInterests = viewInterfaceRegister.getButtonsEntertainmentNewsInterests();
		buttonsScienceInterests = viewInterfaceRegister.getButtonsScienceInterests();
		
		
		textFieldOfThePerson = viewInterfaceRegister.getTextFieldOfThePerson();
		
		
		personFillfillDataRegister = new int[4];
		
		buttonAddPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean personsQualifyFilled = true;
				String textfielPeople = textFieldOfThePerson.getText();
				personsQualifyFilled = personsQualifyFilled && !textfielPeople.isEmpty();
				for (int i = 0; i < personFillfillDataRegister.length; i++) {
					personsQualifyFilled = personsQualifyFilled && (personFillfillDataRegister[i] != 0);
				}
				
				if(personsQualifyFilled) {
					viewMenu.changeStateVisibleOrNotAllMenu();
					viewInterfaceRegister.changeStateVisibleOrNotAllRegistyerPeople();
					viewMenu.setTextinMainMenu();
					peopleData.addPerson(textfielPeople, personFillfillDataRegister[0], personFillfillDataRegister[1], personFillfillDataRegister[2], personFillfillDataRegister[3]);
				}
				
			}
		});
		
		
		
		
		
		for (int row = 1; row<6; row++) {
			final int value = row;
			
			
			buttonsInterestSports[row].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					personFillfillDataRegister[0] = value+1;
					for (int column = 1; column<6; column++) {
						viewMenu.changeColorButtonBlack(buttonsInterestSports[column]);
					}
					viewMenu.changeColorButtonRestoreOriginalColor(buttonsInterestSports[value]);
				}
			});
			
			buttonsMusicInterest[row].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					personFillfillDataRegister[1] = value+1;
					for (int column = 1; column<6; column++) {
						viewMenu.changeColorButtonBlack(buttonsMusicInterest[column]);
					}
					viewMenu.changeColorButtonRestoreOriginalColor(buttonsMusicInterest[value]);
				}
			});
			
			buttonsEntertainmentNewsInterests[row].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					personFillfillDataRegister[2] = value+1;
					for (int column = 1; column<6; column++) {
						buttonsEntertainmentNewsInterests[column].setBackground(new Color(255, 255, 255));
					}
					viewMenu.changeColorButtonRestoreOriginalColor(buttonsEntertainmentNewsInterests[value]);
				}
			});
			
			
			buttonsScienceInterests[row].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					personFillfillDataRegister[3] = value+1;
					for (int column = 1; column<6; column++) {
						buttonsScienceInterests[column].setBackground(new Color(255, 255, 255));
					}
					viewMenu.changeColorButtonRestoreOriginalColor(buttonsScienceInterests[value]);
				}
			});
			
			
		}
		
		
		buttonBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewMenu.changeStateVisibleOrNotAllMenu();
				viewInterfaceRegister.changeStateVisibleOrNotAllRegistyerPeople();
				viewMenu.getFrame().repaint();
			}
		});
	}
	
	
	private void attachListenersSeeAllPeopleRegister() {
		buttonBackToMenuSeeAllPeopleRegister = viewInterfaceSeeAllPeopleRegister.getButtonBackToMenu();
		
		buttonBackToMenuSeeAllPeopleRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewMenu.changeStateVisibleOrNotAllMenu();
				viewInterfaceSeeAllPeopleRegister.changeStateVisibleOrNotAllSeeAllPeopleRegisterVisual();
				viewMenu.getFrame().repaint();
			}
		});
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	InterfaceMenu_View viewMenu = new InterfaceMenu_View();
            	InterfaceRegisterPeople_View interfaceRegisterPeople = new InterfaceRegisterPeople_View();
            	InterfaceSeeAllPeopleRegister  viewInterfaceSeeAllPeopleRegister = new InterfaceSeeAllPeopleRegister ();
            	
            	PeopleData_Model peopleData = new PeopleData_Model();
                new Interfaz_Controller(viewMenu, interfaceRegisterPeople, viewInterfaceSeeAllPeopleRegister, peopleData);
            	
            }
        });

	}

}
