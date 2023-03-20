import java.util.List;

public class Board {
    private int boardSize;
    private Square[][] board; // teine pool konstruktorisse

    public Board(int boardSize) {
        this.boardSize = boardSize;
        this.board = setupBoard();
    }

    List<String> legalMoves;
    public static char manWhiteSymbol = 'O'; //ajutine
    public static char manBlackSymbol = 'X';

    public static char kingWhiteSymbol = '☼';
    public static char kingBlackSymbol = '✪';

    private final String[][] boardSetup10x10 = {
            {"", "bM", "", "bM", "", "bM", "", "bM", "", "bM"},
            {"bM", "", "bM", "", "bM", "", "bM", "", "bM", ""},
            {"", "bM", "", "bM", "", "bM", "", "bM", "", "bM"},
            {"bM", "", "bM", "", "bM", "", "bM", "", "bM", ""},
            {"", "", "", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", "", "", ""},
            {"", "wM", "", "wM", "", "wM", "", "wM", "", "wM"},
            {"wM", "", "wM", "", "wM", "", "wM", "", "wM", ""},
            {"", "wM", "", "wM", "", "wM", "", "wM", "", "wM"},
            {"wM", "", "wM", "", "wM", "", "wM", "", "wM", ""}};

    public void setBoard(String[][] boardSetup) {
        //TODO
    }

    public Square[][] setupBoard() {//kasutame boardSetup10x10, et luua laud nuppudega
        Square[][] board = new Square[boardSize][boardSize];
        if (boardSize == 10) {
            for (int i = 0; i < boardSetup10x10.length; i++) {
                for (int j = 0; j < boardSetup10x10[i].length; j++) {
                    switch (boardSetup10x10[i][j]) {
                        case "" -> board[i][j] = new Square(true, null);
                        case "bM" -> board[i][j] = new Square(false, new Man(false));
                        case "wM" -> board[i][j] = new Square(false, new Man(true));
                    }
                }
            }
        }
        return board;
    }

    public void printBoard() {
        //TODO
    }

    public void alterBoard(int x, int y, Square sq){
        board[x][y] = sq;
    }
    public void generateLegalMoves(/*must/valge*/) {
        //TODO
    }
}
