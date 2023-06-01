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

	public int howManyPlayers() {
		return players.size();
	}

	public void roll(int roll) {
		System.out.println(players.get(currentPlayer) + " is the current player");
		System.out.println("They have rolled a " + roll);

		if (inPenaltyBox[currentPlayer]) {
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

	private String currentCategory() {
		if (places[currentPlayer] == 0)
			return "Pop";
		if (places[currentPlayer] == 4)
			return "Pop";
		if (places[currentPlayer] == 8)
			return "Pop";
		if (places[currentPlayer] == 1)
			return "Science";
		if (places[currentPlayer] == 5)
			return "Science";
		if (places[currentPlayer] == 9)
			return "Science";
		if (places[currentPlayer] == 2)
			return "Sports";
		if (places[currentPlayer] == 6)
			return "Sports";
		if (places[currentPlayer] == 10)
			return "Sports";
		return "Rock";
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
		return player.getCoins() >= 6;
	}
}
