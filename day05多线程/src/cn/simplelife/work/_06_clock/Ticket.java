package cn.simplelife.work._06_clock;

/**
 * @ClassName Ticket
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:17
 * @Version 1.0
 */

public class Ticket implements Runnable {
    private int ticketCount = 50;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.ticketCount > 0) {
                    this.ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "卖出一张票，还剩" + this.ticketCount + "张票");
                }
            }
        }
    }
}
