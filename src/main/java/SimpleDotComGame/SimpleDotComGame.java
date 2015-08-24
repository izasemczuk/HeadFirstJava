package SimpleDotComGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String[] args) {

        System.out.println("Welcome to the Simple DotCom Game!");

        SimpleDotCom ship = new SimpleDotCom();
        Board board = new Board();

        int numberOfGuesses = 0;

        Scanner czytnik = new Scanner(System.in);

        int i = (int) (Math.random() * 5);
        List<Integer> locations = new ArrayList<Integer>();
        locations.add(i);
        locations.add(i + 1);
        locations.add(i + 2);
        ship.setLocationCells(locations);

        while (true) {
            board.displayBoard();
            System.out.print("What's your guess? ");
            String userGuess = czytnik.next();                  // oni tutaj dorzucili gotowa klase, ale wole Scanner
            numberOfGuesses++;
            String result = ship.checkYourself(userGuess);

            if (result == "miss") {
                if (board.getBoard()[Integer.parseInt(userGuess)] != "-") System.out.println("You were there already.");
                else {
                    board.setBoardElement(Integer.parseInt(userGuess), "x");
                    System.out.println(result);
                }
            }

            if (result == "hit") {
                if (board.getBoard()[Integer.parseInt(userGuess)] != "-") System.out.println("You were there already.");
                else {
                    board.setBoardElement(Integer.parseInt(userGuess), "S");
                    System.out.println(result);
                }
            }

            if (result == "kill") {
                board.setBoardElement(Integer.parseInt(userGuess), "S");
                board.displayBoard();
                System.out.println(result);
                System.out.println("Congratulations! You finished the game with rating: " + numberOfGuesses);
                break;

            }

            if (result == "error") {
                System.out.println("Please type a number between 0 and 6!");
            }


        }


    }
}