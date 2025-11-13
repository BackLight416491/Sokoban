package model;

public class GameState {
    // 游戏地图的基础布局（包含目标点和箱子）
    public int[][] base;
    // 当前游戏地图状态（包含玩家和箱子）
    public int[][] map;
    // 玩家当前位置
    public Position player;
    // 当前关卡索引（从1开始）
    public int levelIndex;
    // 总关卡数
    public int totalLevels;
    // 玩家移动步数 
    public int steps;

    /*
     * 负责人: 刘航宇
     * 功能: 构造并初始化游戏状态
     * 内容：
     * 1. 记录基础层与动态层数组引用
     * 2. 设置玩家当前位置与关卡索引
     * 3. 设置总关卡数与步数初值为 0
     * 参数:
     * - base：基础层（墙/目标）
     * - map：动态层（玩家/箱子）
     * - player：玩家位置
     * - levelIndex：当前关卡索引
     * - totalLevels：总关卡数
     * 返回值:
     * - 无
     */
    public GameState(int[][] base, int[][] map, Position player, int levelIndex, int totalLevels) {
        // 初始化游戏状态
        this.base = base;
        this.map = map;
        this.player = player;
        this.levelIndex = levelIndex;
        this.totalLevels = totalLevels;
        this.steps = 0;
    }
}