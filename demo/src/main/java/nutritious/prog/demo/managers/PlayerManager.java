package nutritious.prog.demo.managers;

import nutritious.prog.demo.model.Player;

import java.util.List;

public class PlayerManager {
    List<Player> players;
    public boolean addPlayer(Player player){
        if(player == null) throw new NullPointerException("Passed parameter is null.");

        //TODO Check if player exists

        players.add(player);
        return true;
    }

    public Player findPlayerByNumber(int number){
        for(Player p : players) {
            if(p.getNumber() == number) return p;
        }
        return null;
    }
}
