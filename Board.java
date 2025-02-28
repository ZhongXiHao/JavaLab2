public class Board {
    private final Piece[][] board;


    public Board() {
        int size = 8;
        board = new Piece[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Piece(0);
            }
        }

        board[3][charToInt('E')] = new Piece(1);
        board[4][charToInt('D')] = new Piece(1);
        board[3][charToInt('D')] = new Piece(2);
        board[4][charToInt('E')] = new Piece(2);
    }


    public int charToInt(char c) {
        if (c >= 'a' && c <= 'z') {
            c = (char) (c - 32);
        }
        return (int) c - 65;
    }


    public boolean isFinishGame() {
        int count = 0;
        for (Piece[] pieces : board) {  // 类似于 for i in board，i为1维数组
            for (Piece piece : pieces) {    // 类似于 for j in i，j为1维数组中的元素
                if (piece.pieceCode != 0) {
                    count++;
                }
            }
        }
        return count >= 64;
    }

    public void printBoard(Player p1, Player p2) {
        System.out.print("  ");

        for (int i = 65; i < 65 + board.length; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j].pieceStatus + " ");
            }
            if (i == 3) {
                String s = String.format("\t 玩家[%s] ", p1.getName());
                if (p1.isInTurn()) {
                    s += p1.getPieceStatus();
                }
                System.out.print(s);
            }
            if (i == 4) {
                String s = String.format("\t 玩家[%s] ", p2.getName());
                if (p2.isInTurn()) {
                    s += p2.getPieceStatus();
                }
                System.out.print(s);
            }
            System.out.println();
        }
    }

    public boolean isPositionOccupied(int x, Character y) {
        return board[x][charToInt(y)].pieceCode != 0;
    }

    public void setPiece(int x, Character y, int pieceCode) {
        board[x][charToInt(y)].changePiece(pieceCode);
    }
}
