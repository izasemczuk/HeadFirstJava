package SimpleDotComGame;

import java.util.ArrayList;
import java.util.List;

public class SimpleDotCom {

    private List<Integer> locationCells = new ArrayList<Integer>();

    public String checkYourself(String userGuess) {
        int guessCell = Integer.parseInt(userGuess);
        String result = "miss";

        if (guessCell < 0 || guessCell > 6) {
            String wrongInput = "error";
            return wrongInput;
        }

        if (locationCells.contains(guessCell) == true) {
            locationCells.remove(locationCells.indexOf(guessCell));
            if (locationCells.isEmpty()) result = "kill";
            else result = "hit";
        }

        return result;

    }

    public void setLocationCells(List<Integer> locationCells) {
        this.locationCells = locationCells;
    }
}
