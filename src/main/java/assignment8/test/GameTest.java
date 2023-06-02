package assignment8.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class GameTest {
    private Game game;

    @BeforeEach
    public void setUp() {
        game = new Game(50);
    }

    @Test
    public void testAddPlayer() {
        game.add("Player1");
        PlayerHandler playerHandler = game.getPlayerHandler();
        Assertions.assertEquals(1, playerHandler.getPlayers().size());
    }

    @Test
    public void testRoll_WithPlayerInPenaltyBoxAndOddRoll() {
        Player player = new Player("Player1");
        player.setInPenaltyBox(true);
        game.getPlayerHandler().addPlayer(player);
        game.roll(3);
        Assertions.assertFalse(player.isInPenaltyBox());
        Assertions.assertEquals(3, player.getPlace());
    }

    @Test
    public void testRoll_WithPlayerInPenaltyBoxAndEvenRoll() {
        Player player = new Player("Player1");
        player.setInPenaltyBox(true);
        game.getPlayerHandler().addPlayer(player);
        game.roll(4);
        Assertions.assertTrue(player.isInPenaltyBox());
        Assertions.assertEquals(0, player.getPlace());
    }

    @Test
    public void testRoll_WithPlayerNotInPenaltyBox() {
        Player player = new Player("Player1");
        game.getPlayerHandler().addPlayer(player);
        game.roll(5);
        Assertions.assertFalse(player.isInPenaltyBox());
        Assertions.assertEquals(5, player.getPlace());
    }

    @Test
    public void testWasCorrectlyAnswered_WithPlayerInPenaltyBox() {
        Player player = new Player("Player1");
        player.setInPenaltyBox(true);
        game.getPlayerHandler().addPlayer(player);
        boolean result = game.wasCorrectlyAnswered();
        Assertions.assertFalse(result);
    }

    @Test
    public void testWasCorrectlyAnswered_WithPlayerNotInPenaltyBox() {
        Player player = new Player("Player1");
        game.getPlayerHandler().addPlayer(player);
        player.setCoins(5);
        boolean result = game.wasCorrectlyAnswered();
        Assertions.assertTrue(result);
    }

    @Test
    public void testWrongAnswer() {
        Player player = new Player("Player1");
        game.getPlayerHandler().addPlayer(player);
        game.wrongAnswer();
        Assertions.assertTrue(player.isInPenaltyBox());
    }

    @Test
    public void testDidPlayerWin_WithEnoughCoins() {
        Player player = new Player("Player1");
        player.setCoins(6);
        boolean result = game.didPlayerWin(player);
        Assertions.assertTrue(result);
    }

    @Test
    public void testDidPlayerWin_WithNotEnoughCoins() {
        Player player = new Player("Player1");
        player.setCoins(5);
        boolean result = game.didPlayerWin(player);
        Assertions.assertFalse(result);
    }
}
