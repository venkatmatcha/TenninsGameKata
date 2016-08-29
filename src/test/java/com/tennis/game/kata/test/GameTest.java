package com.tennis.game.kata.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.tennis.game.kata.TennisGame;
import com.tennis.game.kata.TennisPlayer;

public class GameTest {

	TennisPlayer matcha;
	TennisPlayer sharief;
	
	TennisGame game;

	@Before
	public void beforeGameTest() {
		matcha = new TennisPlayer("Matcha");
		sharief = new TennisPlayer("Sharief");
		game = new TennisGame(matcha, sharief);
	}

	@Test
	public void scoresSetToZeroAtStartOfTheGame() {
		TennisGame game = new TennisGame(matcha, sharief);
		assertEquals(game.getScore(), "0, 0");
	}

	@Test
	public void zeroFifteenScoreTest() {
		sharief.gainPoint();
		assertEquals(game.getScore(), "0, 15");
	}
	
	@Test
	public void fifteenThirtyScoreTest() {
		sharief.gainPoint();
		sharief.gainPoint();
		matcha.gainPoint();
		assertEquals(game.getScore(), "15, 30");
	}

	@Test
	public void advantageScoreTest() {

		for (int i = 0; i < 4; i++) {
			matcha.gainPoint();
			if (i > 2) {
				continue;
			}
			sharief.gainPoint();
		}
		assertEquals(game.getScore(), "ADVANTAGE Matcha");
	}

	@Test
	public void dueceTest() {
		for (int i = 0; i < 4; i++) {
			matcha.gainPoint();
			sharief.gainPoint();
		}
		assertEquals(game.getScore(), "DEUCE");
	}

	@Test
	public void winnerTest() {
		for (int i = 0; i < 5; i++) {
			matcha.gainPoint();
			if (i > 2) {
				continue;
			}
			sharief.gainPoint();
		}
		assertEquals(game.getScore(), "Matcha has won the game");
	}

}
