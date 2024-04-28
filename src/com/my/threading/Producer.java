package com.my.threading;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {

	//question produced
	
	List<Integer> questions = new ArrayList<>();
	int questionLimitNo = 5;
	int questionNo = 0;
	
	public Producer(List<Integer> questions) {
		this.questions = questions;
	}
	
	public void readQuestion(int questionNo) throws InterruptedException {
		
		synchronized(questions) {
			if (questions.size() ==questionLimitNo) {
	
				System.out.println("Questions have piled up");
				questions.wait();
			} 
		}
		
		synchronized(questions){
			System.out.println("New Question added to the list: " + questionNo);				
			questions.add(questionNo);
			Thread.sleep(100);
			questions.notify();
		}
		
		//question and notify can only be called in the synchronized block
	}
	
	
	@Override
	public void run() {
		
		while (true) {
			try {
				readQuestion(questionNo++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public List<Integer> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Integer> questions) {
		this.questions = questions;
	}

	public int getQuestionLimitNo() {
		return questionLimitNo;
	}

	public void setQuestionLimitNo(int questionLimitNo) {
		this.questionLimitNo = questionLimitNo;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	@Override
	public String toString() {
		return "Producer [questions=" + questions + ", questionLimitNo=" + questionLimitNo + ", questionNo="
				+ questionNo + "]";
	}

	
	
}
