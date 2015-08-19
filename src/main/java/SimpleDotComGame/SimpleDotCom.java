package SimpleDotComGame;

public class SimpleDotCom {

    private int[] locationCells;
    private int numOfHits = 0;

    public String checkYourself(String userGuess) {
        int guessCell = Integer.parseInt(userGuess);
        String result = "miss";

        if (guessCell < 0 || guessCell > 6)
        {
            String wrongInput = "error";
            return wrongInput;
        }

        for (int cell : locationCells) {
              if (guessCell == cell) {
                  result = "hit";
                  numOfHits++;
                  break;
              }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;


    }


    public int getNumOfHits() {
        return numOfHits;
    }

    public void setNumOfHits(int numOfHits) {
        this.numOfHits = numOfHits;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }
}
