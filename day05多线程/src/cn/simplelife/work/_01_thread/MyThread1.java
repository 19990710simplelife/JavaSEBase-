package cn.simplelife.work._01_thread;

/**
 * @ClassName MyThread1
 * @Description 通过实现接口的方式实现创建线程
 * @Author simplelife
 * @Date 2022/8/3 11:30
 * @Version 1.0
 */

public class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("a--->" + i);
        }
    }
}
