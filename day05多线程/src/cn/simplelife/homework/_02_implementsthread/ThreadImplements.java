package cn.simplelife.homework._02_implementsthread;

/**
 * @ClassName ThreadImplements
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 21:14
 * @Version 1.0
 */

public class ThreadImplements implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程启动了i=" + i);
        }
    }
}
