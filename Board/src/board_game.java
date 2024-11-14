public class board_game {
    protected String[][] board;
//creates the board
    public board_game() {

        board = new String[][]{
                {"-", "-", "-", "-"},
                {"-", "-", "-", "-"},
                {"-", "-", "-", "-"},
                {"-", "-", "-", "-"},
        };
    } //must enclose board_game method

    //prints out the board for the game
    public void print_board() {
        for (int i = 0; i < 4; i++) {
            System.out.println(board[i][0] + " "
                    + board[i][1] + " " + board[i][2] +
                    " " + board[i][3]);
        }

    }
    //Takes in the row and column input to pick the spot for the Blue chip
    //Int r and c are values for the row and column numbers
    public void blue(int r, int c) {
        board[r][c] = "B";
    }
    //Takes in the row and column input to pick the spot for the Red Chip
    //Int r and c are values for the row and column numbers
    public void red(int r, int c) {
        board[r][c] = "R";
    }
    //Checks if a spot is legal by whether or not it is within the bounds and if it has a - string or not
    //Int r and c are values for the row and column numbers
    //Return true for when the move is legal and false for otherwise
    public boolean legalMove(int r, int c) {
        if(r <= 3 && r >= 0 && c <= 3 && c >= 0){
            if (board[r][c].equals("-")) {
                return true;
            } else {
                System.out.println("You can't do that");
                return false;
            }
        }else{
            System.out.println("That spot is out of bounds. Please choose again.");
            return false;
        }
    }
}
