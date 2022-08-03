package cn.simplelife.work._03_myrun;

/**
 * @ClassName TicketDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 16:12
 * @Version 1.0
 */

public class TicketDemo implements Runnable {
    private int ticketCount = 5;

    @Override
    public void run() {
        // 假设窗口有10个人排队
        for (int i = 0; i < 10; i++) {
            if (this.ticketCount > 0) {
                this.ticketCount--;
                System.out.println(Thread.currentThread().getName() + "卖出一张票，还剩" + this.ticketCount + "张票！");
            }
        }
    }
}
