package SimpleDotComGame;

/**
 * Created by Dell on 2015-08-24.
 */
public class Board {

    private String boardHeader = "0123456";
    private String[] board = {"-", "-", "-", "-", "-", "-", "-"};


    public String[] getBoard() {
        return board;
    }

    public void setBoard(String[] board) {
        this.board = board;
    }

    public void setBoardElement(int loc, String element) {
        this.board[loc] = element;
    }

    public void displayBoard(){
        System.out.println(boardHeader);
        for (String znaczek : board) {
            System.out.print(znaczek);
        }
        System.out.println();
    }
}
