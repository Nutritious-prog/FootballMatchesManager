package nutritious.prog.demo.model;

import nutritious.prog.demo.exceptions.ObjectAlreadyExistsException;
import nutritious.prog.demo.exceptions.ObjectNotAddedException;
import nutritious.prog.demo.exceptions.ObjectNotDeletedException;
import nutritious.prog.demo.exceptions.ObjectNotFoundException;
import nutritious.prog.demo.model.enums.Position;

import java.util.List;

public class Team {
    private String name;
    private Coach coach;
    private List<Player> players;

    public boolean addPlayer(Player player){
        if(player == null) throw new NullPointerException("Passed parameter is null.");

        try {
            if(checkIfPlayerExistsInTeam(player)) throw new ObjectAlreadyExistsException("Player already exists. Failed to add.");;
        } catch (ObjectAlreadyExistsException e) {
            e.printStackTrace();
            return false;
        }

        players.add(player);

        try {
            if(!checkIfPlayerExistsInTeam(player)) throw new ObjectNotAddedException("Failed to add player to team.");
        } catch (ObjectNotAddedException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean deletePlayer(Player player) {
        if(player == null) throw new NullPointerException("Passed parameter is null");

        try {
            if(!checkIfPlayerExistsInTeam(player)) throw new ObjectNotFoundException("Player not found. Failed to delete.");;
        } catch (ObjectNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        players.remove(player);

        try {
            if(checkIfPlayerExistsInTeam(player)) throw new ObjectNotDeletedException("Failed to remove player from team.");
        } catch (ObjectNotDeletedException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean editPlayerProperty(String currentName, String name){
        //TODO add logic
    }
    public boolean editPlayerProperty(int number){
        //TODO add logic
    }
    public boolean editPlayerProperty(Position position){
        //TODO add logic
    }
    private Player findPlayerByNameAndNumber(String name, int number){
        for(Player p : players) {
            if(p.getNumber() == number && name.equals(p.getName())) return p;
        }
        return null;
    }

    public Player findPlayerByNumber(int number){
        for(Player p : players) {
            if(p.getNumber() == number) return p;
        }
        return null;
    }
    public Player findPlayerByName(String name) {
        for(Player p : players) {
            if(name.equals(p.getName())) return p;
        }
        return null;
    }
    private boolean checkIfPlayerExistsInTeam(Player player){
        for(Player p : players) {
            if(player.equals(p)) return true;
        }

        return false;
    }
}
