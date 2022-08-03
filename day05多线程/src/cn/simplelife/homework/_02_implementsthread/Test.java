package cn.simplelife.homework._02_implementsthread;

/**
 * @ClassName Test
 * @Description
 * @Author simplelife
 * @Date 2022/8/3 21:15
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        ThreadImplements threadImplements = new ThreadImplements();
        Thread thread=new Thread(threadImplements);
        thread.start();
    }
}
