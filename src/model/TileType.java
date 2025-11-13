package model;

public enum TileType {
    /**
     * empty 为空位置
     * wall 为墙
     * box 为箱子
     * goal 为目标点
     * player 为玩家
     * box_on_goal 为箱子在目标点上
     */
    EMPTY(0), WALL(1), BOX(2), GOAL(3), PLAYER(4), BOX_ON_GOAL(5);

    // 每个枚举值对应的整数代码
    public final int code;

    // 构造函数，初始化枚举值的整数代码
    TileType(int code) {
        this.code = code;
    }
}