package cn.simplelife.homework._05_tickets;

/**
 * @ClassName Tickets
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 9:53
 * @Version 1.0
 */

public class Tickets implements Runnable {
    private int count = 50;

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                if (this.count > 0) {
                    this.count--;
                    System.out.println(Thread.currentThread().getName() + "卖出了一张票，还剩" + this.count + "张票");
                }
            }
        }
    }
}
