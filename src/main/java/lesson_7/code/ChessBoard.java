public class ChessBoard {
    public static void main(String[] args) {
        int[][] board = createCheessBoard();
        printBoard(board);
        int i= 0;
        int j= 1;
    }

    public static int[][] createCheessBoard() {
        int[][] board = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                // farbe von Zellen,weiss - 0,schwarz - 1
                board[i][j] = (i + j) % 2;
    }
}
        return board;
    }

    public static void printBoard( int [][] board){
        for (int[] row : board) {
            for ( int cell : row) {
                System.out.print( cell + " ");
            }
            System.out.println();
        }
    }
}











