package service;

import model.GameState;
import model.TileType;

public class MoveValidator {
    /*
     * 负责人: 
     * 功能: 校验玩家按方向移动的合法性
     * 内容：
     * 1. 计算 `(dx, dy)` 并定位前方格
     * 2. 若前方为墙：不可移动
     * 3. 若前方为空地/目标：可移动
     * 4. 若前方为箱子/箱子在目标：检查后方是否为空地/目标以允许推动
     * 异常与边界：
     * - 越界判定：任何越界都视为不可移动
     * 参数:
     * - state：当前游戏状态
     * - direction：0上/1下/2左/3右
     * 返回值:
     * - boolean：是否可以移动
     */
    public static boolean canMove(GameState state, int direction) {
        
        return true;
    }
}