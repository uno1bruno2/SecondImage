package com.qa.blackjack;

public class Blackjack {
	
	public int result(int player, int dealer) {
		if (player > 31 || dealer > 31 || player < 4 || dealer < 4) {
			return -1;
		} else if (player > 21 && dealer > 21) {
			return 0;
		} else if (player > 21 || dealer > 21) {
			return Math.min(player, dealer);
		} else {
			return Math.max(player, dealer);
		}
	}

}
