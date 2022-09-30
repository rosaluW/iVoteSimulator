package iVoteSim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

public class SimulationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotingService service = new VotingService(); //invoke voting service
		Random rand = new Random();
		
		//generate random number of students
		int numOfStudents = rand.nextInt(10) + 1;
		//create array of students and dynamically allocate 
		Student[] students = new Student[numOfStudents];
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
		}
		//create hashmap to link student id to student answer
		HashMap<String, String> studentAnswers = new HashMap<String, String>();
		
		//create questions and answer choices for simulation
		GenerateQuestions configureQuestions = new GenerateQuestions();
		Question[] questions = configureQuestions.getQuestions();
		
		//begin simulation
		for(int i = 0; i < 3; i++) {
			service.displayQuestion(questions[i], i + 1);
			service.displayCandidateChoices(questions[i]);
			questions[i].clearAnswerCount();	//clear answer count
			
			for (int j = 0; j < numOfStudents; j++) {
				//generate random answer for each student and put into hashmap
				studentAnswers.put(students[j].getStudentId(), questions[i].generateRandomAnswer());
				
				//display each student's answer
				System.out.println("Student " + (j + 1) + "'s answer: " + studentAnswers.get(students[j].getStudentId()));
				//accept student's answer
				service.acceptSubmission(questions[i], studentAnswers.get(students[j].getStudentId()));
			}
			
			//display total answer counts
			service.displayAnswerCount(questions[i]);
		}
		
	}
}
