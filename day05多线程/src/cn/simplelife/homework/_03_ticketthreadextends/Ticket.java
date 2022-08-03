package cn.simplelife.homework._03_ticketthreadextends;

/**
 * @ClassName Ticket
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 21:16
 * @Version 1.0
 */

public class Ticket extends Thread {
    private static int count = 5;

    public Ticket(String name) {
                super(name);
            }

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if (count > 0) {
                        count--;
                        System.out.println(super.getName() + "买了一张票，还剩" + count + "票");
                    }
        }
    }
}
