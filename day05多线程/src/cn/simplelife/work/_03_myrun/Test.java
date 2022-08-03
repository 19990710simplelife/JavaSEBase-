package cn.simplelife.work._03_myrun;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 16:13
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        TicketDemo ticketDemoA = new TicketDemo();
        Thread threadA = new Thread(ticketDemoA, "窗口A");
        Thread threadB = new Thread(ticketDemoA, "窗口B");
        Thread threadC = new Thread(ticketDemoA, "窗口C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
