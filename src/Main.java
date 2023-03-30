
public class Main {
    public static void main(String[] args) {

        Game game = new Game(10);//boardsize prg 10 ainult
        game.gameBoard.setupBoard();
        game.gameBoard.printBoard();
        while(!game.isGameOver()) {
            game.playPly();
        }
    }
}
