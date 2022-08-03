package cn.simplelife.work._01_thread;

/**
 * @ClassName ThreadDemo
 * @Description 多线程
 * @Author simplelife
 * @Date 2022/8/3 11:07
 * @Version 1.0
 */

public class ThreadDemo {
    public static void main(String[] args) {
        // 主线程
        // 在主线程中创建子线程
//        MyThread myThread = new MyThread();
//        // 启动子线程
//        myThread.start();

        // 创建线程
        MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main:" + i);
        }
    }
}
