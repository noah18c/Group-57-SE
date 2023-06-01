package assignment8;

public class Game {
	private QuestionHandler questionHandler;
	private PlayerHandler playerHandler;

	// changed constructor to create question handler which will deal with the questions
	public Game(int amountOfQuestions) {
		questionHandler = new QuestionHandler(amountOfQuestions);
		playerHandler = new PlayerHandler();
	}

	public void add(String playerName) {
		playerHandler.addPlayer(new Player(playerName));
	}


	public void roll(int roll) {
		Player player = playerHandler.getCurrentPlayer();
		System.out.println("They have rolled a " + roll);

		if (player.isInPenaltyBox()) {
			if (roll % 2 != 0) {
				System.out.println(player.getName() + " is getting out of the penalty box");
				player.setInPenaltyBox(false);

				player.addPlace(roll);
				questionHandler.askQuestion(player);
			} else {
				System.out.println(player.getName() + " is not getting out of the penalty box");
			}
		} else {
			player.addPlace(roll);
			questionHandler.askQuestion(player);
		}
	}

	public boolean wasCorrectlyAnswered() {
		Player player = playerHandler.getCurrentPlayer();
		System.out.println("Answer was correct!!!!");
		if (player.isInPenaltyBox()) {
			playerHandler.nextPlayer();
			return false;
		} else {
			player.giveCoins();
			playerHandler.nextPlayer();
			return didPlayerWin(player);
		}
	}

	public boolean wrongAnswer() {
		System.out.println("Question was incorrectly answered");
		System.out.println(playerHandler.getCurrentPlayer().getName() + " was sent to the penalty box");
		playerHandler.getCurrentPlayer().setInPenaltyBox(true);
		playerHandler.nextPlayer();
		return false;
	}

	private boolean didPlayerWin(Player player) {
		if (player.getCoins() >= 6){
			System.out.println("We have a winner! Congrats " + player.getName());
			return true;
		} else {
			return false;
		}
	}
}
