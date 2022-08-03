package cn.simplelife.work._04_join;

/**
 * @ClassName JoinDemo
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 20:04
 * @Version 1.0
 */

public class JoinThreadDemo extends Thread {

    public JoinThreadDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(super.getName() + "---" + i);
        }
    }
}
