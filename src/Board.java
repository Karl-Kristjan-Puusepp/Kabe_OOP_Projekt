import java.util.List;

public class Board {
    private int boardSize;
    //private Square[][] board = new Square()[boardSize][boardSize]; // teine pool konstruktorisse

    List<String> legalMoves;
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
