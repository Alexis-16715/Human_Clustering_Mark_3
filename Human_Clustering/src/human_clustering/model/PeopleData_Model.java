package human_clustering.model;

import java.util.LinkedList;



public class PeopleData_Model {
	LinkedList<PersonObject_Model> allPeopleDataObject;
	LinkedList<String> seeDataOfAllPeople;
	
	
	int[][] weights;
	
	
	public PeopleData_Model () {
		this.allPeopleDataObject = new LinkedList<>();
	}
	
	public void addPerson (String name,int sports,int music,int entertainmentNews,int science) {
		allPeopleDataObject.add(new PersonObject_Model (name, sports, music, entertainmentNews, science));
	}
	
	public boolean checkIfTheListisEmpty() {
		
		return !allPeopleDataObject.isEmpty();
	}

	public LinkedList<PersonObject_Model> getAllPeopledata() {
		return allPeopleDataObject;
	}
	
	
	public void checkToCalculateWeights() {
		if(allPeopleDataObject.size() >= 2) {
			calculateWeights();
		}
	}
	
	
	private void calculateWeights() {
		int numVertices = allPeopleDataObject.size();
        for (int i = 0; i < numVertices; i++) {
            for (int j = i + 1; j < numVertices; j++) {
                int weight = calculateWeightBetwenTwoPeople(allPeopleDataObject.get(i), allPeopleDataObject.get(j));
                weights[i][j] = weight;
                weights[j][i] = weight; 
            }
        }
    }
	
	private int calculateWeightBetwenTwoPeople(PersonObject_Model personNumberOne, PersonObject_Model personNumberTwo) {
    	
    	int [] listOfPersonNumberOne = makeListOfPeopleInterest(personNumberOne);
    	int [] listOfPersonNumberTwo = makeListOfPeopleInterest(personNumberTwo);
    	
    	int weight = listOfPersonNumberOne[0] - listOfPersonNumberTwo[0] 
    			+ listOfPersonNumberOne[1] - listOfPersonNumberTwo[1] 
    			+ listOfPersonNumberOne[2] - listOfPersonNumberTwo[2]
    			+ listOfPersonNumberOne[3] - listOfPersonNumberTwo[3];
    	if(weight<0) {
    		weight = weight * (-1);
    	}
    	
        return weight;
    }
	
	
	private int[] makeListOfPeopleInterest (PersonObject_Model person) {
		int[] list = new int[4];
		
		list[0] = person.getSports();
		list[0] = person.getMusic();
		list[0] = person.getEntertainmentNews();
		list[0] = person.getScience();
		return list;
	}
	
	public LinkedList<String> toSeeDataOfAllPeople() {
		seeDataOfAllPeople = new LinkedList<>();
		for(int i = 0; i < allPeopleDataObject.size(); i++) {
			seeDataOfAllPeople.add("Name: " +allPeopleDataObject.get(i).getName() + " Interest in Sports: " + allPeopleDataObject.get(i).getSports() + " Interest in Music: " +  allPeopleDataObject.get(i).getMusic()+ " Interestin Entertainment News: " + allPeopleDataObject.get(i).getEntertainmentNews() + " Science: " + allPeopleDataObject.get(i).getScience());
		}
		return seeDataOfAllPeople;
	}
}
