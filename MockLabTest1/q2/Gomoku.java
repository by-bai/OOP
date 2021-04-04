import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * The 15 X 15 board for the Gomoku game.
 */
public class Gomoku {
    private char[][] board;

    /**
     * Specific constructor
     *
     * @param board the sudoku board
     * @throws java.lang.IllegalArgumentException   if the board is null or the board passed in does not have 15 rows
     *                                              or 15 columns
     */
    public Gomoku(char[][] board) {
        if (board == null) {
            throw new IllegalArgumentException("board cannot be null");
        }
        if (board.length != 15) {
            throw new IllegalArgumentException("board must have 15 rows");
        }
        ArrayList<Integer> invalidRows = new ArrayList<Integer>();


        for (int i = 0; i < board.length; i++) {
            if (board[i] == null || board[i].length != 15) {
                invalidRows.add(i);
            }
        }
        if (invalidRows.size() > 0) {
            throw new IllegalArgumentException("Rows: " + invalidRows + " do not have 15 columns");
        }
        this.board = board;
    }

    /**
     * the player places a piece('X' or 'O') in the specified row and col
     * @param player the player ('X' or 'O')
     * @param row the row
     * @param col the col
     * @return true if there are 5 pieces belonging to the player either vertically, horizontally, or diagonally.
     */

    public boolean placeMove(char player, int row, int col) {

        return false;

    }

    /**
     *
     * Counts the number of moves(either 'X' or 'O') we have in this direction.
     * @param player the value is either 'O' or 'X'
     * @param currentRow the row-position of the player's piece('X' or 'O')
     * @param currentCol the col-position of the player's piece('X' or 'O')
     * @param dir the direction(horizontally, vertically, or diagonally). We are counting for the number of pieces
     *            (either 'X' or 'O') that we have in this direction.
     * @return
     */
    public int count(char player, int currentRow, int currentCol, Direction dir) {
        return 0;

    }


}
