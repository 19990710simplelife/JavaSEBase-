package cn.simplelife.work._02_thread;

/**
 * @ClassName TicketThread
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 11:41
 * @Version 1.0
 */

public class TicketThread extends Thread {
    private static int ticketCount = 5;

    public TicketThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 假设窗口有10个人排队
        for (int i = 0; i < 10; i++) {
            if (ticketCount > 0) {
                ticketCount--;
                System.out.println(super.getName() + "卖出一张票，还剩" + ticketCount + "张票！");
            }
        }
    }
}
