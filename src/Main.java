import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("       A    B   C   D   E   F   G   H   I   J \n" +
                "      -----------------------------------------\n" +
                "   10 |   |   |   |   |   |   |   |   |   |   |\n" +
                "      -----------------------------------------\n" +
                "   9  |   |   |   |   |   |   |   |   |   |   |\n" +
                "      -----------------------------------------\n" +
                "   8  |   |   |   |   |   |   |   |   |   |   |\n" +
                "      -----------------------------------------\n" +
                "   7  |   |   |   |   |   |   |   |   |   |   |\n" +
                "      -----------------------------------------\n" +
                "   6  |   |   |   |   |   |   |   |   |   |   |\n" +
                "      -----------------------------------------\n" +
                "   5  |   |   |   |   |   |   |   |   |   |   |\n" +
                "      -----------------------------------------\n" +
                "   4  |   |   |   |   |   |   |   |   |   |   |\n" +
                "      -----------------------------------------\n" +
                "   3  |   |   |   |   |   |   |   |   |   |   |\n" +
                "      -----------------------------------------\n" +
                "   2  |   |   |   |   |   |   |   |   |   |   |\n" +
                "      -----------------------------------------\n" +
                "   1  |   |   |   |   |   |   |   |   |   |   |\n" +
                "      -----------------------------------------  ");

*/

        Game game = new Game(10);//boardsize prg 10 ainult
        game.gameBoard.setupBoard();
        game.gameBoard.printBoard();
        game.gameBoard.generateLegalMoves(true);
        game.playPly();
        game.gameBoard.printBoard();
        game.playPly();
        game.gameBoard.printBoard();

        game.playPly();
        game.gameBoard.printBoard();

        game.playPly();
        game.gameBoard.printBoard();
    }



}
