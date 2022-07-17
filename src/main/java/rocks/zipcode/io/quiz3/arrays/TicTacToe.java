package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        board = new String[0][0];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[board.length];
        for (int i = 0; i < board.length; i++){
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if(rowIndex == 0 && board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2])){
            return true;
        }
        if(rowIndex == 1 && board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])){
            return true;
        }
        if(rowIndex == 2 && board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2])){
            return true;
        }
        else return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if(columnIndex == 0 && board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0])){
            return true;
        }
        if(columnIndex == 1 && board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1])){
            return true;
        }
        if(columnIndex == 2 && board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2])){
            return true;
        }
        else return false;
    }

    public String getWinner() {
        if(board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O")){
            return board[0][2];
        }
        if(board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O")){
            return board[1][2];
        }
        if(board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O")){
            return board[2][2];
        }
        if(board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")){
            return board[0][2];
        }
        if(board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X")){
            return board[1][1];
        }
        if(board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")){
            return board[2][0];
        }
        if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")){
            return board[0][2];
        }
        if(board[2][0].equals("X") && board[1][1].equals("X") && board[0][2].equals("X")){
            return board[2][0];
        }

        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
