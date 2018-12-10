package com.tom;

public class Card {
	String[] suits = { "S", "H", "C", "D" };
	int value;

	public Card(int value) {
		this.value = value;
	}

	public String getCard() {
		return value % 13 + 1 + "" + suits[value / 13];
	}
}