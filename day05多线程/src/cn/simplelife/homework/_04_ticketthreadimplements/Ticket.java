package cn.simplelife.homework._04_ticketthreadimplements;

/**
 * @ClassName Ticket
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 21:25
 * @Version 1.0
 */

public class Ticket implements Runnable {
    private int count = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (this.count > 0) {
                this.count--;
                System.out.println(Thread.currentThread().getName() + "买了一张票，还剩" + this.count + "票");
            }
        }
    }
}
