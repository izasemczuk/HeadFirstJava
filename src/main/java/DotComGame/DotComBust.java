package DotComGame;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by izasemczuk on 2015-08-30.
 * HeadFirst Java 2nd Edition - chapter 6
 */

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    private Board board = new Board();
    private ArrayList<String> userGuesses = new ArrayList<String>();

    private void setUpGame() {

        DotCom ship1 = new DotCom();
        DotCom ship2 = new DotCom();
        DotCom ship3 = new DotCom();

        ship1.setName("google.com");
        ship2.setName("yahoo.com");
        ship3.setName("netscape.com");

        dotComsList.add(ship1);
        dotComsList.add(ship2);
        dotComsList.add(ship3);

        System.out.println("Welcome to DotCom Game!");
        System.out.print("Your goal is to sink three dot coms:");
        System.out.println(ship1.getName() + ", " + ship2.getName() + " and " + ship3.getName());
        System.out.println("Try to sink them all in the fewest number of guesses!");
        System.out.println();
        System.out.println(".    is not yet checked");
        System.out.println("o    was a miss");
        System.out.println("X    was a hit");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);

        }

    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            board.displayBoard();
            String userGuess = helper.getUserInput("Enter a guess: ");
            if (userGuesses.contains(userGuess)) System.out.println("----------------> You already tried that!");
            else {
                checkUserGuess(userGuess);
                userGuesses.add(userGuess);
            }
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) break;
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        board.updateBoard(userGuess,result);
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are on the bottom of the ocean!");
        System.out.println("It took you " + numOfGuesses + " guesses to achieve that!");
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}
