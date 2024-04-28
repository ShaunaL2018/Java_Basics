package com.my.threading;

public class Sequence {
	
	int value = 0;
	
//	public Sequence(int value) {
//		this.value = value;
//	}
	
//	public int getNext(int value) {
//		return value++;
//	}
	
	public int getNext() {
		value++;
		return value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

}
