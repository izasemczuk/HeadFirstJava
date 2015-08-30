package DotComGame;

/**
 * Created by izasemczuk on 2015-08-30.
 * HeadFirst Java 2nd Edition - chapter 6
 *
 * Bonus class I made
 * to store and display the grid
 * 7x7 grid
 */

public class Board {

    String boardHeader = "  0 1 2 3 4 5 6";
    String[] boardA = {"A ", ". ", ". ", ". ", ". ", ". ", ". ", ". "};
    String[] boardB = {"B ", ". ", ". ", ". ", ". ", ". ", ". ", ". "};
    String[] boardC = {"C ", ". ", ". ", ". ", ". ", ". ", ". ", ". "};
    String[] boardD = {"D ", ". ", ". ", ". ", ". ", ". ", ". ", ". "};
    String[] boardE = {"E ", ". ", ". ", ". ", ". ", ". ", ". ", ". "};
    String[] boardF = {"F ", ". ", ". ", ". ", ". ", ". ", ". ", ". "};
    String[] boardG = {"G ", ". ", ". ", ". ", ". ", ". ", ". ", ". "};


    public void displayBoard() {
        System.out.println();
        System.out.println(boardHeader);
        for (String znaczek : boardA) {
            System.out.print(znaczek);
        }
        System.out.println();
        for (String znaczek : boardB) {
            System.out.print(znaczek);
        }
        System.out.println();
        for (String znaczek : boardC) {
            System.out.print(znaczek);
        }
        System.out.println();
        for (String znaczek : boardD) {
            System.out.print(znaczek);
        }
        System.out.println();
        for (String znaczek : boardE) {
            System.out.print(znaczek);
        }
        System.out.println();
        for (String znaczek : boardF) {
            System.out.print(znaczek);
        }
        System.out.println();
        for (String znaczek : boardG) {
            System.out.print(znaczek);
        }
        System.out.println();
        System.out.println();
    }

    public void updateBoard(String userGuess, String result) {
        String row = String.valueOf(userGuess.charAt(0));
        int col = Integer.parseInt(String.valueOf(userGuess.charAt(1)))+1;
        if (result.equals("miss")) {
            if (row.equals("A") || row.equals("a")) boardA[col] = "o ";
            if (row.equals("B") || row.equals("b")) boardB[col] = "o ";
            if (row.equals("C") || row.equals("c")) boardC[col] = "o ";
            if (row.equals("D") || row.equals("d")) boardD[col] = "o ";
            if (row.equals("E") || row.equals("e")) boardE[col] = "o ";
            if (row.equals("F") || row.equals("f")) boardF[col] = "o ";
            if (row.equals("G") || row.equals("g")) boardG[col] = "o ";
        } else {
            if (row.equals("A") || row.equals("a")) boardA[col] = "X ";
            if (row.equals("B") || row.equals("b")) boardB[col] = "X ";
            if (row.equals("C") || row.equals("c")) boardC[col] = "X ";
            if (row.equals("D") || row.equals("d")) boardD[col] = "X ";
            if (row.equals("E") || row.equals("e")) boardE[col] = "X ";
            if (row.equals("F") || row.equals("f")) boardF[col] = "X ";
            if (row.equals("G") || row.equals("g")) boardG[col] = "X ";
        }

    }
}
