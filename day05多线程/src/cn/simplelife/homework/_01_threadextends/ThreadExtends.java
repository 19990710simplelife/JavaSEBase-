package cn.simplelife.homework._01_threadextends;

/**
 * @ClassName ThreadExtends
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 21:12
 * @Version 1.0
 */

public class ThreadExtends extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程启动了i = " + i);
        }
    }
}
