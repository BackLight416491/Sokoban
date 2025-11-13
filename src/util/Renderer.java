package util;

public class Renderer {
    /*
        负责人: 刘航宇
        功能: 将基础层与动态层映射为显示字符
        内容：
        1. 优先使用动态层符号（玩家/箱子/箱子在目标）
        2. 其次使用基础层符号（墙/目标）
        3. 其余情况显示空格
        映射规则：
        - dyn=4 → `☺` 玩家
        - dyn=5 → `☑` 箱子在目标
        - dyn=2 → `■` 箱子
        - base=1 → `#` 墙
        - base=3 → `○` 目标
        - 其它 → ' ' 空地
        异常与边界：
        - 非法编码按空地处理，保证渲染不抛异常
        参数:
            base: 基础层（墙/目标）
            dyn: 动态层（玩家/箱子）
        返回值:
            char（用于渲染的字符）
    */
    public static char toChar(int base, int dyn) {
        if (dyn == 4)
        {
            return '☺';
        }
        if (dyn == 5)
        {
            return '☑';
        }
        if (dyn == 2)
        {
            return '■';
        }
        if (base == 1)
        {
            return '#';
        }
        if (base == 3)
        {
            return '○';
        }
        return ' ';
    }
}