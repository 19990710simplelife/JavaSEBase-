package cn.simplelife.homework._06_tickets;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:05
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        Thread threadA = new Thread(tickets, "窗口A");
        Thread threadB = new Thread(tickets, "窗口B");
        Thread threadC = new Thread(tickets, "窗口C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
