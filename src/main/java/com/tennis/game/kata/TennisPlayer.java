
package com.tennis.game.kata;

import java.util.Arrays;
import java.util.List;

import lombok.Data;

/**
 * @author venkatmatcha
 * 
 * Lombok is used for automatic generation of setters, getters, tostring, hashcode methods
 *
 */
@Data
public class TennisPlayer {
	private int score;
	private String name;

	public TennisPlayer(String name) {
		this.name = name;
	}

	public void gainPoint() {
		this.score = this.score + 1;
	}

	public String getConvertedScores() {
		return actualScores.get(score);
	}

	public static final List<String> actualScores = Arrays.asList("0", "15", "30", "40");
}
