import java.util.Scanner;

public class Game {

    public Board gameBoard;
    private boolean gameOver;
    private final char[] col = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    private final int[] row = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    public Game(int boardsize) {
        this.gameBoard = new Board(boardsize);
        gameOver = false;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void playPly() {
        boolean moveMade = false;
        gameBoard.generateLegalMoves(true);
        while(!moveMade) {
            if(gameBoard.isGameOver()) {
                gameOver = true;
                System.out.println("Game Over");
                return;
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Valge käik (<valge nupp> <asukoht>): ");
            String move = input.nextLine();

            String[] args = move.split(" ");
            int[] selectedPieceLocation = stringToIndexArray(args[0]);
            int[] destinationLocation = stringToIndexArray(args[1]);
            int[] moveAsCoords = {selectedPieceLocation[0], selectedPieceLocation[1], destinationLocation[0], destinationLocation[1]};
            if (moveAsCoords.length != 4) {
                System.out.println("Ei ole legaalne käik, proovi uuesti");
            } else if (gameBoard.isLegalMove(moveAsCoords)) {
                gameBoard.move(moveAsCoords);
                gameBoard.generateLegalMoves(true, destinationLocation);
                gameBoard.printBoard();
                moveMade = true;
                for (int[] legalMove : gameBoard.legalMoves) {
                    if(legalMove.length == 4)
                        moveMade = false;
                }
            } else {
                System.out.println("Ei ole legaalne käik, proovi uuesti");
            }

        }
        gameBoard.generateLegalMoves(false);
        int randomIndex = (int) (Math.random()*gameBoard.legalMoves.size());
        int[] computerMove = gameBoard.legalMoves.get(randomIndex);
        while (computerMove.length == 0) {
            randomIndex = (int) (Math.random() * gameBoard.legalMoves.size());
            computerMove = gameBoard.legalMoves.get(randomIndex);
        }
        gameBoard.move(computerMove);
        gameBoard.printBoard();
        System.out.println("Computer made the move: " + moveToString(computerMove));
    }

    /**
     * Teisendab (mängija poolt) antud käsukoordinaadid mängu funktsionaalsele poolele sobivale kujule.
     * Hetkel ainult töötab tähtedega a-j ja arvudega 1-10.
     *
     * @param s Vaadeldav String objekt
     * @return int[]-tüüpi järjend, kus esimene indeks on malelaua Square[][] järjendi reaindeks ja teine indeks on veeruindeks.
     */
    public int[] stringToIndexArray(String s) {
        if (s.length() < 2) return new int[]{};
        int[] indexArr = new int[2];
        s=s.toLowerCase();
            String[] temp = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)"); //https://stackoverflow.com/questions/8270784/how-to-split-a-string-between-letters-and-digits-or-between-digits-and-letters
            if (temp[0].matches("-?\\d+(\\.\\d+)?")) {// kui on arv
                int n = Integer.parseInt(temp[0]);
                for (int j = 0; j < row.length; j++) {
                    if (row[j] == n) {
                        indexArr[0] = j;
                        break;
                    }
                }
                for (int j = 0; j < col.length; j++) {
                    if (col[j] == temp[1].charAt(0)) {
                        indexArr[1] = j;
                        break;
                    }

                }
            } else {
                int n = Integer.parseInt(temp[1]);
                for (int j = 0; j < row.length; j++) {
                    if (row[j] == n) {
                        indexArr[0] = j;
                        break;
                    }
                }
                for (int j = 0; j < col.length; j++) {
                    if (col[j] == temp[0].charAt(0)) {
                        indexArr[1] = j;
                        break;
                    }

                }
            }

        return indexArr;
    }

    public String moveToString(int[] move) {
        StringBuilder str = new StringBuilder();
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char startCol = letters[move[1]];
        char endCol = letters[move[3]];
        int startRow = 10-move[0];
        int endRow = 10-move[2];
        str.append(startCol);
        str.append(startRow);
        str.append(" ");
        str.append(endCol);
        str.append(endRow);
        return str.toString();
    }
}
