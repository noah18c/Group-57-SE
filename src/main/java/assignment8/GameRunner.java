package assignment8;
import java.util.Random;

/**
 * Group name: 57
 * Student names: Noah Croes, Achilleas Leivadiotis
 * Student id’s: i6220934, i6327367
 */
public class GameRunner {

	public static void main(String[] args) {
		Game aGame = new Game(50);

		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");

		Random rand = new Random();

		boolean aWinner = false;

		do {

			aGame.roll(rand.nextInt(5) + 1);

			if (rand.nextInt(9) == 7) {
				aWinner = aGame.wrongAnswer();
			} else {
				aWinner = aGame.wasCorrectlyAnswered();
			}

		} while (!aWinner);

	}
}
