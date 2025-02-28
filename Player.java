public class Player {
    private final String name;
    private final int pieceCode;
    private boolean inTurn;

    public Player(String name, int pieceCode, boolean inTurn) {
        this.name = name;
        this.pieceCode = pieceCode;
        this.inTurn = inTurn;
    }

    public String getName() {
        return name;
    }

    public int getPieceCode() {
        return pieceCode;
    }

    public boolean isInTurn() {
        return inTurn;
    }

    public String getPieceStatus() {
        String[] pieceStatusOptions = {".", "●", "○"};
        return pieceStatusOptions[pieceCode];
    }

    public void setInTurn(boolean inTurn) {
        this.inTurn = inTurn;
    }
}
