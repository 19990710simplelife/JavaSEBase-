package cn.simplelife.homework._03_ticketthreadextends;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 21:23
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Ticket ticketA = new Ticket("窗口A");
        Ticket ticketB = new Ticket("窗口B");
        Ticket ticketC = new Ticket("窗口C");
        ticketA.start();
        ticketB.start();
        ticketC.start();
    }
}
