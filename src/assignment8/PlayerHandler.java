package assignment8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class PlayerHandler {

    private ArrayList<Player> players;
    private Queue<Player> queue;

    public PlayerHandler(){
        players = new ArrayList<>();
        queue = new LinkedList<>();
    }

    public void addPlayer(Player player){
        players.add(player);
        queue.offer(player);
        System.out.println(player.getName() + " was added");
        System.out.println("They are player number " + players.size());
    }

    public Player getCurrentPlayer(){
        Player player = queue.peek();
        System.out.println(player.getName() + " is the current player");
        return player;
    }

    //moves to and returns the next player
    public Player nextPlayer(){
        Player player = queue.poll();
        queue.offer(player);
        return queue.peek();
    }

    public Player getTopPlayer(){
        Player topPlayer = players.get(0);
        for(Player player: players){
            if(topPlayer.getCoins()<player.getCoins()){
                topPlayer = player;
            }
        }
        System.out.println("The top player is "+topPlayer.getName());
        return topPlayer;
    }
}
