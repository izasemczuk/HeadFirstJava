package DotComGame;

import lombok.Setter;
import lombok.Getter;

import java.util.ArrayList;

/**
 * Created by izasemczuk on 2015-08-30.
 * HeadFirst Java 2nd Edition - chapter 6
 */

public class DotCom {

    private @Getter @Setter String name;
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        this.locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("----------------> You sunk " + this.getName() + "!   Y A A A A Y !");
            }
            else result = "hit";
        }

        return result;
    }
}