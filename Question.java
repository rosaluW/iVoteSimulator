package iVoteSim;
/*Abstract parent class for Multiple-Choice and Single Choice questions
 * Allows programmer to be able to create more types of questions*/

public abstract class Question {
	private String questionProb; //question problem
	
	//default constructor
	public Question() {
		this.setQuestionProb("");
	}
	
	public Question(String givenQuestion) {
		this.setQuestionProb(givenQuestion);
	}
	
	//setter
	public void setQuestionProb(String givenQuestion) {
		questionProb = givenQuestion;
	}
	
	//getter
	public String getQuestionProb() {
		return questionProb;
	}
	
	//method for displaying question
	public void displayQuestion() {
		System.out.println(this.getQuestionProb());
	}
	
	public abstract void displayChoices();	//method for displaying candidate choices
	public abstract String generateRandomAnswer();	//method to generate random answers for simulation
	public abstract void getSubmission(String answer); //method to get user submission
	public abstract void clearAnswerCount();	//used to clear answer count before each question
	public abstract void displayAnswerCount();	//display answer count
}

