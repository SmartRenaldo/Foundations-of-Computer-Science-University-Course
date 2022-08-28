import java.util.ArrayList;

public class Club {
    private ArrayList<Player> members = new ArrayList<>();

    //addMember a void method that takes a member as a parameter and adds the member to its collection of members.
    public void addMember(Player player) {
        members.add(player);
    }

    //a boolean method called removeMemberById which takes an integer parameter representing the id of a Player
    // and tries to remove a player with that id from its collection of members.
    // If the removal is successful this method should return true.
    // If the player can't be found then this method should return false.
    public boolean removeMemberById(int id) {
        Player remove = members.remove(id);
        if (remove == null) {
            return false;
        }
        return true;
    }

    //a method called getHighestRankedPlayer that returns the Player in the club that has the highest ranking.
    // Note that if more than one player has the equal highest ranking the player
    // who was added to the club most recently will be the one returned.
    public Player getHighestRankedPlayer() {
        // If the club is empty this method should return null.
        if (members.size() == 0) {
            return null;
        }

        //store highest score
        int highestScore = members.get(0).getRanking();
        //store index of player
        int index = 0;
        for (int i = 1; i < members.size(); i++) {
            if (members.get(i).getRanking() >= highestScore) {
                highestScore = members.get(i).getRanking();
                index = i;
            }
        }

        return members.get(index);
    }

    //printMembers() method
    // that calls toString on each Player in the club to print out all the members in the order in which they were added.
    public void printMembers(){
        for (int i = 0; i < members.size(); i++) {
            members.get(i).toString();
        }
    }
}
