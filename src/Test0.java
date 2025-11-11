import com.hx.HXCin; // 导入包

public class Test0 {
    public static void main(String[] args) {
        int cnt = 0;
        HXCin.listenBegin(); // 开始监听 (此时焦点在swing窗口, 您无法执行其他输入在其他窗口)
        while (true) {
            // 暂停
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 每秒打印一次
            if (++cnt == 5) {
                cnt = 0;
                System.out.println("---");
            }

            // 尝试获取字符 (若无字符则返回-1)
            char c = HXCin.tryGetChar();
            if (c != (char) -1) {
                if (c == 'q') {
                    break;
                }
                System.out.println(c);
            }
        }
        HXCin.listenEnd(); // 结束监听 (恢复焦点)

        // 注意, 因为有窗口的存在, 因此需要手动关闭窗口
        // 或者 使用 System.exit(0); 强制退出程序
        System.exit(0);
        // 否则会等待窗口事件
    }
}