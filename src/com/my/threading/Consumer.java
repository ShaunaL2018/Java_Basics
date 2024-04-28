package com.my.threading;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable {
//questions answered
	
	List<Integer> questions = new ArrayList<>();
	//int questionLimitNo = 5;
	//int questionNo = 0;
	
	public Consumer(List<Integer> questions) {
		this.questions = questions;
	}
	
	public void answerQuestion() throws InterruptedException {
		
		synchronized(questions) {
			if (questions.isEmpty()) {
	
				System.out.println("No questions to answer. Waiting for Producer");
				questions.wait();
			} 
		}
		
		synchronized(questions){
			Thread.sleep(5000);
			System.out.println("Answered Question " + questions.get(0));
			
			questions.remove(0);
			
			questions.notify();
		}
		
		//question and notify can only be called in the synchronized block
	}
	
	
	@Override
	public void run() {
		
		while (true) {
			try {
				answerQuestion();
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

//	public int getQuestionNo() {
//		return questionNo;
//	}
//
//	public void setQuestionNo(int questionNo) {
//		this.questionNo = questionNo;
//	}

	@Override
	public String toString() {
		return "Producer [questions=" + questions + "]";
	}

	

}
