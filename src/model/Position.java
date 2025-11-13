package model;

public class Position {
    // 位置的横坐标
    public int x;
    // 位置的纵坐标
    public int y;

    /*
     * 负责人: 刘航宇
     * 功能: 位置值对象
     * 内容：
     * 1. 记录坐标分量 `x`、`y`
     * 参数:
     * - x：横坐标
     * - y：纵坐标
     * 返回值:
     * - 无
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}