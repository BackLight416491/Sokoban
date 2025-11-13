package model;

public class Level {
    // 游戏地图的基础布局（包含目标点和箱子）
    public int[][] map;
    // 玩家初始位置
    public Position playerStart;

    /**
     * 构造函数
     * @param map 游戏地图的基础布局（包含目标点和箱子）
     * @param playerStart 玩家初始位置
     */
    public Level(int[][] map, Position playerStart) {
        // 初始化关卡数据
        this.map = map;
        this.playerStart = playerStart;
    }
}