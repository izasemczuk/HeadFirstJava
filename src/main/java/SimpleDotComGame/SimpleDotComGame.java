package SimpleDotComGame;

import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String[] args) {

        System.out.println("Welcome to the Simple DotCom Game!");

        SimpleDotCom ship = new SimpleDotCom();

        int numberOfGuesses = 0;
        String boardHeader = "0123456";
        String[] board = {"-", "-", "-", "-", "-", "-", "-"};

        Scanner czytnik = new Scanner(System.in);

        int i = (int) (Math.random() * 5);
        int[] locations = {i, i + 1, i + 2};
        ship.setLocationCells(locations);

        while (true) {
            System.out.println(boardHeader);
            System.out.println(board[0] + board[1] + board[2] + board[3] + board[4] + board[5] + board[6]);
            System.out.print("What's your guess? ");
            String userGuess = czytnik.next();                  // oni tutaj dorzucili gotowa klase, ale wole Scanner
            numberOfGuesses++;
            String result = ship.checkYourself(userGuess);

            if (result == "miss") {
                if (board[Integer.parseInt(userGuess)] != "-") System.out.println("You were there already.");
                board[Integer.parseInt(userGuess)] = "x";
            }

            if (result == "hit") {
                if (board[Integer.parseInt(userGuess)] != "-") System.out.println("You were there already.");
                board[Integer.parseInt(userGuess)] = "S";
            }

            if (result == "kill") {
                board[Integer.parseInt(userGuess)] = "S";
                System.out.println(boardHeader);
                System.out.println(board[0] + board[1] + board[2] + board[3] + board[4] + board[5] + board[6]);
                System.out.println("Congratulations! You finished the game with rating: " + numberOfGuesses);
                break;

            }

            if (result == "error") {
                System.out.println("Please type a number between 0 and 6!");
            }


        }


    }
}