package com.kooking.dto;

public enum Genders {
	MALE(1), FEMALE(2), OTHER(-1);
	private final int value;
	
	private Genders(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
