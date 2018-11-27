package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {

		System.out.print(getPoker());
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
}
