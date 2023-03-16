public class Man extends Piece {

    private char symbol;

    public Man(boolean color) {
        super(color);
        if (super.isColor())
            this.symbol = Board.manWhiteSymbol;
        else this.symbol = Board.manBlackSymbol;
    }
}
