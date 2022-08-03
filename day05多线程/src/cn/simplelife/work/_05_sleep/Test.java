package cn.simplelife.work._05_sleep;

import cn.simplelife.work._03_myrun.TicketDemo;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:12
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        TicketThread ticketThread = new TicketThread();
        Thread threadA = new Thread(ticketThread, "A窗口");
        Thread threadB = new Thread(ticketThread, "B窗口");
        Thread threadC = new Thread(ticketThread, "C窗口");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
