package assignment8.test;

import assignment8.Game;
import assignment8.Player;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Group name: 57
 * Student names: Noah Croes, Achilleas Leivadiotis
 * Student id’s: i6220934, i6327367
 */

public class GameTest {

    @Test
    public void testAddPlayer() {
        Game game = new Game(50);
        game.add("Player1");
        Assertions.assertEquals(1, game.getPlayerHandler().getPlayers().size());
    }

    @Test
    public void testRoll_WithPlayerInPenaltyBoxAndOddRoll() {
        Game game = new Game(50);
        game.add("Player1");
        Player player = game.getPlayerHandler().getCurrentPlayer();
        player.setInPenaltyBox(true);
        game.roll(3);
        Assertions.assertFalse(player.isInPenaltyBox());
        Assertions.assertEquals(3, player.getPlace());
    }

    @Test
    public void testRoll_WithPlayerInPenaltyBoxAndEvenRoll() {
        Game game = new Game(50);
        game.add("Player1");
        Player player = game.getPlayerHandler().getCurrentPlayer();
        player.setInPenaltyBox(true);
        game.roll(4);
        Assertions.assertTrue(player.isInPenaltyBox());
        Assertions.assertEquals(0, player.getPlace());
    }

    @Test
    public void testRoll_WithPlayerNotInPenaltyBox() {
        Game game = new Game(50);
        game.add("Player1");
        Player player = game.getPlayerHandler().getCurrentPlayer();
        game.roll(5);
        Assertions.assertFalse(player.isInPenaltyBox());
        Assertions.assertEquals(5, player.getPlace());
    }

    @Test
    public void testWasCorrectlyAnswered_WithPlayerInPenaltyBox() {
        Game game = new Game(50);
        game.add("Player1");
        Player player = game.getPlayerHandler().getCurrentPlayer();
        player.setInPenaltyBox(true);
        game.getPlayerHandler().addPlayer(player);
        boolean result = game.wasCorrectlyAnswered();
        Assertions.assertFalse(result);
    }

    @Test
    public void testWasCorrectlyAnswered_WithPlayerNotInPenaltyBox() {
        Game game = new Game(50);
        game.add("Player1");
        Player player = game.getPlayerHandler().getCurrentPlayer();
        for(int i = 0; i < 5; i++)
            player.giveCoins();
        boolean result = game.wasCorrectlyAnswered();
        Assertions.assertTrue(result);
    }

    @Test
    public void testWrongAnswer() {
        Game game = new Game(50);
        game.add("Player1");
        Player player = game.getPlayerHandler().getCurrentPlayer();
        game.wrongAnswer();
        Assertions.assertTrue(player.isInPenaltyBox());
    }

    @Test
    public void testDidPlayerWin_WithEnoughCoins() {
        Game game = new Game(50);
        game.add("Player1");
        Player player = game.getPlayerHandler().getCurrentPlayer();
        for(int i = 0; i < 6; i++)
            player.giveCoins();
        boolean result = game.didPlayerWin(player);
        Assertions.assertTrue(result);
    }

    @Test
    public void testDidPlayerWin_WithNotEnoughCoins() {
        Game game = new Game(50);
        game.add("Player1");
        Player player = game.getPlayerHandler().getCurrentPlayer();
        for(int i = 0; i < 5; i++)
            player.giveCoins();
        boolean result = game.didPlayerWin(player);
        Assertions.assertFalse(result);
    }

    @Test
    public void testAddMultiplePlayers() {
        Game game = new Game(50);
        game.add("Player1");
        game.add("Player2");
        game.add("Player3");
        Assertions.assertEquals(3, game.getPlayerHandler().getPlayers().size());
    }

    @Test
    public void testRoll_WithPlayerInPenaltyBoxAndMaxRoll() {
        Game game = new Game(50);
        game.add("Player1");
        Player player = game.getPlayerHandler().getCurrentPlayer();
        player.setInPenaltyBox(true);
        game.roll(12);
        Assertions.assertTrue(player.isInPenaltyBox());
        Assertions.assertEquals(0, player.getPlace());
    }

    @Test
    public void testWasCorrectlyAnswered_WithPlayerInPenaltyBoxAndMaxCoins() {
        Game game = new Game(50);
        game.add("Player1");
        Player player = game.getPlayerHandler().getCurrentPlayer();
        player.setInPenaltyBox(true);
        for (int i = 0; i < 6; i++)
            player.giveCoins();
        boolean result = game.wasCorrectlyAnswered();
        Assertions.assertFalse(result);
    }

    @Test
    public void testWrongAnswer_WithPlayerInPenaltyBox() {
        Game game = new Game(50);
        game.add("Player1");
        Player player = game.getPlayerHandler().getCurrentPlayer();
        player.setInPenaltyBox(true);
        game.wrongAnswer();
        Assertions.assertTrue(player.isInPenaltyBox());
        Assertions.assertEquals(0, player.getPlace());
    }
}
