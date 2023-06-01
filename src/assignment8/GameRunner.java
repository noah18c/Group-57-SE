package assignment8;
import java.util.Random;

public class GameRunner {

	private static boolean aWinner;

	public static void main(String[] args) {
		Game aGame = new Game(50);

		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");

		Random rand = new Random();

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
