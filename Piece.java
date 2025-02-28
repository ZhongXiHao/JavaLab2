public class Piece {
    public int pieceCode;
    public String pieceStatus;

    // 0: empty, 1: black, 2: white
    public Piece(int pieceCode) {
        this.pieceCode = pieceCode;

        String[] pieceStatusOptions = {".", "●", "○"};
        this.pieceStatus = pieceStatusOptions[pieceCode];
    }

    public void changePiece(int pieceCode) {
        this.pieceCode = pieceCode;
        String[] pieceStatusOptions = {".", "●", "○"};
        this.pieceStatus = pieceStatusOptions[pieceCode];
    }

    public void convertPiece() {
        this.pieceCode = 3 - this.pieceCode;
        String[] pieceStatusOptions = {".", "●", "○"};
        this.pieceStatus = pieceStatusOptions[this.pieceCode];
    }

}
