package cn.simplelife.homework._09_demo03;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/4 10:47
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        ExpressThread expressThread = new ExpressThread();
        Thread threadA = new Thread(expressThread, "快递员A");
        Thread threadB = new Thread(expressThread, "快递员B");
        Thread threadC = new Thread(expressThread, "快递员C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
