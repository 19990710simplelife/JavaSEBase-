package cn.simplelife.work._02_thread;

/**
 * @ClassName TicketDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 11:41
 * @Version 1.0
 */

public class TicketDemo {
    public static void main(String[] args) {
        TicketThread ticketThreadA = new TicketThread("A窗口");
        TicketThread ticketThreadB = new TicketThread("B窗口");
        TicketThread ticketThreadC = new TicketThread("C窗口");
        ticketThreadA.start();
        ticketThreadB.start();
        ticketThreadC.start();
    }
}
