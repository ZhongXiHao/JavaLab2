public class Main {

    // 清空屏幕
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void loopAllPositions() {
        for (int i = 1; i < 9; i++) {
            for (char j = 'A'; j <= 'H'; j++) {
                System.out.printf("%d%c\n", i, j);
            }
        }
    }



    public static void main(String[] args) {
        // 初始化棋盘
        Board board = new Board();

        // 初始化玩家
        Player p1 = new Player("张三", 1, true);
        Player p2 = new Player("李四", 2, false);

        // 初始化提示和输入
        Hints.alert alert = new Hints.alert();
        Hints.prompt prompt = new Hints.prompt();

        // 游戏开始
        clearScreen();
//        loopAllPositions();
        board.printBoard(p1, p2);
        while (true) {
            if (board.isFinishGame()) {
                alert.gameOver();
                break;
            }

            Player inTurnPlayer = null; // 当前回合玩家
            if (p1.isInTurn()) {
                inTurnPlayer = p1;
            }
            if (p2.isInTurn()) {
                inTurnPlayer = p2;
            }

            assert inTurnPlayer != null;    // 断言当前回合玩家不为空
            String result = prompt.playerTurn(inTurnPlayer.getName());
            if (result.equals("-1")) {  // 输入q退出游戏
                break;
            }
            if (result.equals("0")) {   // 输入有误
                alert.invalidInput();
                continue;
            }

            // result = "0,A" -> x = 0, y = 'A'
            int x = Integer.parseInt(result.split(",")[0]);
            char y = result.split(",")[1].charAt(0);

            if (board.isPositionOccupied(x, y)) {   // 位置已有棋子
                alert.positionOccupied(String.format("%d%c", x + 1, y));
                continue;
            }

            // 落子
            board.setPiece(x, y, inTurnPlayer.getPieceCode());
            // 交换回合
            p1.setInTurn(!p1.isInTurn());
            p2.setInTurn(!p2.isInTurn());
            clearScreen();
            board.printBoard(p1, p2);
//            alert.positionWrong();
        }

    }
}
