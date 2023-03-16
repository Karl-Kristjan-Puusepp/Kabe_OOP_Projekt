public abstract class Piece {
    private boolean color; // 1-valge 0-must

    public Piece(boolean color) {
        this.color = color;
    }

    public boolean isColor() {
        return color;
    }
}
