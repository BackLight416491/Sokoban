package service;

import model.GameState;
import model.TileType;

public class GameEngine {
    /*
     * 负责人: 
     * 功能: 玩家按方向尝试移动并更新状态
     * 内容：
     * 1. 根据方向计算位移 `(dx, dy)`
     * 2. 检查目标格：
     *    - 墙：移动失败
     *    - 空地/目标：玩家移动成功
     *    - 箱子/箱子在目标：检查箱子后方是否可推（空地/目标）
     * 3. 执行状态更新：
     *    - 更新玩家坐标与 `map`、必要时更新箱子位置
     *    - 维护步数计数 `state.steps++`（如有）
     * 4. 返回移动是否成功
     * 异常与边界：
     * - 越界访问需提前判断
     * - 保持 `base` 与 `map` 尺寸一致
     * 参数:
     * - state：当前游戏状态
     * - direction：0上/1下/2左/3右
     * 返回值:
     * - boolean：是否移动成功
     */
    public static boolean move(GameState state, int direction) {
        
        return true;
    }

    /*
     * 负责人: 
     * 功能: 判断当前关卡是否已完成
     * 内容：
     * 1. 遍历地图，统计未在目标点上的箱子
     * 2. 未完成箱子数为 0 则胜利
     * 异常与边界：
     * - 依赖 `base` 标记目标点，`map` 标记箱子与箱子在目标
     * 参数:
     * - state：当前游戏状态
     * 返回值:
     * - boolean：是否胜利
     */
    public static boolean isWin(GameState state) {
        
        return true;
    }
}