package game.beans;

import java.util.Random;

public class Game {

	private int userGuess;
	private int answer;
	
	public Game() {
		super();
	}
	
	public Game(int userGuess, int answer) {
		super();
		this.userGuess = userGuess;
		this.answer = answer;
	}
	
	public int easyGame() {
		int min = 1;
		int max = 10;
		Random rand = new Random();
		
		return rand.nextInt((max-min) + 1) + min;	
	}
	
	public int intermediateGame() {
		int min = 1;
		int max = 20;
		Random rand = new Random();
		
		return rand.nextInt((max-min) + 1) + min;	
	}
	
	public int insaneGame() {
		int min = 1;
		int max = 100;
		Random rand = new Random();
		
		return rand.nextInt((max-min) + 1) + min;	
	}
	
	public int getUserGuess() {
		return userGuess;
	}
	public void setUserGuess(int userGuess) {
		this.userGuess = userGuess;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	
}
