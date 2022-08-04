package cn.simplelife.homework._06_tickets;

/**
 * @ClassName Tickets
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:03
 * @Version 1.0
 */

public class Tickets implements Runnable {

    private int count = 50;

    public synchronized void salayTicket() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.count > 0) {
            this.count--;
            System.out.println(Thread.currentThread().getName() + "卖出了一张票，还剩" + this.count + "张票");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.salayTicket();
        }
    }
}
