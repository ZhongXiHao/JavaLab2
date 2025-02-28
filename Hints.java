import java.util.Objects;
import java.util.Scanner;
import java.util.regex.*;

import static java.lang.Integer.parseInt;

public class Hints {


    // 提示类
    public static class alert {
        public void positionOccupied(String position) {
            System.out.printf("[%s]已经有棋子了！%n", position);
        }

        public void positionWrong() {
            System.out.println("落子位置有误，请重新输入！");
        }

        public void gameOver() {
            System.out.println("棋盘已满！");
            System.out.println("游戏结束！");
        }

        public void invalidInput() {
            System.out.println("无效输入，请重新输入！");
        }
    }

    // 输入类
    public static class prompt {
        public String playerTurn(String playerName) {
            System.out.printf("请玩家[%s]输入落子位置：", playerName);
            Scanner scanner = new Scanner(System.in);
            String position = scanner.nextLine();
            System.out.println(position);
            if (Objects.equals(position, "q")) {
                return "-1";
            }


            //reg exp checks position, 1~8+A~H|a~h
            Pattern pattern = Pattern.compile("^[1-8][A-H|a-h]$");
            Matcher matcher = pattern.matcher(position);
            if (!matcher.matches()) {
                return "0";
            }

            final int x = parseInt(position.substring(0, 1)) - 1;   // 0~7
            final char y = position.charAt(1);  // A~H|a~h
            position = x + "," + y;
            return position;
        }
    }

}
