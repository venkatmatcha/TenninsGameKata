package com.tennis.game.kata;


/**
 * @author venkatmatcha
 *
 */


public class TennisGame {

	private TennisPlayer player1;
	private TennisPlayer player2;

	
	public TennisGame(TennisPlayer player1, TennisPlayer player2) {
	        this.player1 = player1;
	        this.player2 = player2;
	    }

	/**
	 * @return
	 */
	public String getScore() {
		if (player1.getScore() >= 3 && player2.getScore() >= 3) {
			if (Math.abs(player2.getScore() - player1.getScore()) >= 2) {
				return findLeadPlayer().getName() + " has won the game";
			} else if (player1.getScore() == player2.getScore()) {
				return "DEUCE";
			} else {
				return "ADVANTAGE " + findLeadPlayer().getName();
			}
		}else if(Math.abs(player2.getScore() - player1.getScore()) > 3){
       	 	return findLeadPlayer().getName() + " wins this game";
       }
		else {
			return player1.getConvertedScores() + ", " + player2.getConvertedScores();
		}
	}

	
	/**
	 * @return
	 */
	public TennisPlayer findLeadPlayer() {
		return (player1.getScore() > player2.getScore()) ? player1 : player2;
	}

}
