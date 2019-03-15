package com.qa.blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjackTest {
	
	Blackjack bj = new Blackjack();
	
	@Test
	public void bothBustTest() {
		assertEquals("Expected a 0 as output",0,bj.result(25,23));
		assertEquals("Expected a 0 as output",0,bj.result(30,22));
		assertEquals("Expected a 0 as output",0,bj.result(26,28));
	}
	
	@Test
	public void dealerBustTest() {
		assertEquals("Expected a 19 as output",19,bj.result(19,25));
		assertEquals("Expected a 10 as output",10,bj.result(10,29));
		assertEquals("Expected a 18 as output",18,bj.result(18,30));
	}
	
	@Test
	public void playerBustTest() {
		assertEquals(12,bj.result(26,12));
	}
	
	@Test
	public void dealerWinsTest() {
		assertEquals(21,bj.result(19,21));
	}
	
	@Test
	public void playerWinsTest() {
		assertEquals(20,bj.result(20,19));
	}
	
	@Test
	public void invalidScoreTest() {
		assertEquals(-1,bj.result(3,12));
		assertEquals(-1,bj.result(10,36));
		assertEquals(-1,bj.result(2,33));
	}

}
