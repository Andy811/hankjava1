package com.tom;

import java.util.Random;

public class PokerGame {
	static int[] card = new int[52];
	static int flower = 0;
	static String flower2;
	char suits[] = { 2660, 2665, 2663, 2666 };

	
	
	public static void main(String[] args) {

		System.out.println(getPoker());

		getPoker2();
		for (int i = 0; i < card.length; i++)
			System.out.println(card[i]+flower2);
	}

	
	
	public static String getPoker() {
		Random poker = new Random();
		int num = poker.nextInt(13) + 1;
		int suits = poker.nextInt(4) + 1;

		String result;
		switch (suits) {
		case 1:
			result = num + "S";
			break;

		case 2:
			result = num + "H";
			break;
		case 3:
			result = num + "D";
			break;
		case 4:
			result = num + "C";
			break;
		default:
			result = null;

		}
		return result;
	}

	public static void getPoker2() {

		for (int i = 0; i < card.length; i++) {
			card[i] = i + 1;
		}
		for (int i = 0; i < card.length; i++) {	
			flower = card[i] / 13;
		}

		switch (flower) {
		case 0:
			flower2 = "C";
			break;
		case 1:
			flower2 = "D";
			break;
		case 2:
			flower2 = "H";
			break;
		case 3:
			flower2 = "S";

			break;

		
		}
	//	Random random = new Random();

	}
}
