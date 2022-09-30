package iVoteSim;

import java.util.Scanner;
import java.util.UUID;

public class Student {
	private String studentId;
	
	public Student() {
		setStudentId(UUID.randomUUID().toString());
	}
	
	public Student(String givenId) {
		setStudentId(givenId);
	}
	
	//setters
	public void setStudentId(String givenId) {
		studentId = givenId;
	}
	
	//getters
	public String getStudentId() {
		return studentId;
	}
}
