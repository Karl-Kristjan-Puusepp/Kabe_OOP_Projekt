public class Square {
    private boolean isEmpty;
    private Piece contains;

    public Square(boolean isEmpty, Piece contains) {
        this.isEmpty = isEmpty;
        this.contains = contains;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public Piece getContains() {
        return contains;
    }

    public void clearSquare() {
        isEmpty = true;
    }

    public void setSquarePiece(Piece piece) {
        contains = piece;
        isEmpty = false;
    }


}
