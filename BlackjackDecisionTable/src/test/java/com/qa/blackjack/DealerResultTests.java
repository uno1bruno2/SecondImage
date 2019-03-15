package com.qa.blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DealerResultTests {
	
	Blackjack bj = new Blackjack();
	
	@Test
	public void playerBustTest() {
		assertEquals(12,bj.result(26,12));
	}
	
	@Test
	public void dealerWinsTest() {
		assertEquals(21,bj.result(19,21));
	}

}
