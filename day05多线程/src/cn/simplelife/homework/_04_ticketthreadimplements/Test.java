package cn.simplelife.homework._04_ticketthreadimplements;


/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 21:23
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Ticket ticketA = new Ticket();
        Ticket ticketB = new Ticket();
        Ticket ticketC = new Ticket();
        Thread threadA = new Thread(ticketA, "窗口A");
        Thread threadB = new Thread(ticketB, "窗口B");
        Thread threadC = new Thread(ticketC, "窗口C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
