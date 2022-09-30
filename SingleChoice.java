package iVoteSim;

import java.util.Random;

public class SingleChoice extends Question {

	private String randomAnswer;	//holds randomly generated answer for simulation
	private int[] answerCount;		//keeps track of how many times a choice was selected
	
	//default constructor
	public SingleChoice() {
		super("");
		randomAnswer = "";
		answerCount = new int[2];
	}
	
	//constructor
	public SingleChoice(String givenQuestionProb) {
		super(givenQuestionProb);	
		randomAnswer = "";
		answerCount = new int[2];
	}
	
	//method that displays true or false choices
	public void displayChoices() {
		// TODO Auto-generated method stub
		System.out.println("	1. True");
		System.out.println("	2. False");
	}
	
	//method to generate random answers for simulation
	public String generateRandomAnswer() {
		Random rand = new Random();
		randomAnswer = "";
		randomAnswer += (char) rand.nextInt(2) + 1;
		
		return randomAnswer;
	}
	
	//get user's submission and count it towards answer count
	public void getSubmission(String answer) {
		if (answer.charAt(0) == '1') {
			answerCount[0]++;
		}
		
		else
			answerCount[1]++;
	}
	
	//display answer count
	public void displayAnswerCount() {
		System.out.print("True: " + this.answerCount[0] + "\t");
		System.out.print("False: " + this.answerCount[1]);
	}
	
	//for clearing answer count before every question
	public void clearAnswerCount() {
		for (int i = 0; i < 2; i++) {
			answerCount[i] = 0;
		}
	}

}
