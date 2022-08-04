package cn.simplelife.homework._05_tickets;

import cn.simplelife.homework._03_ticketthreadextends.Ticket;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 9:56
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Tickets ticket = new Tickets();
        Thread threadA = new Thread(ticket, "窗口A");
        Thread threadB = new Thread(ticket, "窗口A");
        Thread threadC = new Thread(ticket, "窗口A");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
