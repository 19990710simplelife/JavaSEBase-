package cn.simplelife.work._01_thread;

/**
 * @ClassName MyThread
 * @Description 使用继承创建线程
 * @Author simplelife
 * @Date 2022/8/3 11:17
 * @Version 1.0
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("mythread" + i);
        }
    }
}
