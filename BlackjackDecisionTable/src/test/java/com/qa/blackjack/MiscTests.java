package com.qa.blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MiscTests {
	
	Blackjack bj = new Blackjack();
	
	@Test
	public void bothBustTest() {
		assertEquals("Expected a 0 as output",0,bj.result(25,23));
		assertEquals("Expected a 0 as output",0,bj.result(30,22));
		assertEquals("Expected a 0 as output",0,bj.result(26,28));
	}
	
	@Test
	public void invalidScoreTest() {
		assertEquals(-1,bj.result(3,12));
		assertEquals(-1,bj.result(10,36));
		assertEquals(-1,bj.result(2,33));
	}

}
