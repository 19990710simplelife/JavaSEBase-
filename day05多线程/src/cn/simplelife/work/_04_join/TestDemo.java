package cn.simplelife.work._04_join;

/**
 * @ClassName TestDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:06
 * @Version 1.0
 */

public class TestDemo {
    public static void main(String[] args) {
        JoinThreadDemo a = new JoinThreadDemo("A");
        a.start();
        for (int i = 0; i < 10; i++) {
            // 主线程中调用join
            if (i == 2) {
                try {
                    a.join();
                } catch (InterruptedException e) {
                    System.out.println("出现异常了~");
                }
            }
            System.out.println("main" + i);
        }
    }
}
