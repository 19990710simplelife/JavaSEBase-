package cn.simplelife.work._05_sleep;

import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

/**
 * @ClassName TicketThread
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:09
 * @Version 1.0
 */

public class TicketThread implements Runnable {
    private int ticketCount = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (this.ticketCount >= 0) {
                try {
                    Thread.sleep(1000);
                    this.ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "卖出一张票，还剩" + this.ticketCount);
                } catch (InterruptedException e) {
                    System.out.println("出票失败");
                    e.printStackTrace();
                }
            }
        }
    }
}
