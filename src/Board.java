import java.util.List;

public class Board {
    private int boardSize;
    //private Square[][] board = new Square()[boardSize][boardSize]; // teine pool konstruktorisse

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
            {"",  "",  "", "",   "", "",   "",  "",  "",  "" },
            {"",  "",  "", "",   "", "",   "",  "",  "",  "" },
            {"", "bM", "", "bM", "", "bM", "", "bM", "", "bM"},
            {"bM", "", "bM", "", "bM", "", "bM", "", "bM", ""},
            {"", "bM", "", "bM", "", "bM", "", "bM", "", "bM"},
            {"bM", "", "bM", "", "bM", "", "bM", "", "bM", ""}};

    public void setBoard(String[][] boardSetup){
        //TODO
    }

    public void printBoard(){
        //TODO
    }

    public void generateLegalMoves(/*must/valge*/){
        //TODO
    }
}
