package iVoteSim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VotingService {
	
	public void displayQuestion(Question question, int probNum) {
		System.out.print(probNum + ". ");
		question.displayQuestion();
	}
	
	public void displayCandidateChoices(Question question) {
		question.displayChoices();
		System.out.println();
	}
	
	public void acceptSubmission(Question question, String answer) {
		question.getSubmission(answer);
	}
	
	public void displayAnswerCount(Question question) {
		question.displayAnswerCount();
		System.out.println("\n");
	}
	
}
