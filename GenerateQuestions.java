package iVoteSim;

/* Class that configures questions and answers only for simulation run.
 */

public class GenerateQuestions {
	private String[] answerChoices;
	private Question[] questions;
	
	public GenerateQuestions() {
		questions = new Question[3];
		answerChoices = new String[4];
		String questionProb;
		
		//create question 1
		questionProb = "Who is the current president of the US?";
		answerChoices[0] = "SpiderMan";
		answerChoices[1] = "Kim Kardashian";
		answerChoices[2] = "Joe Biden";
		answerChoices[3] = "Professor Yu Sun!";
		questions[0] = new MultipleChoice(questionProb, answerChoices);
		
		//create question 2
		questionProb = "Which of these are countries? Select all that apply";
		answerChoices[0] = "USA";
		answerChoices[1] = "Scotland";
		answerChoices[2] = "Paris";
		answerChoices[3] = "China";
		questions[1] = new MultipleChoice(questionProb, answerChoices);
		
		questionProb = "Yu Sun is your favorite professor!";
		questions[2] = new SingleChoice(questionProb);
	}
	
	public Question[] getQuestions() {
		return questions;
	}
	
	public String[] getAnswerChoices() {
		return answerChoices;
	}

}
