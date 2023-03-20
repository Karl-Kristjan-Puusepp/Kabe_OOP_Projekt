import java.util.Scanner;

public class Game {

    Board gameBoard;

    public Game(int boardsize) {
        this.gameBoard = new Board(boardsize);
    }

    private boolean isPlayersMove;
    private final char[] col = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    private final int[] row = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    public void makeMove(Board board) {
        //TODO arvuti käik
        if (isPlayersMove) {
            Scanner input = new Scanner(System.in);
            System.out.println("Valge käik (<valge nupp> <asukoht>): ");
            String move = input.nextLine();

            String[] args = move.split(" ");
            int[] selectedPieceLocation = stringToIndexArray(args[0]);
            int[] destinationLocation = stringToIndexArray(args[1]);
            //TODO legalmove kontroll
        }
    }

    // kasutajalt küsitakse mis suuruses lauaga mängida
    // sisestab käigu a la d4-e5
    // kontrollitakse kas on legaalne, kui pole saadab vittu
    // (võtmised kohustuslikud, mõni kord saab mitu korda järjest võtta), kui mitu võimalikku võtmist,
    // näidatakse nuppude koordinaate, mida peab võtma
    // arvuti teeb vastu suvalise legaalse käigu
    // mäng jätkub, kuni ühte värvi nuppe enam laual pole
    // samuti tammide reeglid
    // lõpus väljastab võitja

    /*
         A   B   C   D   E   F   G   H   I   J
      -----------------------------------------
   10 |   |   |   |   |   |   |   |   |   |   |
      -----------------------------------------
   9  |   |   |   |   |   |   |   |   |   |   |
      -----------------------------------------
   8  |   |   |   |   |   |   |   |   |   |   |
      -----------------------------------------
   7  |   |   |   |   |   |   |   |   |   |   |
      -----------------------------------------
   6  |   |   |   |   |   |   |   |   |   |   |
      -----------------------------------------
   5  |   |   |   |   |   |   |   |   |   |   |
      -----------------------------------------
   4  |   |   |   |   |   |   |   |   |   |   |
      -----------------------------------------
   3  |   |   |   |   |   |   |   |   |   |   |
      -----------------------------------------
   2  |   |   |   |   |   |   |   |   |   |   |
      -----------------------------------------
   1  |   |   |   |   |   |   |   |   |   |   |
      -----------------------------------------
     */

    /**
     * Teisendab (mängija poolt) antud käsukoordinaadid mängu funktsionaalsele poolele sobivale kujule.
     * Hetkel ainult töötab tähtedega a-j ja arvudega 1-10.
     *
     * @param s Vaadeldav String objekt
     * @return int[]-tüüpi järjend, kus esimene indeks on malelaua Square[][] järjendi reaindeks ja teine indeks on veeruindeks.
     */
    public int[] stringToIndexArray(String s) {
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
}
