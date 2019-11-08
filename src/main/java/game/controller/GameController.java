package game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import game.beans.Game;

@Controller
public class GameController {
	@GetMapping("/submit")
	public String randomGame(@RequestParam(name="userGuess", required=false) String guess, Model model) {
		if(guess == null) {
			return "index";
		}
		
		int userGuess = Integer.parseInt(guess);
		Game play = new Game();
		int number = play.easyGame();
		String message;
		
		if(userGuess == number) {
			message = "You guessed correctly! The answer was " + userGuess + ".";
		} else {
			message = "I'm sorry! The correct answer was " + number + ".";
		}
		
		return message;		
	}
}
