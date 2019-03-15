package com.qa.blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerResultTests {
	
	Blackjack bj = new Blackjack();


	@Test
	public void dealerBustTest() {
		assertEquals("Expected a 19 as output",19,bj.result(19,25));
		assertEquals("Expected a 10 as output",10,bj.result(10,29));
		assertEquals("Expected a 18 as output",18,bj.result(18,30));
	}
	

	@Test
	public void playerWinsTest() {
		assertEquals(20,bj.result(20,19));
	}
	
	
}
