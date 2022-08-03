package cn.simplelife.work._06_clock;

/**
 * @ClassName TestDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:20
 * @Version 1.0
 */

public class TestDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread threadA = new Thread(ticket, "窗口A");
        Thread threadB = new Thread(ticket, "窗口B");
        Thread threadC = new Thread(ticket, "窗口C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
