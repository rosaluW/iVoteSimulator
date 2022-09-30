package iVoteSim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MultipleChoice extends Question {
	private String[] answerChoices; //keeps track of given answer choices (does not
									//exist in single choice question class)
	private int[] answerCount;		//keeps count of how many times an answer choice was selected
	String randomAnswer;			//holds randomly generated answer
	
	public MultipleChoice(String givenQuestionProb, String[] givenAnswerChoices) {
		super(givenQuestionProb);	//reuse parent class's constructor
		answerChoices = new String[4]; //4 elements for A,B,C,D
		this.setAnswerChoices(givenAnswerChoices);
		
		answerCount = new int[4];
		
		randomAnswer = "";
	}
	
	//method to display candidate choices
	public void displayChoices() {
		// TODO Auto-generated method stub
		System.out.println("	A. " + answerChoices[0]);
		System.out.println("	B. " + answerChoices[1]);
		System.out.println("	C. " + answerChoices[2]);
		System.out.println("	D. " + answerChoices[3]);
	}
	
	//assigns student's submitted answers to answerChoices array
	public void setAnswerChoices(String[] givenAnswerChoices) {
		for (int i = 0; i < 4; i++) {
			answerChoices[i] = givenAnswerChoices[i];
		}
	}
	
	//method to generate random answers for simulation
	public String generateRandomAnswer() {
		Random rand = new Random();
		randomAnswer = "";
		int numOfAnswer = rand.nextInt(4) + 1;
		
		ArrayList<Character> charList = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D'));
		Collections.shuffle(charList);
		
		for (int i = 0; i < numOfAnswer; i++) {
			randomAnswer += charList.get(i);
		}
		
		return this.randomAnswer;
	}
	
	//get student's submission and count choices toward answerCount array
	public void getSubmission(String answer) {
		for (int i = 0; i < answer.length(); i++) {
			if (answer.charAt(i) == 'A') {
				answerCount[0]++;
			}
			
			else if (answer.charAt(i) == 'B') {
				answerCount[1]++;
			}
			
			else if (answer.charAt(i) == 'C') {
				answerCount[2]++;
			}
			
			else {
				answerCount[3]++;
			}
		}
	}
	
	//method to display how many times a choice was selected
	public void displayAnswerCount() {
		System.out.print("A: " + this.answerCount[0] + "\t");
		System.out.print("B: " + this.answerCount[1] + "\t");
		System.out.print("C: " + this.answerCount[2] + "\t");
		System.out.print("D: " + this.answerCount[3]);
	}
	
	//method to clear answer count before each question
	public void clearAnswerCount() {
		for (int i = 0; i < 4; i++) {
			answerCount[i] = 0;
		}
	}

}
