# Lab2 实验文档

[TOC]

## 源代码文件名称及其主要功能

1. `Player.java`： 定义玩家类，包含玩家的姓名、棋子代码和是否轮到该玩家的状态。

2. `Piece.java`：定义棋子类，包含棋子的代码和状态，并提供改变和转换棋子的方法。

3. `Board.java`：定义游戏的棋盘，包括网格和操作棋盘的方法。

4. `Hints.java`：提供用户交互和输入验证的提示和输入类。

5. `Main.java`：包含运行游戏的主方法，初始化棋盘并管理游戏循环。

## 关键代码及其设计思路

### `Player.java`

- 使用构造函数初始化玩家的姓名、棋子代码和是否轮到该玩家的状态。
- 提供获取玩家信息的方法，如`getName`、`getPieceCode`和`isInTurn`。
- 提供获取棋子状态的方法`getPieceStatus`，根据棋子代码返回相应的状态。
- 提供设置是否轮到该玩家的方法`setInTurn`。

### `Piece.java`

- 使用构造函数初始化棋子的代码和状态。
- 提供改变棋子的方法`changePiece`，将空棋改为黑或白。
- 提供转换棋子的方法`convertPiece`，将棋子从黑变白或从白变黑。（**暂未使用**）

### `Board.java`

- 使用构造函数初始化棋盘的大小，并将所有棋子初始化为空。
- 提供获取和设置棋子的方法`getPiece`和`setPiece`。
- 提供显示棋盘的方法`printBoard`，打印当前棋盘状态。
- 提供检查游戏是否结束的方法`isFinishGame`和检查位置是否被占用的方法`isPositionOccupied`。

### `Hints.java`

- 提供各种游戏状态和输入验证的提示方法。
- 提供获取玩家输入并验证的方法。

### `Main.java`

- 初始化棋盘和玩家。
- 设置示例游戏循环，展示棋盘状态并处理玩家回合。

## 运行过程截图及简单说明

* 进入游戏界面：

  ![74105478760](C:\Users\Xixi\AppData\Local\Temp\1741054787605.png)

* 成功落子：

  ![74105503918](C:\Users\Xixi\AppData\Local\Temp\1741055039181.png)

* 错误提示：

  ![74105501518](C:\Users\Xixi\AppData\Local\Temp\1741055015184.png)

  ![74105505812](C:\Users\Xixi\AppData\Local\Temp\1741055058121.png)
  ​
