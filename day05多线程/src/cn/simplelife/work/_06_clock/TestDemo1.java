package cn.simplelife.work._06_clock;

/**
 * @ClassName TestDemo1
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:25
 * @Version 1.0
 */

public class TestDemo1 {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        Thread threadA = new Thread(ticket1, "窗口A");
        Thread threadB = new Thread(ticket1, "窗口B");
        Thread threadC = new Thread(ticket1, "窗口C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
